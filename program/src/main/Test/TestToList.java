package Test;

import OtherObjects.ModLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestToList {

    public static void main(String[] args) throws FileNotFoundException {

        File text = new File("AccountData.txt");
        ModLinkedList ListHead = new ModLinkedList("",null);
        //store current node
        ModLinkedList cur_node=ListHead;
        Scanner s = new Scanner(text);
        //put all lines in txt into linkedlist
        while(s.hasNextLine()){
            cur_node.setContent(s.nextLine());
            ModLinkedList next_node = new ModLinkedList("",null);
            cur_node.setNext(next_node);
            cur_node=next_node;
        }
        cur_node=ListHead;
        while(cur_node.getNext()!=null){
            System.out.println(cur_node.getContent());
            cur_node=cur_node.getNext();
        }
        //Result:successfully printed all lines in the txt file
    }
}
