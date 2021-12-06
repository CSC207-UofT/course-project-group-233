package AnalysisAndRec;

import Account.Account;

import java.util.ArrayList;

// based on the users' age, gender and weight, give the suggestion for the users on exercise or the food.

public class Recommendation {

    public Recommendation(){}

    public ArrayList<String> recom_exercise(String gender, int age, double weight){
        ArrayList<String> recom = new ArrayList<String>();
        // the suggestion for the people who are above 60 years old (include 60).
        if(age >= 60){
            recom.add("Taichi");
            recom.add("Swimming");
            recom.add("Brisk Walking");
            recom.add("Strengthen Muscles");
            recom.add("Standing on one foot");
        }
        // the suggestion for the people who are between 40 and 60 years old (include 40 and exclude 60).
        if ((age >= 40) && (age < 60)){
            // for male
            if (gender.equals("m")){
                // for heavy weight male
                if (weight > 120.0){
                    recom.add("Walking slowly");
                    recom.add("Swimming");
                    recom.add("Brisk Walking");
                    recom.add("Strengthen Muscles");
                }
                // for normal weight male
                else{
                    recom.add("Badminton");
                    recom.add("Soccer");
                    recom.add("Biking");
                    recom.add("Table Tennis");
                    recom.add("Pool");
                }
            }
            // for female
            else{
                // for heavy weight female
                if (weight > 120.0){
                    recom.add("Walking slowly");
                    recom.add("Swimming");
                }
                // for light weight female
                if (weight < 60.0){
                    recom.add("Walking slowly");
                    recom.add("Swimming");
                    recom.add("Jogging");
                }
                // for normal weight female
                else{
                    recom.add("Dancing");
                    recom.add("Walking");
                    recom.add("Pool");
                    recom.add("Table Tennis");
                }
            }
        }
        // the suggestion for the people who are between 20 and 40
        if ((age > 20) && (age < 40)){
            if (gender.equals("m")){
                if (weight > 120.0){
                    recom.add("Walking slowly");

                }
                else{
                    recom.add("Weightlifting");
                    recom.add("Soccer");
                    recom.add("Biking");
                    recom.add("Table Tennis");
                    recom.add("Running");
                    recom.add("Basketball");
                    recom.add("Hiking");
                    recom.add("Badminton");

                }
            }
            else{
                if (weight > 120.0){
                    recom.add("Walking slowly");
                    return recom;
                }
                else{
                    recom.add("Swimming");
                    recom.add("Running");
                    recom.add("Yoga");
                    recom.add("Weightlifting");
                    recom.add("Dancing");
                    recom.add("Hiking");
                    recom.add("Badminton");

                }
            }
        }
        // the suggestion for the people who are less than 20 years old.
        if (age <= 20){
            if (gender.equals("m")){
                if(weight > 120.0) {
                    recom.add("Walking slowly");

                }
                else{
                    recom.add("Swimming");
                    recom.add("Running");
                    recom.add("Yoga");
                    recom.add("Weightlifting");
                    recom.add("Dancing");
                    recom.add("Hiking");
                    recom.add("Badminton");
                    recom.add("Soccer");
                    recom.add("Biking");
                    recom.add("Table Tennis");
                    recom.add("Basketball");
                    recom.add("Walking");
                    recom.add("pool");


                }
            }
            else{recom.add("Swimming");
                recom.add("Running");
                recom.add("Yoga");
                recom.add("Weightlifting");
                recom.add("Dancing");
                recom.add("Hiking");
                recom.add("Badminton");
                recom.add("Soccer");
                recom.add("Biking");
                recom.add("Table Tennis");
                recom.add("Basketball");
                recom.add("Walking");
                recom.add("pool");}
        }
        return recom;
    }

    // the food suggestions
    public ArrayList <String> recom_food(String gender, int age, double weight){
        ArrayList <String> recomd = new ArrayList <String> ();
        // the food suggestions for people who are less than 5 years old
        if (age < 5 ) {
            recomd.add("Milk");
            recomd.add("Blueberry");
        }
        // the age between 5 and 15
        else if ((5 < age) && (age <15)) {
            if(weight < 35.0){
                recomd.add("Milk");
                recomd.add("Blueberry");
                recomd.add("Beef");
                recomd.add("eggs");
                recomd.add("shrimp");
                recomd.add("snacks");
            }
            else{
                recomd.add("Milk");
                recomd.add("Blueberry");
                recomd.add("Beef");
                recomd.add("eggs");
                recomd.add("shrimp");
            }
        }
        //the age between 15 - 30
        else if ((15 < age) && (age <30)) {
            if(weight < 60.0){

                recomd.add("Milk");
                recomd.add("Blueberry");
                recomd.add("Beef");
                recomd.add("eggs");
                recomd.add("shrimp");
                recomd.add("Eggplant");
                recomd.add("Asparagus");
                recomd.add("snacks");

            }
            else{

                recomd.add("Milk");
                recomd.add("Blueberry");
                recomd.add("Beef");
                recomd.add("eggs");
                recomd.add("shrimp");

            }
        }
        //the age between 30 - 50
        else if ((30 < age) && (age < 50)) {
            if(weight < 65.0){

                recomd.add("Milk");
                recomd.add("Blueberry");
                recomd.add("eggs");
                recomd.add("shrimp");
                recomd.add("Eggplant");
                recomd.add("Asparagus");
                recomd.add("Red dates");

            }
            else{

                recomd.add("Milk");
                recomd.add("Blueberry");
                recomd.add("Beef");
                recomd.add("Eggs");
                recomd.add("Shrimp");
                recomd.add("Honey");
                recomd.add("Kelp");
                recomd.add("Mushrooms");

            }
        }
        // the age greater than 50
        else if ((50 > age)){
            if(weight < 65.0){

                recomd.add("Milk");
                recomd.add("Blueberry");
                recomd.add("Eggs");
                recomd.add("Shrimp");
                recomd.add("Oats");
                recomd.add("Apple");
                recomd.add("Nuts");
                recomd.add("Vitamin");

            }
            else{

                recomd.add("Milk");
                recomd.add("Blueberry");
                recomd.add("Beef");
                recomd.add("eggs");
                recomd.add("Spinach");
                recomd.add("Honey");
                recomd.add("Vitamin");
                recomd.add("Mushrooms");

            }
        }return recomd;
    }

    public String accinfoString(Account account){
        String gender;
        if(account.getGender().equals("m")){gender="male";}else {gender="female";}
        return ("You are a "+Integer.toString(account.getAge())+" years old "
                +gender+" weighing "+Double.toString(account.getWeight())+" kg");
    }





}