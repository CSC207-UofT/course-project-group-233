import java.util.HashMap;

public class ManageFood {
    HashMap<String,Food> FoodData= new HashMap<String,Food>();//store the name and corresponding food
    HashMap<String,Float> CaloriePerGram= new HashMap<String,Float>();//store names of food and its calorie per gram

    public ManageFood(){
        //below is the entries of FoodData, still to be implemented
        Food Fries= new Food("Fries", "Fast Food", (float) 71);
        FoodData.put("Fries",Fries);

        ////////////////////////////////////
        ///////////////////////////////////
        //below is the entries of CaloriePerGram, still to be implemented
        this.CaloriePerGram.put("Fries",(float)3.12);

    }
    public Food GetFood(String name){
        return this.FoodData.get(name);
    }

    public Float SeeCal(String name){
        return GetFood(name).GetCalorie();

    }

}