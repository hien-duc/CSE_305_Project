package Patient;

import java.io.Serializable;
import java.util.Calendar;

import Project.User;

public class Patient extends User implements Serializable {

    // Data members
    protected String dOB;
    protected String job;
    protected String insurance;
    protected String height;
    protected String weight;
    protected String bloodType;

    // Constructors
    public Patient() {

    }

    public Patient(String dOB, String job, String insurance, String height, String weight, String bloodType) {
        this.dOB = dOB;
        this.job = job;
        this.insurance = insurance;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
    }

    public Patient(String dOB, String job, String insurance, String height, String weight, String bloodType,
            String userName, String name, String phoneNumber,
            String email, String gender, String password) {
        super(userName, name, phoneNumber, email, gender, password);
        this.dOB = dOB;
        this.job = job;
        this.insurance = insurance;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;

    }

    // Method
    public int calculateAge(String dOB) {
        Calendar instance = Calendar.getInstance();
        int currentYear = instance.get(Calendar.YEAR);
        System.out.println(currentYear - Integer.parseInt(dOB.substring(6, dOB.length())));
        return currentYear - Integer.parseInt(dOB.substring(6, dOB.length()));
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

}
