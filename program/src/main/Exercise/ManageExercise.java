package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManageExercise {

    public void ManageAccount(){}

    public boolean findExercise(String name) throws FileNotFoundException {
        File text = new File("ExerciseData.txt");
        Scanner s = new Scanner(text);
        boolean has_exercise=false;
        String line=s.nextLine();
        while(s.hasNextLine()) {
            if (line.equals(name)) {
                has_exercise = true;
            } else {
                line=s.nextLine();}
        }
        return has_exercise;
    }
}
