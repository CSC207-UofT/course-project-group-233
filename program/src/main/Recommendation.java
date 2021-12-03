import java.util.ArrayList;

public class Recommendation {

    public ArrayList<String> recom_exercise(String gender, int age, double weight){
        if(age > 60){
            ArrayList<String> recom = new ArrayList<String>();
            recom.add("Taichi");
            recom.add("Swimming");
            return recom;
        }

        if ((age > 40) && (age < 60)){
            if (gender == "m"){
                if (weight > 80.0){
                    ArrayList<String> recom = new ArrayList<String>();
                    recom.add("Walking slowly");
                    return recom;
                }
                else{
                    ArrayList<String> recom = new ArrayList<String>();
                    recom.add("Badminton");
                    recom.add("Soccer");
                    recom.add("Biking");
                    recom.add("Table Tennis");
                    recom.add("pool");
                    return recom;
                }
            }
            else{
                if (weight > 80.0){
                    ArrayList<String> recom = new ArrayList<String>();
                    recom.add("Walking slowly");
                    return recom;
                }
                else{
                    ArrayList<String> recom = new ArrayList<String>();
                    recom.add("Dancing");
                    recom.add("Walking");
                    recom.add("pool");
                    return recom;
                }
            }
        }
        if ((age > 20) && (age < 40)){
            if (gender == "m"){
                if (weight > 80.0){
                    ArrayList<String> recom = new ArrayList<String>();
                    recom.add("Walking slowly");
                    return recom;
                }
                else{
                    ArrayList<String> recom = new ArrayList<String>();
                    recom.add("Weightlifting");
                    recom.add("Soccer");
                    recom.add("Biking");
                    recom.add("Table Tennis");
                    recom.add("Running");
                    recom.add("Basketball");
                    recom.add("Hiking");
                    recom.add("Hiking");
                    recom.add("Badminton");
                    return recom;
                }
            }
            else{
                if (weight > 80.0){
                    ArrayList<String> recom = new ArrayList<String>();
                    recom.add("Walking slowly");
                    return recom;
                }
                else{
                    ArrayList<String> recom = new ArrayList<String>();
                    recom.add("Swimming");
                    recom.add("Running");
                    recom.add("Yoga");
                    recom.add("Weightlifting");
                    recom.add("Dancing");
                    recom.add("Hiking");
                    recom.add("Badminton");
                    return recom;
                }
            }
        }
    }


    public String recom_food(String gender, int age, double weight){

    }
}