import java.util.ArrayList;


public class ComplexFood extends Food{

    ArrayList<Food> element;//a list of basic food that the complex food is made of

    public ComplexFood( String n, String k,Float w, ArrayList<Food> FoodList){
        super(n,k,w);
        this.element=FoodList;

    }

}
