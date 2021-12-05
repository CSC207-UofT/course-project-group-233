package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManageExercise {

    public ManageExercise(){}

    public boolean hasExercise(String name) throws FileNotFoundException {
        File text = new File("ExerciseData.txt");
        Scanner s = new Scanner(text);
        boolean has_exercise=false;
        String line=s.nextLine();
        while(s.hasNextLine()) {
            if (line.equals(name)) {
                has_exercise = true;
                break;
            } else {
                if(s.hasNextLine()){line=s.nextLine();}else{break;}}
        }
        return has_exercise;
    }

    public double getMET(String exc) throws FileNotFoundException {
        File text = new File("ExerciseData.txt");
        Scanner s = new Scanner(text);
        String line= s.nextLine();
        double result=0.0;
        while(s.hasNextLine()){
            if(line.equals(exc)){
                result=Double.parseDouble(s.nextLine());
                break;
            }
            else {if(s.hasNextLine()){line=s.nextLine();}else{break;}}
        }
        return result;

    }

    public double getTotalExCal(Exercise exercise,double weight) throws FileNotFoundException {
        return (exercise.getTime()*(this.getMET(exercise.getName())*3.5*weight/200));
    }

    public String searchEx(String name) throws FileNotFoundException {
        String result="";
        File text = new File("ExerciseData.txt");
        Scanner s = new Scanner(text);
        String line = s.nextLine();
        char a1=Character.toLowerCase(name.charAt(0));
        while(s.hasNextLine()){
            if (!line.equals("")& !line.equals("Milk & Dairy produce")
                    & !line.equals("Fats & Sugars") & !line.equals("Fruits & Vegetables")
                    & !line.equals("Meats & Fish") & !line.equals("Breads & Cereals")){
                char a2=(Character.toLowerCase(line.charAt(0)));
                if(a1==a2){
                    result+=(line+"\n");
                    if(s.hasNextLine()){line=s.nextLine();}else{break;}
                }
                else{if(s.hasNextLine()){line=s.nextLine();}else{break;}}
            }
            else{if(s.hasNextLine()){line=s.nextLine();}else{break;}}
        }
        return result;
    }
}
