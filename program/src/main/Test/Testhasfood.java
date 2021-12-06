package Test;

import Food.*;

import java.io.IOException;

public class Testhasfood {

    public static void main(String[] args) throws IOException {

        ManageFood mf = new ManageFood();
        System.out.println(mf.has_food("Milk skimmed"));
        System.out.println(mf.has_food("ilk skimmed"));
        //returned the desired result
    }

}
