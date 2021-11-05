import java.util.ArrayList;
import java.util.HashMap;

public class ManageFood {
    HashMap<String, Food> FoodData;//store the name and corresponding food

    public ManageFood(){
        HashMap<String, Food> food_data = new HashMap<>();
    }
    public void update_food(String food, String kind, double weight, double calo_per_gram) {
           Food fd = new Food(food, kind, weight, calo_per_gram);
           this.FoodData.put(food,fd);
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

    public Food GetFood(String name){
        return this.FoodData.get(name);
    }
}