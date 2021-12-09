package Account;

import DateAndObject.*;
import OtherObjects.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageAccount {

    public ManageAccount(){}

    public boolean scan_has_account(String username) throws FileNotFoundException {
        File text = new File("AccountData.txt");
        Scanner s = new Scanner(text);
        boolean has_user=false;
        String line=s.nextLine();
        while(s.hasNextLine()){
            if(line.equals("*user")){
                line=s.nextLine();
                if(line.equals(username)){has_user=true;}
            }
            else {line=s.nextLine();}
        }
        return has_user;
    }

    public Account creatEmptyAcc(){
        ArrayList<DateAndFood> food_list = new ArrayList<DateAndFood>();
        ArrayList<DateAndExercise> exercise_list = new ArrayList<DateAndExercise>();
        ModDate birth = new ModDate(0,0,0);
        return new Account("","","m",0,
                birth,food_list,exercise_list);
    }

    public boolean login(String username, String passward) throws FileNotFoundException {
        File text = new File("AccountData.txt");
        Scanner s = new Scanner(text);
        boolean login_success=false;
        String line=s.nextLine();
        while(s.hasNextLine()){
            if(line.equals("*user")){
                line=s.nextLine();
                if(line.equals(username)&s.nextLine().equals(passward)){login_success=true;}
            }
            else {line=s.nextLine();}
        }
        return login_success;

    }

    public boolean isInt(String str) {
        try {
            @SuppressWarnings("unused")
            int x = Integer.parseInt(str);
            return true; //String is an Integer
        } catch (NumberFormatException e) {
            return false; //String is not an Integer
        }
    }

    public boolean isDouble(String str) {
        try {
            @SuppressWarnings("unused")
            Double x = Double.parseDouble(str);
            return true; //String is an double
        } catch (NumberFormatException e) {
            return false; //String is not an double
        }
    }
}
