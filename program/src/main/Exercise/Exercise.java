package Exercise;

// Entity class Exercise.Exercise
public class Exercise {

    private String name;
    private double time;

    public Exercise(String name, double time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public double getTime() {
        return this.time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isEqual(Exercise ex) {
        return (this.name.equals(ex.name) & this.time == ex.time);
    }
}