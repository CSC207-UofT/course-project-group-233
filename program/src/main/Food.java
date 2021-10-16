import java.util.ArrayList;

public class Food {
    Float calorie;
    String name;
    String kind;
    Float weight;
    //ArrayList<String> KindList = new ArrayList<String>();


    public Food(String name, String kind,Float weight){

        this.name=name;
        this.kind=kind;
        this.weight=weight;
    }

    public Float GetCalorie(){
        ManageFood Data= new ManageFood();//Get an instance of the database
        Float CalPerGram =Data.CaloriePerGram.get(this.name);
        this.calorie=CalPerGram*this.weight;
        return this.calorie;
    }

    //still to be implemented, don't use
//    public  ArrayList<String> GetClosest(String word, ArrayList<String> wordlist){
//        ArrayList<String> result = new ArrayList<String>();
//        ArrayList<Integer> similarity = new ArrayList<Integer>();
//        for(int i=0;i<=word.length();i++){
//
//        }
//    }

    //still to be implemented, don't use
//    public String DetermineKind(){
//        //String result;
//        String result="";
//        return result;
//    }



}