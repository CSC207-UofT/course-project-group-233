import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<DateAndObj> lista = new ArrayList<DateAndObj>();
        ArrayList<DateAndObj> listb = new ArrayList<DateAndObj>();
        ModDate birth = new ModDate(2021,1,1);
        Account accounta = new Account("exampleuser","a","m",1,
                 birth,lista,listb);

        accounta.register();




    }
}
