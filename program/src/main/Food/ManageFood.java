package Food;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ManageFood {
    public ManageFood(){}

    public ArrayList<String> searchFood(String name) throws FileNotFoundException {
        ArrayList<String> result = new ArrayList<String>();
        File text = new File("FoodData.txt");
        Scanner s = new Scanner(text);
        String line = s.nextLine();
        while(s.hasNextLine()){
            if (line !=""){
                    if(Character.toLowerCase(name.charAt(0))==Character.toLowerCase(line.charAt(0))){
                result.add(line);
            }
            else{line=s.nextLine();}
            }
            else{line=s.nextLine();}
        }
        return result;
    }

    public Double getCalorie_Per_Gram(String fd) throws FileNotFoundException {
        File text = new File("FoodData.txt");
        Scanner sc = new Scanner(text);
        String line = sc.nextLine();
        double result=0.0;
        while (sc.hasNextLine()){
            if (!line.equals("") & !line.equals("Milk & Dairy produce")
                    & !line.equals("Fats & Sugars") & !line.equals("Fruits & Vegetables")
                    & !line.equals("Meats & Fish") & !line.equals("Breads & Cereals")){
                if (line.equals(fd)){
                    sc.nextLine();
                    line = sc.nextLine();
                    result= Double.parseDouble(line);
                    break;
                }
                else{if(sc.hasNextLine()){line=sc.nextLine();}else{break;}}
            }
            else{if(sc.hasNextLine()){line=sc.nextLine();}else{break;}}
        }
        return result;
    }

    public boolean has_food(String name) throws FileNotFoundException {
        File text = new File("FoodData.txt");
        Scanner s = new Scanner(text);
        boolean has_food=false;
        String line=s.nextLine();
        while(s.hasNextLine()) {
            if(!line.equals("") & !line.equals("Milk & Dairy produce")
                    & !line.equals("Fats & Sugars") & !line.equals("Fruits & Vegetables")
                    & !line.equals("Meats & Fish") & !line.equals("Breads & Cereals")){
            if (line.equals(name)) {
                has_food = true;
                break;
            } else {
                line=s.nextLine();}
            }else{if(s.hasNextLine()){line=s.nextLine();}else{break;}}

        }return has_food;
    }

    public Double getTotalCal(Food food) throws FileNotFoundException {
        double calpergram=this.getCalorie_Per_Gram(food.getName());
        return food.getWeight()*calpergram;
    }




}