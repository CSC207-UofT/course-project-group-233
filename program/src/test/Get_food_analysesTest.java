import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Get_food_analysesTest {
    @Test
    public void testGet_food_analyes() throws ParseException {
        Menu mu = new Menu();
        int pr1 = 4;

        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String account_created = "2021.10.09";
        String birthday = "2010.01.01";
        Date birth_day = dateFormat.parse(birthday);
        Date ac_created = dateFormat.parse(account_created);
        Account ac = new Account("123456",
                "Mark",
                ac_created,
                birth_day,
                "male");

        mu.getMa().setCurrent_account(ac);
        ManageFood fd1 = mu.getMf();

        fd1.update_food("apple","fruit",100,0.44);
        fd1.update_food("banana", "fruit", 100,0.65);
        fd1.update_food("blackberries", "fruit", 50, 0.30);
        fd1.update_food("cherry", "fruit", 50, 0.50);

        Calendar day1 = new GregorianCalendar(2021, Calendar.NOVEMBER,10);
        mu.getMa().update_food_record(day1, "apple", fd1);
        Calendar day2 = new GregorianCalendar(2021, Calendar.NOVEMBER,11);
        mu.getMa().update_food_record(day2, "banana", fd1);
        Calendar day3 = new GregorianCalendar(2021, Calendar.NOVEMBER,12);
        mu.getMa().update_food_record(day3, "blackberries", fd1);
        Calendar day4 = new GregorianCalendar(2021, Calendar.NOVEMBER,13);
        mu.getMa().update_food_record(day4, "cherry", fd1);



        double a1 = 37.25;
        double actual = mu.get_food_analyses(pr1);
        assert  a1 == actual;



    }
}
