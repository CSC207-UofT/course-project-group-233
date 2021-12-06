package Exercise;

// Entity class Exercise.Exercise
public class Exercise {

    private String name; // name of the exercise
    private double time; // duration of the exercise

    // constructor
    public Exercise(String name, double time) {
        this.name = name;
        this.time = time;
    }

    // ************* get function *************
    public String getName() {
        return this.name;
    }

    public double getTime() {
        return this.time;
    }

    // ************* set function *************
    public void setName(String name) {
        this.name = name;
    }

    public void setTime(double time) {
        this.time = time;
    }

    // check if the exercise is the same
    public boolean isEqual(Exercise ex) {
        return (this.name.equals(ex.name) & this.time == ex.time);
    }
}