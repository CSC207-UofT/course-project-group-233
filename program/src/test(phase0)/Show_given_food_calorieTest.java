//import org.junit.jupiter.api.Test.Test;
//
//import java.io.FileNotFoundException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//
//public class Show_given_food_calorieTest {
//    @Test.Test
//    public void testShow_given_food_calorie() throws ParseException, FileNotFoundException {
//        Menu mu = new Menu();
//        String fd = "Fries";
//        Calendar dd1 = new GregorianCalendar(2021,Calendar.NOVEMBER,16);
//        double wt = 100.00;
//
//
//        SimpleDateFormat dateFormat;
//        dateFormat = new SimpleDateFormat("yyyy.MM.dd");
//        String account_created = "2021.10.09";
//        String birthday = "2010.01.01";
//        Date birth_day = dateFormat.parse(birthday);
//        Date ac_created = dateFormat.parse(account_created);
//        Account.Account ac = new Account.Account("123456",
//                "Mark",
//                ac_created,
//                birth_day,
//                "male",
//                70);
//
//
//        mu.getMa().setCurrent_account(ac);
//
//        mu.show_given_food_calorie(fd, dd1, wt);
//        double cc =mu.getMa().getCurrent_account().getCalorie_record().get(mu.getMa().getCurrent_account()
//                .getCalorie_record().size()-1);
//        //assert cc == mu.getMf().GetCalorie(fd);
//        //double actual = mu.getMf().GetFood(fd).getWeight();
//        //assert actual == wt;
//    }
//}
