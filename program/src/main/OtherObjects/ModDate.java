package OtherObjects;

public class ModDate {
    private int year;
    private int month;
    private int day;

    public ModDate(int y, int m, int d){
        this.year=y;
        this.month=m;
        this.day=d;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isEqual(ModDate date){
        return (this.year==date.year&this.month==date.month&this.day==date.day);
    }

    public String beString(){return Integer.toString(this.year)
                            +"."+Integer.toString(this.month)+"."+Integer.toString(this.day);}

}
