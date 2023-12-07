package Doctor;



import java.io.Serializable;

import Project.User;

public class Doctor extends User implements Serializable{

  //Data members
    protected String age;
    protected String qualification;
    protected String major;
    protected String experience;
    protected String isAvailable;

    //Constructor
    public Doctor(){
        
    }
    public Doctor(String age, String qualification, String major, String experience, String isAvailable) {
        this.age = age;
        this.qualification = qualification;
        this.major = major;
        this.experience = experience;
        this.isAvailable = isAvailable;
    }

    public Doctor(String age, String qualification, String major, String experience, String isAvailable, String userName, String name, String phoneNumber, String email, String gender, String password) {
        super(userName, name, phoneNumber, email, gender, password);
        this.age = age;
        this.qualification = qualification;
        this.major = major;
        this.experience = experience;
        this.isAvailable = isAvailable;
    }

    // Methods
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
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


}
