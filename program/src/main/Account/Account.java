package Account;

import DateAndObject.DateAndExercise;
import DateAndObject.DateAndFood;
import OtherObjects.ModDate;
import OtherObjects.ModLinkedList;
import Exercise.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Account {
    /*This class will be hold Account.Account basic information
     */

    private String password, username;
    //private final Date date;
    private ModDate birthday;
    private  String gender;
    private double weight;
    private ArrayList<DateAndFood> food_record;
    private ArrayList<DateAndExercise> exercise_record;
    //private final ArrayList<String> date_record;
    // the setter function for date_record is inside update_food_record
    // String type of date is in "yyyy,mm,dd" type.
    //private final ArrayList<ArrayList<String>> food_record;
    // the setter function for food_record is inside update_food_record
    // the index of date(String type) is corresponding to the index of ArrayList of food inside food_record
    // This ArrayList contains all food eaten in date(String type)
    //private ArrayList<ArrayList<Double>> weight_record;



    public Account(String user,String password,String gender, double weight,ModDate bday,
                   ArrayList<DateAndFood> foodrecord, ArrayList<DateAndExercise>exerciserecord){
        this.username=user;
        this.password=password;
        this.gender=gender;
        this.weight=weight;
        this.birthday=bday;
        this.food_record=foodrecord;
        this.exercise_record=exerciserecord;

    }


    public double getWeight(){
        return weight;
    }

    public String getName_for_user(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public ModDate getBirthday() { return birthday; }

    public String getGender() { return gender; }

//    public Date getDate() {
//        return date;
//    }
//
//    public ArrayList<ArrayList<String>> getFood_record() {
//        return this.food_record;
//    }
//
//    public ArrayList<String> getDate_record() {
//        return this.date_record;
//    }
//
//    public ArrayList<ArrayList<Double>> getWeight_record() {return this.weight_record;}

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void register() throws IOException {
        File text = new File("AccountData.txt");

        ManageAccount manage= new ManageAccount();
        boolean has_user=manage.scan_has_account(this.username);

        if(has_user==false){
            FileWriter fw = new FileWriter(text,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("\n");
            pw.println("*user");
            pw.println(this.username);
            pw.println(this.password);
            pw.println(this.gender);
            pw.println(this.birthday.getYear());
            pw.println(this.birthday.getMonth());
            pw.println(this.birthday.getDay());
            for (DateAndFood i :this.food_record){
                pw.println("*foodrec");
                pw.println(i.getDate().getYear());
                pw.println(i.getDate().getMonth());
                pw.println(i.getDate().getDay());
                pw.println("*foodbreak");
                pw.println(i.getFood().getName());
                pw.println(i.getFood().getWeight());
            }
            for (DateAndExercise i :this.exercise_record){
                pw.println("*exrec");
                pw.println(i.getDate().getYear());
                pw.println(i.getDate().getMonth());
                pw.println(i.getDate().getDay());
                pw.println("*exbreak");
                pw.println(i.getExercise().getName());
                pw.println(i.getExercise().getTime());
            }


            pw.println("*userend");
            pw.close();
        }
        else {
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

            //ModLinkedList InfoList = new ModLinkedList("",null);

            //InfoList.setContent("*user");
            //ModLinkedList InfoList1 = new ModLinkedList(this.username,null);
            ModLinkedList InfoList = new ModLinkedList(this.password,null);
            ModLinkedList InfoList1 = new ModLinkedList(this.gender,null);
            ModLinkedList InfoList2 = new ModLinkedList(this.birthday.getYear(),null);
            ModLinkedList InfoList3 = new ModLinkedList(this.birthday.getMonth(),null);
            ModLinkedList InfoList4 = new ModLinkedList(this.birthday.getDay(),null);

            InfoList.setNext(InfoList1);
            InfoList1.setNext(InfoList2);
            InfoList2.setNext(InfoList3);
            InfoList3.setNext(InfoList4);
            //InfoList4.setNext(InfoList5);
            //InfoList5.setNext(InfoList6);

            ModLinkedList InfoList5 = new ModLinkedList("",null);
            InfoList4.setNext(InfoList5);
            ModLinkedList infocur_node=InfoList5;
            for (DateAndFood i :this.food_record){

                infocur_node.setContent("*foodrec");
                infocur_node.setNext(new ModLinkedList(i.getDate().getYear(),null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getDate().getMonth(),null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getDate().getDay(),null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList("*foodbreak",null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getFood().getName(),null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getFood().getWeight(),null));
                infocur_node=infocur_node.getNext();
            }
            for (DateAndExercise i :this.exercise_record){
                infocur_node.setNext(new ModLinkedList("*exrec",null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getDate().getYear(),null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getDate().getMonth(),null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getDate().getDay(),null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList("*exbreak",null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getExercise().getName(),null));
                infocur_node=infocur_node.getNext();
                infocur_node.setNext(new ModLinkedList(i.getExercise().getTime(),null));
                infocur_node=infocur_node.getNext();

            }
            //infocur_node.setNext(new ModLinkedList("*userend",null));
            ModLinkedList infolast_node=infocur_node;

            //find the position of the account's username
            cur_node=ListHead;
            while(cur_node.getNext()!=null){
                if(cur_node.getContent().equals(this.username)){break;}
                else{cur_node=cur_node.getNext();}
            }
            //store it to be a connect point
            ModLinkedList connect_front= cur_node;
            while(cur_node.getNext()!=null){
                if(cur_node.getContent().equals("*userend")){break;}
                else{cur_node=cur_node.getNext();}
            }
            ModLinkedList connect_back= cur_node;//the second connect point

            connect_front.setNext(InfoList);
            infolast_node.setNext(connect_back);
            FileWriter fw2 = new FileWriter(text);
            PrintWriter pw2 = new PrintWriter(fw2);
            cur_node=ListHead;
            while(cur_node.getNext()!=null){
                pw2.println(cur_node.getContent());
                cur_node=cur_node.getNext();
            }
            pw2.close();


        }



    }
}

