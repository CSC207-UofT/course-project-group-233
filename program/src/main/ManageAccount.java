import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ManageAccount {
    /*This class will more focus on changing some account information if user need
     * */

    private Account current_account = null;
    private  ArrayList<Account> name;

    public ManageAccount() throws FileNotFoundException, ParseException {
        help_loading_file();
    }

    public String sign_up(String new_user, String word, Date birthday, String gender){
        // check the list of the username, if it has been created,notice to the user change another one
        // if list of username does not contain the user's input, then just add to the list of username
        // passcode will be also set by the step above.
        if(!this.name.isEmpty()){
            for(Account user : this.name){
                if(user.getName_for_user().equals(new_user)){
                    return "This username is created Try again!";
                }
            }
            Account new_account = new Account(word, new_user,Calendar.getInstance().getTime(), birthday, gender);
            this.name.add(new_account);
            this.current_account = new_account;
        }else{
            Account new_account = new Account(word, new_user,Calendar.getInstance().getTime(), birthday, gender);
            this.name.add(new_account);
            this.current_account = new_account;
        }
        return "Account has been successfully created! Welcome!";
    }

    public String changePassword (String new_code) {
        // if user wants to change pass code, then provide new pass word and account info to change it
        this.current_account.setPassword(new_code);
        return "Password has been changed!";
    }

    public void update_food_record(Calendar date, String fd, ManageFood mf) {
        //add food eaten at certain date(key) to the HashMap
        String temp = ((Integer) date.get(Calendar.YEAR)).toString() + ',' +
                (date.get(Calendar.MONTH)) + ',' +
                (date.get(Calendar.DAY_OF_MONTH)); // turn date into a string representing date
        if (this.current_account.getDate_record().contains(temp)) {
            int index = this.current_account.getDate_record().indexOf(temp);
            this.current_account.getFood_record().get(index).add(fd);//only add fd into inner ArrayList in food_record
            Double temp1 = this.current_account.getCalorie_record().get(index) + mf.GetCalorie(fd);
            this.current_account.getCalorie_record().add(temp1);
        }
        else {
            ArrayList<String> fd_temp = new ArrayList<>();
            fd_temp.add(fd);
            this.current_account.getDate_record().add(temp);
            this.current_account.getFood_record().add(fd_temp);
            this.current_account.getCalorie_record().add(mf.GetCalorie(fd));
        }
    }

    public String changeUsername (String new_name) {
        for (Account i : this.name) {
            if (i.getName_for_user().equals(new_name)) {
                return "This username has been used. Please try another one.";
            }
        }
        this.current_account.setUsername(new_name);
        return "Your username has successfully changed.";
    }

    public String sign_in(String name_of_user, String passcode){
        // this method will return a string to notify whether the user logging their account
        // by giving username and passcode
        for (Account user : this.name){
            if(user.getName_for_user().equals(name_of_user) && user.getPassword().equals(passcode)){
                this.current_account = user;
                return "Welcome!";
            }
        }return "This passcode or username is incorrect! Try again!";
    }

    public String toString() {
        if (current_account != null) {
            return (current_account.getName_for_user() + "'s account created in " + current_account.getDate()
            + ". The user's birthday is " + current_account.getBirthday() + " and user's gender is " +
                    current_account.getGender());
        }
        return null;
    }

    public Account getCurrent_account() {
        return this.current_account;
    }
    public void setCurrent_account(Account user1){
        this.current_account = user1;
    }

    public void help_loading_file() throws FileNotFoundException, ParseException {
        File my_file = new File("AccountData.txt");
        Scanner reading = new Scanner(my_file);
        while (reading.hasNextLine()) {
            String username = reading.nextLine();
            String password = reading.nextLine();
            String creating = reading.nextLine();
            String birthday = reading.nextLine();
            String gender = reading.nextLine();
            String login_day = reading.nextLine();
            String food = reading.nextLine();
            String calories = reading.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
            Date birth_day = dateFormat.parse(birthday);
            Date creating_date = dateFormat.parse(creating);

            Account user = new Account(password, username, creating_date, birth_day, gender);
            String[] str = login_day.split(",");
            List<String> log_in_day = new ArrayList<String>();
            log_in_day = Arrays.asList(str);

            str = food.split(",");
            List<String> food_list = new ArrayList<String>();
            food_list = Arrays.asList(str);

            str = calories.split(",");
            List<String> calories_list = new ArrayList<String>();
            calories_list = Arrays.asList(str);
            reading.nextLine();
        }
    }
}

