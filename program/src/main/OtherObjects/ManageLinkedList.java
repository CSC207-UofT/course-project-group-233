package OtherObjects;

import OtherObjects.*;

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

    //see if an element is in the list
    public boolean wholecontain(ModLinkedList node,String content){
        ModLinkedList cur_node= node;
        boolean result=false;
        do{
            if(cur_node.getContent().equals(content)){result=true;break;}
            else{if(cur_node.getNext()!=null){cur_node=cur_node.getNext();}else{break;}}
        }while(cur_node.getNext()!=null);
        if(cur_node.getContent().equals(content)){result=true;}
        return result;
    }

    //get to the node in the list with the provided content
    public ModLinkedList gettonode(ModLinkedList node,Object obj){
        ModLinkedList cur_node= node;
        do{
            if(cur_node.getContent().equals(obj)){break;}
            else{if(cur_node.getNext()!=null){cur_node=cur_node.getNext();}else{break;}}
        }while(cur_node.getNext()!=null);
        return cur_node;
    }

    public ModLinkedList toEnd(ModLinkedList node){
        ModLinkedList cur_node= node;
        while(cur_node.getNext()!=null){
            cur_node=cur_node.getNext();
        }
        return cur_node;
    }


}
