import java.util.HashMap;

public class ManageFood {
    HashMap<String,Food> FoodData= new HashMap<String,Food>();//store the name and corresponding food
    HashMap<String,Double> CaloriePerGram= new HashMap<String,Double>();//store names of food and its calorie per gram

    public ManageFood(){
        //below is the entries of FoodData, still to be implemented
        Food Fries= new Food("Fries", "Fast Food",  (double) 71);
        FoodData.put("Fries",Fries);

        ////////////////////////////////////
        ///////////////////////////////////
        //below is the entries of CaloriePerGram, still to be implemented
        this.CaloriePerGram.put("Fries", 3.12);

    }
    public Food GetFood(String name){
        return this.FoodData.get(name);
    }

    public void update_food(String food, String kind, double weight, double calo_per_gram) {
        Food fd = new Food(food, kind,weight);
        this.FoodData.put(food,fd);
        this.CaloriePerGram.put(food,calo_per_gram);
    }

    public Double GetCalorie(String fd){
        Double CalPerGram = this.CaloriePerGram.get(fd);
        return CalPerGram * FoodData.get(fd).getWeight();
    }

}