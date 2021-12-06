package Test;

import Account.*;
import DateAndObject.*;
//import DateAndObject.DateAndFood;
import OtherObjects.*;

import java.io.IOException;
import java.util.ArrayList;

public class TestFillInfo {
    public static void main(String[] args) throws IOException {
        ArrayList<DateAndFood> lista = new ArrayList<DateAndFood>();
        ArrayList<DateAndExercise> listb = new ArrayList<DateAndExercise>();

        ModDate birth = new ModDate(0,0,0);
        Account accounta = new Account("exampleuser2","abcd","",0,
                birth,lista,listb);


        accounta.FillInfo();
        System.out.println(accounta.getUsername());
        System.out.println(accounta.getPassword());
        System.out.println(accounta.getGender());
        System.out.println(accounta.getWeight());
        System.out.println(accounta.getBirthday());
        System.out.println(accounta.getFood_record());
        System.out.println(accounta.getExercise_record());
        //Success: the lines printed show that data is retrived from txt and stored
        // in the account instance



    }
}
