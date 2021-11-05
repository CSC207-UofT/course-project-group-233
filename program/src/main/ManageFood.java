import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ManageFood {
    HashMap<String, Food> FoodData;//store the name and corresponding food

    public ManageFood() throws FileNotFoundException {
        HashMap<String, Food> food_data = new HashMap<>();
        File file = new File("/database/FoodData.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String food_name = scanner.nextLine().strip();
            String food_kind = scanner.nextLine().strip();
            String food_weight = scanner.nextLine().strip();
            String food_calorie = scanner.nextLine().strip();
            Food new_food = new Food(food_name,
                                    food_kind,
                                    Double.parseDouble(food_weight),
                                    Double.parseDouble(food_calorie));
            food_data.put(food_name, new_food);
            scanner.nextLine();
        }
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