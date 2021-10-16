import java.util.*;


public class ManageAccount {
    /*This class will more focus on changing some account information if user need
     * */

    private Account current_account = null;
    private List<Account> name;

    public ManageAccount() {
        this.name = new ArrayList<>();
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
            return "Account has been created! Welcome!";
        }else{
            Account new_account = new Account(word, new_user,Calendar.getInstance().getTime(), birthday, gender);
            this.name.add(new_account);
            return "Account has been created! Welcome!";
        }
    }

    public String changePassword (String new_code, Account useraccount) {
        // if user wants to change pass code, then provide new pass word and account info to change it
        useraccount.setPassword(new_code);
        return "Password has been changed!";
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
}

