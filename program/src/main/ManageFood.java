//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class ManageFood {
//    HashMap<String, Food> FoodData;//store the name and corresponding food
//
//    public ManageFood() throws FileNotFoundException {
//        HashMap<String, Food> food_data = new HashMap<>();
//        File file = new File("/src/main/database/FoodData.txt");
//        Scanner scanner = new Scanner(file);
//        while(scanner.hasNextLine()){
//            String food_name = scanner.nextLine().strip();
//            String food_kind = scanner.nextLine().strip();
//            String food_calorie = scanner.nextLine().strip();
//            Food new_food = new Food(food_name,
//                                    food_kind,
//                                    Double.parseDouble(food_calorie));
//            food_data.put(food_name, new_food);
//            scanner.nextLine();
//        }
//    }
//
//    public void update_food(String food, String kind, double calo_per_gram) {
//           Food fd = new Food(food, kind, calo_per_gram);
//           this.FoodData.put(food,fd);
//    }
//
//    public Double GetCaloriePerGram(String fd){
//        return this.FoodData.get(fd).getCalorie_per_gram();
//    }
//
//    public ArrayList<String> food_list() {
//        return new ArrayList<>(this.FoodData.keySet());
//    }
//
//    public Food GetFood(String name){
//        return this.FoodData.get(name);
//    }
//}