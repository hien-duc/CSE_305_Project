
public class DoctorConcrete implements DoctorBuilder {

    // Data members
    protected String age;
    protected String qualification;
    protected String major;
    protected String experience;
    protected String isAvailable;

 

    @Override
    public DoctorBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    @Override
    public DoctorBuilder setQualification(String qualificatio) {
        this.qualification = qualificatio;
        return this;
    }

    @Override
    public DoctorBuilder setMajor(String major) {
        this.major = major;
        return this;
    }

    @Override

    public DoctorBuilder setisAvailable(String isavai) {
        this.isAvailable = isavai;
        return this;
    }

    @Override
    public DoctorBuilder setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    @Override
    public Doctor build() {
        Doctor doctor = new Doctor(age, qualification, major, experience, isAvailable);
doctor= new Doctor(age, qualification, major, experience, isAvailable,doctor.getUserName(),doctor.getName(),doctor.getPhoneNumber(),doctor.getEmail(),doctor.getGender(),doctor.getPassword());
        return doctor;
    }

}
