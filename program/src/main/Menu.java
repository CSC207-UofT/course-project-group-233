import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;

public class Menu {
    // controller class Menu

    /**
     * This is a Menu class that could give contents in different use case class
     */

    private final ManageFood mf;
    private final ManageAccount ma;

    public Menu() throws FileNotFoundException, ParseException {
        this.ma = new ManageAccount();
        this.mf = new ManageFood();
    }

    public void show_given_food_calorie(String fd, Calendar date, double weight) {
        //food calorie showed after clicking Food and entering food name in menu
        mf.change_food_weight(fd, weight);
        ma.update_food_record(date, fd, this.mf);
        System.out.println("The calorie of " + fd + " is about " + mf.GetCalorie(fd));
    }

    public double get_food_analyses(int period) {
        Analyses an = new Analyses(period);
        return an.average_calorie_intake(this.ma.getCurrent_account());
    }

    public ManageFood getMf() {
        return this.mf;
    }

    public ManageAccount getMa() {
        return this.ma;
    }

    public String searching(String food_name) {
        ArrayList<String> food_recommend = new ArrayList<String>();
        for (String food : this.mf.food_list()) {
            if (food.equals(food_name)) {
                return food_name;
            } else {

                for (String item : this.mf.food_list()) {
                    if (item.charAt(0) == food_name.charAt(0)) {
                        food_recommend.add(item);
                    }
                }
            }
        }
        String recommend = food_recommend.toString();
        return "The food is not founded. Do you mean:" + recommend;
    }
}