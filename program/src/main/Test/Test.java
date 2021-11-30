package Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) throws IOException {


        ModLinkedList ListHead = new ModLinkedList("",null);
        //store current node
        ModLinkedList cur_node=ListHead;

        cur_node.setContent("11");
        System.out.println(ListHead.getContent());


    }
}
