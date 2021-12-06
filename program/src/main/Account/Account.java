package Account;

import DateAndObject.*;
//import DateAndObject.DateAndFood;
import Food.*;
import OtherObjects.*;
//import OtherObjects.ModLinkedList;
import Exercise.*;

import java.io.*;
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

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public ModDate getBirthday() { return birthday; }

    public String getGender() { return gender; }

    public ArrayList<DateAndFood> getFood_record(){return this.food_record;}

    public ArrayList<DateAndExercise> getExercise_record() {
        return exercise_record;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setBirthday(ModDate birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFood_record(ArrayList<DateAndFood> food_record) {
        this.food_record = food_record;
    }

    public void setExercise_record(ArrayList<DateAndExercise> exercise_record) {
        this.exercise_record = exercise_record;
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
            pw.println(this.weight);
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
            ModLinkedList InfoLista = new ModLinkedList(this.weight,null);
            ModLinkedList InfoList2 = new ModLinkedList(this.birthday.getYear(),null);
            ModLinkedList InfoList3 = new ModLinkedList(this.birthday.getMonth(),null);
            ModLinkedList InfoList4 = new ModLinkedList(this.birthday.getDay(),null);

            InfoList.setNext(InfoList1);
            InfoList1.setNext(InfoLista);
            InfoLista.setNext(InfoList2);
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
                infocur_node.setNext(new ModLinkedList("",null));
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
                infocur_node.setNext(new ModLinkedList("",null));
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

    public void FillInfo() throws FileNotFoundException {
        File text = new File("AccountData.txt");
        Scanner s = new Scanner(text);
        String cur_line=s.nextLine();
        while(s.hasNextLine()){
            if(cur_line.equals("*user")){
                cur_line=s.nextLine();
                if(cur_line.equals(this.username)){
                    cur_line=s.nextLine();//now on password but dont need it. it already has it
                    cur_line=s.nextLine();
                    this.gender=cur_line;
                    cur_line=s.nextLine();
                    this.weight=Double.parseDouble(cur_line);
                    ModDate birth=new ModDate(0,0,0);
                    cur_line=s.nextLine();
                    birth.setYear(Integer.parseInt(cur_line));
                    cur_line=s.nextLine();
                    birth.setMonth(Integer.parseInt(cur_line));
                    cur_line=s.nextLine();
                    birth.setDay(Integer.parseInt(cur_line));
                    this.birthday=birth;
                    cur_line=s.nextLine();
                    while(s.hasNextLine()){
                        if(cur_line.equals("*foodrec")){
                            ModDate adate= new ModDate(0,0,0);
                            cur_line=s.nextLine();
                            adate.setYear(Integer.parseInt(cur_line));
                            cur_line=s.nextLine();
                            adate.setMonth(Integer.parseInt(cur_line));
                            cur_line=s.nextLine();
                            adate.setDay(Integer.parseInt(cur_line));
                            Food afood =new Food("",0);
                            cur_line=s.nextLine();//now at *foodbreak
                            cur_line=s.nextLine();
                            afood.setName(cur_line);
                            cur_line=s.nextLine();
                            afood.setWeight(Double.parseDouble(cur_line));
                            this.food_record.add(new DateAndFood(adate,afood));
                            cur_line=s.nextLine();
                        }
                        else if (cur_line.equals("*exrec")){
                            ModDate bdate= new ModDate(0,0,0);
                            cur_line=s.nextLine();
                            bdate.setYear(Integer.parseInt(cur_line));
                            cur_line=s.nextLine();
                            bdate.setMonth(Integer.parseInt(cur_line));
                            cur_line=s.nextLine();
                            bdate.setDay(Integer.parseInt(cur_line));
                            Exercise bex =new Exercise("",0);
                            cur_line=s.nextLine();//at *exbreak
                            cur_line=s.nextLine();
                            bex.setName(cur_line);
                            cur_line=s.nextLine();
                            bex.setTime(Double.parseDouble(cur_line));
                            this.exercise_record.add(new DateAndExercise(bdate,bex));
                            cur_line=s.nextLine();
                        }
                        else{if(s.hasNextLine()){cur_line=s.nextLine();}else{break;}}
                    }

                }
                else{if(s.hasNextLine()){cur_line=s.nextLine();}else{break;}}
            }
            else{if(s.hasNextLine()){cur_line=s.nextLine();}else{break;}}
        }
    }

    public int getAge(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year-this.birthday.getYear();
    }
}

