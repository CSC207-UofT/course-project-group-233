package AnalysisAndRec;

import Account.*;
import DateAndObject.DateAndExercise;
import DateAndObject.DateAndFood;
import Exercise.ManageExercise;
import Food.ManageFood;

import java.io.FileNotFoundException;

public class Analyses {
    public Analyses(){}

    public String foodrectoString(Account account) throws FileNotFoundException {
        ManageFood foodman = new ManageFood();
        String result="";
        for(DateAndFood i : account.getFood_record()){
            result+=("On "+i.getDate().beString()+" you had:  "+i.getFood().getName()
                     +"  "+Double.toString(i.getFood().getWeight())+"g "+"Calorie per gram: "+
                    Double.toString(foodman.getCalorie_Per_Gram(i.getFood().getName()))+
                    "Total Calorie: "+Double.toString(foodman.getTotalCal(i.getFood()))+"\n");


        }
        return result;
    }

    public String exrecToString(Account account,double weight) throws FileNotFoundException {
        ManageExercise exman= new ManageExercise();
        String result="";
        for(DateAndExercise i : account.getExercise_record()){
            result+=("On "+i.getDate().beString()+" you did:  "+i.getExercise().getName()
                    +"  "+Double.toString(i.getExercise().getTime())+"  minutes. "+
                    "Total Calorie Burned: "+
                    Double.toString(exman.getTotalExCal(i.getExercise(),weight ))+"\n");


        }
        return result;
    }

}