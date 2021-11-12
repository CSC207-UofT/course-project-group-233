import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class ManageAccount {
    /*This class will more focus on changing some account information if user need
     * */

    private Account current_account = null;
    private  ArrayList<Account> name;

    public ManageAccount() throws FileNotFoundException, ParseException {
        help_loading_file();
    }

    public String sign_up(String new_user, String word, Date birthday, String gender, double weight) throws IOException {
        // check the list of the username, if it has been created,notice to the user change another one
        // if list of username does not contain the user's input, then just add to the list of username
        // passcode will be also set by the step above.
        if(!this.name.isEmpty()){
            for(Account user : this.name){
                if(user.getName_for_user().equals(new_user)){
                    return "This username is created Try again!";
                }
            }
            Account new_account = new Account(word, new_user,Calendar.getInstance().getTime(), birthday, gender,
                    weight);
            this.name.add(new_account);
            this.current_account = new_account;
        }else{
            Account new_account = new Account(word, new_user,Calendar.getInstance().getTime(), birthday, gender,
                    weight);
            this.name.add(new_account);
            this.current_account = new_account;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter ("/src/main/database/AccountData",
                true));
        writer.append(new_user).append("\n");
        writer.append(word).append("\n");
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
        String date = df.format(Calendar.getInstance().getTime());
        writer.append(date).append("\n");
        String birth = df.format(birthday);
        writer.append(birth).append("\n");
        writer.append(gender).append("\n");
        writer.append(Double.toString(weight)).append("\n");
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
            //Double temp1 = this.current_account.getCalorie_record().get(index) + mf.GetCalorie(fd);
            //this.current_account.getCalorie_record().add(temp1);
        }
        else {
            ArrayList<String> fd_temp = new ArrayList<>();
            fd_temp.add(fd);
            this.current_account.getDate_record().add(temp);
            this.current_account.getFood_record().add(fd_temp);
            //this.current_account.getCalorie_record().add(mf.GetCalorie(fd));
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
            String weight = reading.nextLine();

            String temp = reading.nextLine();
            ArrayList<String> date_record = new ArrayList<>();
            ArrayList<ArrayList<String>> food = new ArrayList<>();
            ArrayList<ArrayList<Double>> heave = new ArrayList<>();
            while(! temp.equals("\n")){
              String date1 = temp;
              SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
              String[] str = date1.split("!");
              String[] str2 = str[1].split(",");

              ArrayList<String> one_day_food = new ArrayList<>();
              ArrayList<Double> one_day_weight = new ArrayList<>();

              for(String item : str2){
                  String[] str3 = item.split("-");
                  one_day_food.add(str3[0]);
                  one_day_weight.add(Double.parseDouble(str3[1]));
              }
              food.add(one_day_food);
              heave.add(one_day_weight);
              date_record.add(str[0]);
              temp = reading.nextLine();
            }
        }
    }


}

