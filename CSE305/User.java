
import java.time.LocalDate;

public class User {

    //Data members
    protected String userName;
    protected String name;
    protected String phoneNumber;
    protected String email;
    protected String gender;
    protected String password;

    //constructors
    public User() {

    }

    public User(String userName, String name, String phoneNumber, String email, String gender, String password) {
        this.userName = userName;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }
    
    //Methods

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void displayInfo(){
        
    }
    public boolean register(){
        return true;
    }
    public boolean login(){
        return true;
    }

}
