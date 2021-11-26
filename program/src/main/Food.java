
public class Food {
    private final String name;
    private final String kind;
    //private final Double calorie_per_gram;
    //ArrayList<String> KindList = new ArrayList<String>();

    public Food(String name, String kind,
                Double calorie_per_gram
    ){

        this.name=name;
        this.kind=kind;
        //this.calorie_per_gram = calorie_per_gram;
    }

    public String getName() {return this.name;}

    public String getKind() {return this.kind;}

    //public Double getCalorie_per_gram() {return this.calorie_per_gram;}
}