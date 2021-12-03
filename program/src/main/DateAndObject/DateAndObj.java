package DateAndObject;

import OtherObjects.ModDate;

public class DateAndObj {
    private ModDate date;
    private Object object;


    public DateAndObj(ModDate d, Object obj){
        this.date=d;
        this.object=obj;
    }

    public ModDate getDate() {
        return date;
    }

    public Object getObject() {
        return object;
    }

    public void setDate(ModDate date) {
        this.date = date;
    }

    public void setObject(Object object) {
        this.object = object;
    }


}
