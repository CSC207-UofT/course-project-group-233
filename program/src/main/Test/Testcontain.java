package Test;

import OtherObjects.ManageLinkedList;
import OtherObjects.ModLinkedList;

import java.io.IOException;

public class Testcontain {
    public static void main(String[] args) throws IOException {
        ManageLinkedList llman= new ManageLinkedList();
        ModLinkedList head_node= new ModLinkedList("",null);
        System.out.println(llman.wholecontain(head_node,""));



    }
}
