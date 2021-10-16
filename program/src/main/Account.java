import java.util.*;

public class Account {
    /*This class will be hold Account basic information
     */

    private String password, username;
    private Date date;
    private Date birthday;
    private String gender;
    private ArrayList<String> date_record;
    private ArrayList<ArrayList<String>> food_record;

    public Account(String password, String username, Date date, Date birthday, String gender){
        this.password = password;
        this.username = username;
        this.date = date;
        this.birthday = birthday;
        this.gender = gender;
        this.date_record = new ArrayList<>();
        this.food_record = new ArrayList<>();
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

    public ArrayList<String> get_specific_Food_record(String date) {
        if (this.date_record.contains(date)) {
            int index = this.date_record.indexOf(date);
            return this.food_record.get(index);
        }
        return null;
    }

    public void update_food_record(Calendar date, String fd) { //add food eaten at certain date(key) to the HashMap
        String temp = ((Integer) date.get(Calendar.YEAR)).toString() + ',' +
                ((Integer)date.get(Calendar.MONTH)).toString() + ',' +
                ((Integer) date.get(Calendar.DAY_OF_MONTH)).toString(); // turn date into a string representing date
        if (this.date_record.contains(temp)) {
            int index = this.date_record.indexOf(temp);
            this.food_record.get(index).add(fd);
        }
        else {
            ArrayList<String> fd_temp = new ArrayList<>();
            fd_temp.add(fd);
            this.date_record.add(temp);
            this.food_record.add(fd_temp);
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username){
        this.username = username;
    }
}

