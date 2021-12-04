package AnalysisAndRec;

import Account.*;
import DateAndObject.DateAndFood;
import Food.ManageFood;

import java.io.FileNotFoundException;

public class Analyses {
    public Analyses(){}

    public String foodrectoString(Account account) throws FileNotFoundException {
        ManageFood foodman = new ManageFood();
        String result="";
        for(DateAndFood i : account.getFood_record()){
            result+=("On "+i.getDate().beString()+"you had: "+i.getFood().getName()
                     +Double.toString(i.getFood().getWeight())+"g "+"Calorie per gram: "+
                    Double.toString(foodman.getCalorie_Per_Gram(i.getFood().getName()))+
                    "Total Calorie: "+Double.toString(foodman.getTotalCal(i.getFood()))+"\n");


        }
        return result;
    }

}