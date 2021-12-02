//import java.io.FileNotFoundException;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ExerciseRecommendation<parseException extends Throwable> {
//    private String recommend_sport;
//    private double recommend_cal;
//    private double recommend_time;
//    private Account.Account now_using = null;
//
//
//    public ExerciseRecommendation() throws FileNotFoundException, parseException{
//       loading_file();
//    }
//
//    public void loading_file() throws FileNotFoundException, parseException {
//        File read_file = new File("ExerciseData.txt");
//        Scanner scan_file = new Scanner(read_file);
//        while (scan_file.hasNextLine()){
//            String name_exercise = scan_file.nextLine();
//            String MET_exercise = scan_file.nextLine();
//            scan_file.nextLine();
//        }
//    }
//
//
//    public String recommend__sport(double MET) throws FileNotFoundException {
//        File read_file = new File("ExerciseData.txt");
//        Scanner scan_file = new Scanner(read_file);
//        ArrayList<String> final_string = new ArrayList<>();
//        ArrayList<Double> final_MET = new ArrayList<>();
//        while (scan_file.hasNextLine()) {
//            String name_exercise = scan_file.nextLine();
//            final_string.add(name_exercise);
//            String MET_exercise = scan_file.nextLine();
//            double x = Double.parseDouble(MET_exercise);
//            final_MET.add(x);
//            scan_file.nextLine();
//        }
//        for (double i : final_MET) {
//            if (MET + 0.5 >= i && MET - 0.5 <= i) {
//                return final_string.get(final_MET.indexOf(i));
//            }
//        }
//        return "Sorry, but there is no such sport you are looking for would satisfy your goal!";
//    }
//
//
//    public double invert_sport_to_MET(String sport_asked) throws FileNotFoundException {
//        File read_file = new File("ExerciseData.txt");
//        Scanner scan_file = new Scanner(read_file);
//        ArrayList<String> final_string = new ArrayList<>();
//        ArrayList<Double> final_MET = new ArrayList<>();
//        while (scan_file.hasNextLine()) {
//            String name_exercise = scan_file.nextLine();
//            final_string.add(name_exercise);
//            String MET_exercise = scan_file.nextLine();
//            double y = Double.parseDouble(MET_exercise);
//            scan_file.nextLine();
//        }
//        return final_MET.get(final_string.indexOf(sport_asked));
//    }
//
//    double user_weight = Account.Account.getWeight();
//
//
//    public String recommend_sport(double cal, double time) throws FileNotFoundException {
//        double MET_value = time * 200 / (3.5 * user_weight);
//        return recommend__sport(MET_value);
//    }
//
//    public double recommend_cal(String sport, double time) throws FileNotFoundException {
//        double MET = invert_sport_to_MET(sport);
//        double cal = MET * 3.5 * user_weight * time / 200;
//        return cal;
//    }
//
//    public double recommend_time(String sport, double cal) throws FileNotFoundException {
//        double MET = invert_sport_to_MET(sport);
//        double time = MET * 3.5 * user_weight / 200;
//        return time;
//    }
//}