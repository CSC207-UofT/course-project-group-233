
public class Food {
    private final String name;
    private final String kind;
    private Double weight;
    private final Double calorie_per_gram;
    //ArrayList<String> KindList = new ArrayList<String>();

    public Food(String name, String kind,Double weight, Double calorie_per_gram){

        this.name=name;
        this.kind=kind;
        this.weight=weight;
        this.calorie_per_gram = calorie_per_gram;
    }

    public String getName() {return this.name;}

    public String getKind() {return this.kind;}

    public Double getWeight() {return this.weight;}

    public void setWeight(Double weight) {this.weight = weight;}

    public Double getCalorie_per_gram() {return this.calorie_per_gram;}
}