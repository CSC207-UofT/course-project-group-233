//THIS FILE IS ONLY FOR PHASE 0


//import java.io.FileNotFoundException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//public class Command {
//
//    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        // create menu
//        Menu menu = new Menu();
//        // create scanner
//        Scanner scanner = new Scanner(System.in);
//        // create date format
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
//        System.out.println("Welcome to our fitness app. \n" +
//                "If you do not have an account, please enter sign_up to create. \n" +
//                "If you have an account already, please enter sign_in to sign_in.");
//        String sign_choice = scanner.nextLine();
//        while (!sign_choice.equals("sign_in") && !sign_choice.equals("sign_up")) {
//            System.out.println("Sorry, your input is invalid. Please type sign_in or sign_up");
//            sign_choice = scanner.nextLine();
//        }
//        String result = null;
//        if (sign_choice.equals("sign_in")) { //sign in
//            while (!Objects.equals(result, "Welcome")){
//                System.out.println("Please enter your username: ");
//                String username = scanner.nextLine();
//                System.out.println("Please enter your password: ");
//                String password = scanner.nextLine();
//                result = menu.getMa().sign_in(username, password);
//                System.out.println(result);
//            }
//        }
//        else { //sign up
//            while (!Objects.equals(result, "Account.Account has been successfully created! Welcome!")) {
//                System.out.println("Please enter your username: ");
//                String username = scanner.nextLine();
//                System.out.println("Please enter your password: ");
//                String password = scanner.nextLine();
//                System.out.println("Please enter your birthday in format of yyyy.MM.dd: ");
//                String birthday = scanner.nextLine();
//                Date birth_day = dateFormat.parse(birthday);
//                System.out.println("Please enter your gender: ");
//                String gender = scanner.nextLine();
//                result = menu.getMa().sign_up(username, password, birth_day, gender);
//                System.out.println(result);
//            }
//        }
//        // log in part finished
//        System.out.println("There are three options for you to choose. \n" +
//                "Type Account.Account if you want to check/update your account information. \n" +
//                "Type Food.Food if you want to record the food you eat. \n" +
//                "Type Exercise.Exercise if you want to start exercising timer/record exercise you did.");
//        // exercise not implemented
//        String type_choice = scanner.nextLine();
//        while (!type_choice.equals("Account.Account") && !type_choice.equals("Food.Food") && !type_choice.equals("Exercise.Exercise")) {
//            System.out.println("Your type is invalid. Please try again.");
//            type_choice = scanner.nextLine();
//        }
//        while (!type_choice.equals("Leave")){
//            switch (type_choice) {
//                case "Account.Account":
//                    System.out.println("If you want to change password, type change_password. \n" +
//                            "If you want to change username, type change_username. \n" +
//                            "If you want to get analyses about your recent intake, type analyze_food.");
//                    String account_choice = scanner.nextLine();
//                    switch (account_choice) {
//                        case "change_password":
//                            System.out.println("Please enter your new password: ");
//                            String password = scanner.nextLine();
//                            String result1 = menu.getMa().changePassword(password);
//                            System.out.println(result1);
//                            break;
//                        case "change_username":
//                            System.out.println("Please enter your new username: ");
//                            String username = scanner.nextLine();
//                            String result2 = menu.getMa().changeUsername(username);
//                            while(result2.equals("This username has been used. Please enter another one.")) {
//                                username = scanner.nextLine();
//                                result = menu.getMa().changeUsername(username);
//                            }
//                            System.out.println(result);
//                            break;
//                        case "analyze_food":
//                            System.out.println("Please enter the number of recent days you want to analyze: ");
//                            String period = scanner.nextLine();
//                            double average_calorie = menu.get_food_analyses(Integer.parseInt(period));
//                            System.out.println("The average calorie intake in recent " + period +
//                                    " days is " + average_calorie);
//                            break;
//                    }
//                    break;
//                case "Food.Food":
//                    ArrayList<String> total_fd_choice = menu.getMf().food_list();
//                    StringBuilder temp = new StringBuilder();
//                    for (String i : total_fd_choice) {
//                        temp.append(i).append(", ");
//                    }
//                    System.out.println("Please type your choice of food from the following: " + temp);
//                    String fd_choice = scanner.nextLine();
//                    System.out.println("Please type the number of grams of chosen food you take in: ");
//                    String fd_weight = scanner.nextLine();
//                    System.out.println("Please type the date you take in chosen food (in format of yyyy.MM.dd): ");
//                    String take_in_date = scanner.nextLine();
//                    Date take_in = dateFormat.parse(take_in_date);
//                    Calendar cal = Calendar.getInstance();
//                    cal.setTime(take_in);
//                    menu.show_given_food_calorie(fd_choice, cal, Double.parseDouble(fd_weight));
//                    break;
//                case "Exercise.Exercise": //not implemented
//                    break;
//            }
//            System.out.println("If you want to go to other options, type Account.Account/Food.Food/Exercise.Exercise. \n" +
//                    "If you want to leave, type Leave.");
//            type_choice = scanner.nextLine();
//        }
//        System.out.println("Thank you for using our fitness app. Hope to see you next time!");
//    }
//}
