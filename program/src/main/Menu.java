//import java.io.FileNotFoundException;
//import java.text.ParseException;
//import java.util.Calendar;
//
//public class Menu {
//    // controller class Menu
//
//    /**
//     * This is a Menu class that could give contents in different use case class
//     */
//
//    private final ManageFood mf;
//    private final ManageAccount ma;
//
//    public Menu() throws FileNotFoundException, ParseException {
//        this.ma = new ManageAccount();
//        this.mf = new ManageFood();
//    }
//
//    public void show_given_food_calorie (String fd, Calendar date, double weight){
//        ma.update_food_record(date, fd, this.mf);
//        System.out.println("The calorie of " + fd + " is about " + mf.GetCaloriePerGram(fd) * weight);
//    }
//
//    public double get_food_analyses(int period) throws ParseException {
//        Analyses an = new Analyses(period);
//        return an.average_calorie_intake(this.ma.getCurrent_account(), this.mf);
//    }
//
//    public ManageFood getMf() {
//        return this.mf;
//    }
//
//    public ManageAccount getMa() {
//        return this.ma;
//    }
//}
