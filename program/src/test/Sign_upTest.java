//import  org.junit.jupiter.api.Test.Test;
//
//import java.io.FileNotFoundException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class Sign_upTest {
//    @Test.Test
//    public void testSign_up() throws ParseException, FileNotFoundException {
//        Account.ManageAccount new_account = new Account.ManageAccount();
//        String new_user = "Hello";
//        String word = "Holy";
//        SimpleDateFormat dateFormat;
//        dateFormat = new SimpleDateFormat("yyyy.MM.dd");
//        String birthday = "2010.01.01";
//        Date birth_day = dateFormat.parse(birthday);
//        String gender = "male";
//
//        String actual = new_account.sign_up(new_user,word,birth_day,gender);
//        String expected = "Account.Account has been successfully created! Welcome!";
//        assertEquals(actual, expected);
//    }
//
//}
