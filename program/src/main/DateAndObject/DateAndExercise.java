package DateAndObject;


import Exercise.Exercise;
import OtherObjects.ModDate;

public class DateAndExercise extends DateAndObj{

    public DateAndExercise(ModDate date, Exercise exercise){
        super(date,exercise);

    }

    public Exercise getExercise(){return (Exercise) this.getObject();}
}
