/**
 * DoctorBuilder
 */
public interface DoctorBuilder {
    

    DoctorBuilder setAge(String age);

    DoctorBuilder setQualification(String qualification);

    DoctorBuilder setMajor(String major);

    DoctorBuilder setExperience(String isavai);

    DoctorBuilder setisAvailable(String isavai);

    Doctor build();

}