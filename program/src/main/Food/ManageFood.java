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
        while (sc.hasNextLine()){
            if (!line.equals("") & !line.equals("Milk & Dairy produce")
                    & !line.equals("Fats & Sugars") & !line.equals("Fruits & Vegetables")
                    & !line.equals("Meats & Fish") & !line.equals("Breads & Cereals")){
                if (line.equals(fd)){
                    sc.nextLine();
                    line = sc.nextLine();
                    return Double.parseDouble(line);
                }
            }
            line = sc.nextLine();
        }
        return null;
    }
}