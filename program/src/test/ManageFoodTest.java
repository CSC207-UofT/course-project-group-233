import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManageFoodTest {
    @Test
    public void testGetCalorie() {
        // manage food create
        ManageFood mf = new ManageFood();
        // create food name
        String fd = "Fries";
        Double actual = mf.GetCalorie(fd);
        Double expected = 221.52;
        assertEquals(actual, expected);
    }

    @Test
    public void testUpdate_food() {
        // manage food create
        ManageFood mf = new ManageFood();
        // create food name
        String fd = "Fries";
        // create food kind
        String kind = "Fast Food";
        // create weight
        double weight = 71;
        // create calorie_per_gram
        double calorie_per_gram = 3.12;
        mf.update_food(fd,kind,weight,calorie_per_gram);
        Food actual1 = mf.FoodData.get(fd);
        Food expected1 = new Food("Fries", "Fast Food", (double)71);
        double actual2 = mf.CaloriePerGram.get(fd);
        double expected2 = 3.12;
        assert(actual1.equals(expected1));
        assertEquals(actual2, expected2);
    }
}
