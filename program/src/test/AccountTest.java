import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testUpdate_food_record() throws ParseException {
        // Account create
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String account_created = "2021.10.09";
        String birthday = "2010.01.01";
        Date birth_day = dateFormat.parse(birthday);
        Date ac_created = dateFormat.parse(account_created);
        Account ac = new Account("123456",
                "mark",
                ac_created,
                birth_day,
                "male");
        //Calendar create
        Calendar date = new GregorianCalendar(2021,Calendar.NOVEMBER, 16);
        // food update
        ac.update_food_record(date,"Fries");
        int index = ac.getDate_record().indexOf("2021,10,16");
        ArrayList<String> fd_record = new ArrayList<>();
        fd_record.add("Fries");
        assertEquals(ac.getFood_record().get(index), fd_record);
    }
}
