import java.util.ArrayList;
import java.util.Objects;

public class Recommendation {

    public ArrayList<String> recom_exercise(String gender, int age, double weight){
        ArrayList<String> recom = new ArrayList<String>();
        if(age > 60){
            recom.add("Taichi");
            recom.add("Swimming");
            return recom;
        }

        if ((age > 40) && (age < 60)){
            if (Objects.equals(gender, "m")){
                if (weight > 80.0){
                    recom.add("Walking slowly");
                    return recom;
                }
                else{
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
                    recom.add("Walking slowly");
                    return recom;
                }
                else{
                    recom.add("Dancing");
                    recom.add("Walking");
                    recom.add("pool");
                    return recom;
                }
            }
        }
        if ((age > 20) && (age < 40)){
            if (Objects.equals(gender, "m")){
                if (weight > 80.0){
                    recom.add("Walking slowly");
                    return recom;
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
                    return recom;
                }
            }
            else{
                if (weight > 80.0){
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
                    return recom;
                }
            }
        }
        if (age <= 20){
            if (Objects.equals(gender,"m")){
                if(weight > 80.0) {
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
                    recom.add("Soccer");
                    recom.add("Biking");
                    recom.add("Table Tennis");
                    recom.add("Basketball");
                    recom.add("Walking");
                    recom.add("pool");
                    return recom;

                }
            }
        }
        return recom;
    }


    public String recom_food(String gender, int age, double weight){

    }
}