package Test;

import Account.Account;
import DateAndObject.DateAndExercise;
import DateAndObject.DateAndFood;
import OtherObjects.ModDate;

import java.io.IOException;
import java.util.ArrayList;


public class TestRegister {
    public static void main(String[] args) throws IOException {
        ArrayList<DateAndFood> lista = new ArrayList<DateAndFood>();
        ArrayList<DateAndExercise> listb = new ArrayList<DateAndExercise>();
        ModDate birth = new ModDate(2021,1,1);
        Account accounta = new Account("exampleuser2","a","m",1,
                birth,lista,listb);


        accounta.register();

        //The result is correct and appeared in the txt file


    }
}
