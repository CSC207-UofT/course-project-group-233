package AnalysisAndRec;

import java.util.ArrayList;
import java.util.Objects;

public class Recommendation {

    public Recommendation(){}

    public ArrayList<String> recom_exercise(String gender, int age, double weight){
        ArrayList<String> recom = new ArrayList<String>();
        if(age > 60){
            recom.add("Taichi");
            recom.add("Swimming");

        }

        if ((age > 40) && (age < 60)){
            if (gender.equals("m")){
                if (weight > 120.0){
                    recom.add("Walking slowly");

                }
                else{
                    recom.add("Badminton");
                    recom.add("Soccer");
                    recom.add("Biking");
                    recom.add("Table Tennis");
                    recom.add("Pool");

                }
            }
            else{
                if (weight > 120.0){
                    recom.add("Walking slowly");

                }
                else{
                    recom.add("Dancing");
                    recom.add("Walking");
                    recom.add("Pool");
                    recom.add("Table Tennis");
                }
            }
        }
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


    public ArrayList <String> recom_food(String gender, int age, double weight){
        ArrayList <String> recomd = new ArrayList <String> ();
        if (age < 5 ) {

            recomd.add("Milk");
            recomd.add("Blueberry");

        }
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
        else if ((50 < age)){
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
}