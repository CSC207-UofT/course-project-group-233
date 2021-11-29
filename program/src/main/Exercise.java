// Entity class Exercise
class Exercise {

    private final String name;
    private final String calories;

    Exercise(String name, String calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName(){
        return this.name;
    }

    public String getCalories(){
        return this.calories;
    }

//
//    /**
//     * This is an Exercise class that contain different kinds of exercises that Account could choose.
//     *
//     * @param exercise_collection contain HashMap, with key being different kinds of exercises,
//     *                            and value be the MET for this exercise in the calories burned formula.
//     * @param record contain the possible consecutive exercises that Account does for one day.
//     * @param calorie_burned contain calories burned for one day.
//     */
//
//    private Map<String, Double> exercise_collection;
//    private ArrayList<String> record;
//    private double calorie_burned;
//
//    public Exercise (Map exercise_collection) {
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
