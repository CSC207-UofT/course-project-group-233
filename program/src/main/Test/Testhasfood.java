package Test;

import Food.ManageFood;

import java.io.IOException;

public class Testhasfood {

    public static void main(String[] args) throws IOException {

        ManageFood mf = new ManageFood();
        System.out.println(mf.has_food("Milk skimmed"));
    }

}
