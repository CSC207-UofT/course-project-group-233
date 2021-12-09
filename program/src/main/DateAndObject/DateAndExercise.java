package DateAndObject;

import Exercise.*;
import OtherObjects.*;

public class DateAndExercise extends DateAndObj{

    public DateAndExercise(ModDate date, Exercise exercise){
        super(date,exercise);
    }

    public Exercise getExercise(){return (Exercise) this.getObject();}

    public boolean isEqual(DateAndExercise ex){
        return (this.getDate().isEqual(ex.getDate())&this.getExercise().isEqual(getExercise()));
    }
}
