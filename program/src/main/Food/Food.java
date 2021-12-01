package Food;

public class Food {
    private  String name;
    private  double weight;
    //private final Double calorie_per_gram;
    //ArrayList<String> KindList = new ArrayList<String>();

    public Food(String name, double weight
    ){

        this.name=name;
        this.weight=weight;
        //this.calorie_per_gram = calorie_per_gram;
    }

    public String getName() {return this.name;}

    public double getWeight() {
        return this.weight;
    }

    //public Double getCalorie_per_gram() {return this.calorie_per_gram;}

    public void setName(String name){this.name=name;}

    public void setWeight(double weight) {
        this.weight = weight;
    }
}