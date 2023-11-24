
public class Doctor extends User {

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
