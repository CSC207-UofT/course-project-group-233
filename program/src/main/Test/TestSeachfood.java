package Test;

import Food.ManageFood;
import OtherObjects.ModLinkedList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TestSeachfood {

    public static void main(String[] args) throws IOException {
        ManageFood foodman = new ManageFood();
        System.out.println(foodman.searchFood("c"));


    }
}
