package DateAndObject;

import Food.Food;
import OtherObjects.ModDate;

public class DateAndFood extends DateAndObj{

    public DateAndFood(ModDate date, Food food){
        super(date,food);

    }

    public Food getFood(){return (Food) this.getObject();}

    public boolean isEqual(DateAndFood df){
        return (this.getDate().isEqual(df.getDate())&this.getFood().isEqual(df.getFood()));
    }

}
