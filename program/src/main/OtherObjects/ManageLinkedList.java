package OtherObjects;

import OtherObjects.ModLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManageLinkedList {

    public ManageLinkedList(){}

    public void scan_to_list(ModLinkedList node) throws FileNotFoundException {
        File text = new File("AccountData.txt");
        Scanner s = new Scanner(text);
        ModLinkedList curnode=node;
        while(s.hasNextLine()){
            curnode.setContent(s.nextLine());
            ModLinkedList NextNode= new ModLinkedList("",null);
            curnode.setNext(NextNode);
            curnode=NextNode;
        }
    }


}
