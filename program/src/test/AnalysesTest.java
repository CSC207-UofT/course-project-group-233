import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnalysesTest {

    @Test
    public void testAverage_calorie_intake() throws ParseException {
        // Analyses created
        Analyses an = new Analyses(7);
        // account created
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
        // ManageFood created
        ManageFood mf = new ManageFood();
        // update 7 days food record
        Calendar day1 = new GregorianCalendar(2021, Calendar.NOVEMBER,10);
        ac.update_food_record(day1, "apple");
        Calendar day2 = new GregorianCalendar(2021, Calendar.NOVEMBER,11);
        ac.update_food_record(day2, "banana");
        Calendar day3 = new GregorianCalendar(2021, Calendar.NOVEMBER,12);
        ac.update_food_record(day3, "blackberries");
        Calendar day4 = new GregorianCalendar(2021, Calendar.NOVEMBER,13);
        ac.update_food_record(day4, "cherry");
        Calendar day5 = new GregorianCalendar(2021, Calendar.NOVEMBER,14);
        ac.update_food_record(day5, "grapes");
        Calendar day6 = new GregorianCalendar(2021, Calendar.NOVEMBER,15);
        ac.update_food_record(day6, "melon");
        Calendar day7 = new GregorianCalendar(2021, Calendar.NOVEMBER, 16);
        ac.update_food_record(day7, "orange");
        // update food offered (used data from reference)
        mf.update_food("apple","fruit",100,0.44);
        mf.update_food("banana", "fruit", 100,0.65);
        mf.update_food("blackberries", "fruit", 50, 0.30);
        mf.update_food("cherry", "fruit", 50, 0.50);
        mf.update_food("grapes", "fruit", 100, 0.62);
        mf.update_food("melon", "fruit", 50, 0.28);
        mf.update_food("orange", "fruit", 100,0.30);
        // test part
        double result = an.average_calorie_intake(ac,mf);
        double expected = 36;
        assertEquals(result,expected);
    }
}
