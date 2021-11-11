import java.util.*;

public class Account {
    /*This class will be hold Account basic information
     */

    private String password, username;
    private final Date date;
    private Date birthday;
    private String gender;
    private final ArrayList<String> date_record;
    // the setter function for date_record is inside update_food_record
    // String type of date is in "yyyy,mm,dd" type.
    private final ArrayList<ArrayList<String>> food_record;
    // the setter function for food_record is inside update_food_record
    // the index of date(String type) is corresponding to the index of ArrayList of food inside food_record
    // This ArrayList contains all food eaten in date(String type)
    private ArrayList<ArrayList<Double>> weight_record;

    public Account(String password, String username, Date date, Date birthday, String gender){
        this.password = password;
        this.username = username;
        this.date = date;
        this.birthday = birthday;
        this.gender = gender;
        this.date_record = new ArrayList<>();
        this.food_record = new ArrayList<>();
        this.weight_record = new ArrayList<>();
    }

    public String getName_for_user(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public Date getBirthday() { return birthday; }

    public String getGender() { return gender; }

    public Date getDate() {
        return date;
    }

    public ArrayList<ArrayList<String>> getFood_record() {
        return this.food_record;
    }

    public ArrayList<String> getDate_record() {
        return this.date_record;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setBirthday(Date birthday) {this.birthday = birthday;}

    public void setGender(String gender) {this.gender = gender;}

    public ArrayList<ArrayList<Double>> getWeight_record() {return this.weight_record;}
}

