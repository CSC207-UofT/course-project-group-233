package Test;

import Food.ManageFood;

import java.io.IOException;

public class TestGetCal {

    public static void main(String[] args) throws IOException {

        ManageFood mf = new ManageFood();
        System.out.println(mf.getCalorie_Per_Gram("Milk skimmed"));
        //got the correct number
    }



}
