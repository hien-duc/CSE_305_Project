package Booking;

import DAO.DoctorDAO;
import Doctor.Doctor;


public class Booking {

    private Doctor doctor;
    private DoctorDAO doctorDao = new DoctorDAO();
    private String patientName;
    private String contact;
    private String patientGender;
    private String patientAge;
    private String patientProblem;

    public Booking() {
        
    }

    public Booking(Doctor doctor, String patientName,
            String contact, String patientGender, String patientAge, String patientProblem) {
        this.doctor = doctor;
        this.patientName = patientName;
        this.contact = contact;
        this.patientGender = patientGender;
        this.patientAge = patientAge;
        this.patientProblem = patientProblem;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientProblem(String patientProblem) {
        this.patientProblem = patientProblem;
    }

    public String getPatientProblem() {
        return patientProblem;
    }

    //RESET IS AVAILABLE
    public void resetDoctorIsAvl() {
        doctor.setIsAvailable("FALSE");
    }

    @Override
    public String toString() {
        return "Booking{"
                + "doctor=" + doctor.getName()
                + ", patientName='" + patientName + '\''
                + ", contactNumber='" + contact + '\''
                + ", patientGender='" + patientGender + '\''
                + ", patientAge=" + patientAge
                + ", patientProblem='" + patientProblem + '\''
                + '}';
    }
}
