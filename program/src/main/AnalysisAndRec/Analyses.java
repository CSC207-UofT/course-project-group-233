package AnalysisAndRec;

import Account.*;
import DateAndObject.*;
import Exercise.*;
import Food.*;
import OtherObjects.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Analyses {
    public Analyses(){}

    public String foodrectoString(Account account) throws FileNotFoundException {
        ManageFood foodman = new ManageFood();
        String result="";
        for(DateAndFood i : account.getFood_record()){
            result+=("On "+i.getDate().beString()+" you had:  "+i.getFood().getName()
                     +"  "+Double.toString(i.getFood().getWeight())+"g "+"Calorie per gram: "+
                    Double.toString(foodman.getCalorie_Per_Gram(i.getFood().getName()))+
                    "Total Calorie: "+Double.toString(foodman.getTotalCal(i.getFood()))+"\n");
        }
        return result;
    }

    public String exrecToString(Account account,double weight) throws FileNotFoundException {
        ManageExercise exman= new ManageExercise();
        String result="";
        for(DateAndExercise i : account.getExercise_record()){
            result+=("On "+i.getDate().beString()+" you did:  "+i.getExercise().getName()
                    +"  "+Double.toString(i.getExercise().getTime())+"  minutes. "+
                    "Total Calorie Burned: "+
                    Double.toString(exman.getTotalExCal(i.getExercise(),weight ))+"\n");
        }
        return result;
    }

    public String dateana(Account account) throws FileNotFoundException {
        String result= "";
        ManageExercise exman= new ManageExercise();
        ManageFood foodman= new ManageFood();
        ManageLinkedList llman= new ManageLinkedList();
        LLwithObject head_node= new LLwithObject("",null);
        LLwithObject cur_node= head_node;
        for(DateAndFood i: account.getFood_record()){
            if(llman.wholecontain(head_node,i.getDate().beString())){
                cur_node= (LLwithObject) llman.gettonode(head_node,i.getDate().beString());
                cur_node.getlist().add(foodman.getTotalCal(i.getFood()));
            }
            else{
                cur_node= (LLwithObject) llman.toEnd(head_node);
                if(cur_node.getContent().equals("")){
                    cur_node.setContent(i.getDate().beString());
                    cur_node.setlist(new ArrayList<Double>());
                    cur_node.getlist().add(foodman.getTotalCal(i.getFood()));
                }
                else {
                    cur_node.setNext(new LLwithObject(i.getDate().beString(),null));
                    cur_node= (LLwithObject) cur_node.getNext();
                    cur_node.setlist(new ArrayList<Double>());
                    cur_node.getlist().add(foodman.getTotalCal(i.getFood()));
                }
            }
        }

        for(DateAndExercise i: account.getExercise_record()){
            if(llman.wholecontain(head_node,i.getDate().beString())){
                cur_node= (LLwithObject) llman.gettonode(head_node,i.getDate().beString());
                cur_node.getlist().add((-1)*exman.getTotalExCal(i.getExercise(),account.getWeight()));
            }
            else{
                cur_node= (LLwithObject) llman.toEnd(head_node);
                if(cur_node.getContent().equals("")){
                    cur_node.setContent(i.getDate().beString());
                    cur_node.setlist(new ArrayList<Double>());
                    cur_node.getlist().add((-1)*exman.getTotalExCal(i.getExercise(),account.getWeight()));
                }
                else {
                    cur_node.setNext(new LLwithObject(i.getDate().beString(),null));
                    cur_node= (LLwithObject) cur_node.getNext();
                    cur_node.setlist(new ArrayList<Double>());
                    cur_node.getlist().add((-1)*exman.getTotalExCal(i.getExercise(),account.getWeight()));
                }
            }
        }
        cur_node=head_node;
        do{
            result+=("On "+cur_node.getContent() +" Net Calorie: "
                   +Double.toString(cur_node.getListSum())+"\n");

            if(cur_node.getNext()!=null){cur_node= (LLwithObject) cur_node.getNext();}
            else{break;}

        }while (cur_node.getNext()!=null);
        result+=("On "+cur_node.getContent() +" Net Calorie: "
                +Double.toString(cur_node.getListSum())+"\n");
        return result;
    }
}