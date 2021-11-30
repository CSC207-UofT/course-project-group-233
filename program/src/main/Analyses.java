//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class Analyses {
//    // Use Case Class Analyses
//
//    /**
//     * This is an Analyses class that could give some data analyses to users exercise and calorie
//     * record based on the period.
//     */
//    private final int period; //number of days
//
//    public Analyses (int period) { //constructor
//        this.period = period;
//    }
//
//    public double average_calorie_intake (Account.Account user, ManageFood mf) throws ParseException {
//        /*
//          This function calculate the average calories that user take in by food in certain recent period.
//          e.g. recent 7 days, recent 30 days, recent 365 days
//          @param record this is the record of users daily calorie intake
//         * @return the average calorie intake in certain recent period
//         */
//        double count = 0;
//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.DATE, -period);
//        DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
//        for (int i = 0; i < user.getDate_record().size(); i++) {
//            Date expected = df.parse(user.getDate_record().get(i));
//            if (expected.after(cal.getTime())){
//                for (int j = 0; j < user.getFood_record().get(i).size(); j++){
//                    count += user.getWeight_record().get(i).get(j) *
//                            mf.GetCaloriePerGram(user.getFood_record().get(i).get(j));
//                }
//            }
//        }
//        return count/period;
//    }
//}
