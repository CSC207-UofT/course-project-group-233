import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManageAccount {
    public ManageAccount(){}

    public boolean scan_has_account(String username) throws FileNotFoundException {
        File text = new File("AccountData.txt");
        Scanner s = new Scanner(text);
        boolean has_user=false;
        String line=s.nextLine();
        while(s.hasNextLine()){
            if(line.equals("*user")){
                line=s.nextLine();
                if(line.equals(username)){has_user=true;}
            }
            else {line=s.nextLine();}

        }
        return has_user;
    }
//    public int test( ) throws FileNotFoundException {
//        File text = new File("AccountData.txt");
//        Scanner s = new Scanner(text);
//        int count=0;
//        String line;
//        while(s.hasNextLine()){
//
//            line=s.nextLine();
//            count+=1;
//
//        }
//        return count;
//    }


}

