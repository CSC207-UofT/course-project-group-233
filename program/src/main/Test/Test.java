package Test;

import OtherObjects.*;
//import OtherObjects.ModLinkedList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) throws IOException {


        ModLinkedList ListHead = new ModLinkedList("",null);
        ModLinkedList aa = new ModLinkedList("",ListHead);
        //store current node
        ModLinkedList cur_node=ListHead;
        ModLinkedList bb=cur_node;
        bb.setContent("2");
        ModDate date1=new ModDate(1,1,1);
        ModDate date2=new ModDate(1,2,1);
        //cur_node.setContent("11");
        //System.out.println(ListHead.getContent());
        //System.out.println(aa.getNext().getContent());
        //System.out.println(date1.isEqual(date2));
        File text = new File("FoodData.txt");
        Scanner s = new Scanner(text);
        //s.nextLine();
        //System.out.println(s.nextLine().charAt(0));
        System.out.println(s.nextLine()=="");
    }
}
