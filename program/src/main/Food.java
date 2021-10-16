import java.util.ArrayList;
import java.util.Objects;

public class Food {
    private String name;
    private String kind;
    private Double weight;
    //ArrayList<String> KindList = new ArrayList<String>();


    public Food(String name, String kind,Double weight){

        this.name=name;
        this.kind=kind;
        this.weight=weight;
    }

    public String getName() {return this.name;}

    public String getKind() {return this.kind;}

    public Double getWeight() {return this.weight;}

    public boolean equals(Food fd) {
        return (Objects.equals(this.name, fd.name)) &&
                (Objects.equals(this.kind, fd.kind)) &&
                (Objects.equals(this.weight, fd.weight));
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