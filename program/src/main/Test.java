import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        ArrayList<DateAndObj> lista = new ArrayList<DateAndObj>();
        ArrayList<DateAndObj> listb = new ArrayList<DateAndObj>();
        ModDate birth = new ModDate(2021,1,1);
        Account accounta = new Account("exampleuser2","a","m",1,
                 birth,lista,listb);

        //System.out.println(accounta.register());
        //FileWriter fw = new FileWriter("AccountData.txt",true);
        //fw.write("a");
        //File text = new File("AccountData.txt");
        //Scanner s = new Scanner(text);
        //System.out.println(s.nextLine());
        //accounta.register();
        //ManageAccount a=new ManageAccount();
        //ManageAccount b=new ManageAccount();
        //System.out.println(a.test());
        //System.out.println(b.test());


    }
}
