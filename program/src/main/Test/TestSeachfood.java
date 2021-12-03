package Test;

import Food.ManageFood;
import OtherObjects.ModLinkedList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TestSeachfood {

    public static void main(String[] args) throws IOException {
        ManageFood foodman = new ManageFood();
        //System.out.println(foodman.searchFood("c"));
        File text = new File("testfood.txt");
        Scanner s = new Scanner(text);

        ModLinkedList head = new ModLinkedList("",null);
        ModLinkedList cur_node = head;
        String line= s.nextLine();
        ArrayList<String> a = new ArrayList<>();
        while(s.hasNextLine()){
            if(!Objects.equals(line, "") & !Objects.equals(line, "Milk & Dairy produce")
            & !Objects.equals(line, "Fats & Sugars") & !Objects.equals(line, "Fruits & Vegetables")
            & !Objects.equals(line, "Meats & Fish") & !Objects.equals(line, "Breads & Cereals")){
                a.add(line);
            }else{line=s.nextLine();}
        }
        FileWriter fw= new FileWriter(text);
        PrintWriter pw = new PrintWriter(fw);
        for(String i :a){
           pw.println(i);
        }
        pw.close();
        //System.out.println(line);

    }
}
