package Test;

import OtherObjects.ModLinkedList;

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

        //cur_node.setContent("11");
        //System.out.println(ListHead.getContent());
        System.out.println(aa.getNext().getContent());


    }
}
