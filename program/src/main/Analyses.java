import java.util.ArrayList;

public class Analyses {
    // Use Case Class Analyses

    /**
     * This is an Analyses class that could give some data analyses to users exercise and calorie
     * record based on the period.
     */
    private int period; //number of days

    public Analyses (int period) { //constructor
        this.period = period;
    }

    public int getPeriod() { //getter function for instance period
        return this.period;
    }

    public void setPeriod(int period) { //setter function for instance period
        this.period = period;
    }

    public double average_calorie_intake (Account user, ManageFood mf) {
        /*
          This function calculate the average calories that user take in by food in certain recent period.
          e.g. recent 7 days, recent 30 days, recent 365 days
          @param record this is the record of users daily calorie intake
         * @return the average calorie intake in certain recent period
         */
        double count = 0;
        for(int i = user.getFood_record().size() - 1; i > user.getFood_record().size() - period; i--) {
            for(String j : user.getFood_record().get(i)) {
                count += mf.SeeCal(j);
            }
        }
        return count/period;
    }
}
