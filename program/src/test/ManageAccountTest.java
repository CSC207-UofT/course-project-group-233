import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManageAccountTest {
    @Test
    public void testSign_up() throws ParseException {
        // manage account create
        ManageAccount ma = new ManageAccount();
        // username create
        String username = "Mark";
        // password create
        String password = "123456";
        // birthday create
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String birthday = "2010.01.01";
        Date birth_day = dateFormat.parse(birthday);
        // gender create
        String gender = "male";
        String actual = ma.sign_up(username,password,birth_day,gender);
        String expected = "Account has been Successfully created! Welcome!";
        assertEquals(actual, expected);
    }

    @Test
    public void testSign_in() throws ParseException {
        // manage account create
        ManageAccount ma = new ManageAccount();
        // username create
        String username = "Mark";
        // password create
        String password = "123456";
        // birthday create
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String birthday = "2010.01.01";
        Date birth_day = dateFormat.parse(birthday);
        // gender create
        String gender = "male";
        ma.sign_up(username,password,birth_day,gender);
        String actual = ma.sign_in("Mark", "123456");
        String expected = "Welcome!";
        assertEquals(actual, expected);
    }
}
