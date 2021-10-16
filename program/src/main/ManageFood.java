import java.util.ArrayList;
import java.util.HashMap;

public class ManageFood {
    HashMap<String,Food> FoodData= new HashMap<>();//store the name and corresponding food

    public ManageFood(){
        //below is the entries of FoodData, still to be implemented
        Food Fries= new Food("Fries", "Fast Food",  (double) 71, 3.12);
        FoodData.put("Fries",Fries);

        ////////////////////////////////////
        ///////////////////////////////////
        //below is the entries of CaloriePerGram, still to be implemented

    }

    public void change_food_weight(String food, double weight) {
        this.FoodData.get(food).setWeight(weight);
    }

    public Double GetCalorie(String fd){
        Double CalPerGram = this.FoodData.get(fd).getCalorie_per_gram();
        return CalPerGram * FoodData.get(fd).getWeight();
    }

    public ArrayList<String> food_list() {
        return new ArrayList<>(this.FoodData.keySet());
    }
}