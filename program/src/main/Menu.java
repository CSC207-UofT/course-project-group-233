import java.util.ArrayList;
import java.util.Calendar;

public class Menu {
    // controller class Menu

    /**
     * This is a Menu class that could give contents in different use case class
     */

    public void show_manage_account (ManageAccount mg, int period, ManageFood mf) {
        //user info showed after clicking Account in menu
        System.out.println(mg.toString());
        if (period < mg.getCurrent_account().getDate_record().size()) {
            Analyses an = new Analyses(period);
            System.out.println("The average intake calories for recent " + period +
                    "days(s) is " + an.average_calorie_intake(mg.getCurrent_account(), mf));
        }
    }

    public void show_given_food_calorie (ManageFood mf, ManageAccount ma, String fd, Calendar date){
        //food calorie showed after clicking Food and entering food name in menu
        ma.getCurrent_account().update_food_record(date, fd);
        System.out.println("The calorie of " + fd + " is about " + mf.GetCalorie(fd));
    }
}
