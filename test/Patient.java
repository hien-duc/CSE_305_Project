
import java.time.LocalDate;
import java.util.Calendar;

public class Patient extends User {

    //Data members
    protected LocalDate dOB;
    protected String job;
    protected String insurance;

    //Constructors
    public Patient() {

    }

    public Patient(String dOB, String job, String insurance) {
        this.dOB = LocalDate.parse(dOB);
        this.job = job;
        this.insurance = insurance;
    }

    public Patient(String dOB, String job, String insurance, String userName, String name, String phoneNumber, String email, String gender, String password) {
        super(userName, name, phoneNumber, email, gender, password);
        this.dOB = LocalDate.parse(dOB);
        this.job = job;
        this.insurance = insurance;
    }

    //Method
    public int calAge(LocalDate dOB) {
        Calendar instance = Calendar.getInstance();
        int currentYear = instance.get(Calendar.YEAR);

        return currentYear - dOB.getYear();

    }

    public LocalDate getdOB() {
        return dOB;
    }

    public void setdOB(LocalDate dOB) {
        this.dOB = dOB;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

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

}
