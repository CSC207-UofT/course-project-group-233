
public class Analyses {
    // Use Case Class Analyses

    /**
     * This is an Analyses class that could give some data analyses to users exercise and calorie
     * record based on the period.
     */
    private final int period; //number of days

    public Analyses (int period) { //constructor
        this.period = period;
    }

    public double average_calorie_intake (Account user) {
        /*
          This function calculate the average calories that user take in by food in certain recent period.
          e.g. recent 7 days, recent 30 days, recent 365 days
          @param record this is the record of users daily calorie intake
         * @return the average calorie intake in certain recent period
         */
        double count = 0;
        for(int i = user.getCalorie_record().size() - 1; i >= user.getCalorie_record().size() - period; i--) {
            count += user.getCalorie_record().get(i);
        }
        return count/period;
    }
}
