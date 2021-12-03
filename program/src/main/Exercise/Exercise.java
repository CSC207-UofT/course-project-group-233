package Exercise;

// Entity class Exercise.Exercise
public class Exercise {

    private  String name;
    private  double time;

    public Exercise(String name, double time) {
        this.name = name;
        this.time=time;
    }

    public String getName(){
        return this.name;
    }

    public double getTime(){
        return this.time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isEqual(Exercise ex){
        return (this.name.equals(ex.name)&this.time== ex.time);
    }

    //
//    /**
//     * This is an Exercise.Exercise class that contain different kinds of exercises that Account.Account could choose.
//     *
//     * @param exercise_collection contain HashMap, with key being different kinds of exercises,
//     *                            and value be the MET for this exercise in the calories burned formula.
//     * @param record contain the possible consecutive exercises that Account.Account does for one day.
//     * @param calorie_burned contain calories burned for one day.
//     */
//
//    private Map<String, Double> exercise_collection;
//    private ArrayList<String> record;
//    private double calorie_burned;
//
//    public Exercise.Exercise (Map exercise_collection) {
//        this.exercise_collection = exercise_collection;
//        this.record = new ArrayList<>();
//        this.calorie_burned = 0;
//    }
//
//    public Map getExercise_collection() {
//        return this.exercise_collection;
//    }
//
//    public ArrayList<String> getRecord() {
//        return this.record;
//    }
//
//    public double getCalorie_burned() {
//        return this.calorie_burned;
//    }
//
//    public Double check_exercise_calorie (String exercise) {
//        return this.exercise_collection.get(exercise);
//    }
}
