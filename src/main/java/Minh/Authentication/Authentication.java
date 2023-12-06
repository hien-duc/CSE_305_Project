package Minh.Authentication;

import java.util.ArrayList;

import DAO.DoctorDAO;

import Doctor.Doctor;
import Doctor.DoctorManagement;

public class Authentication {

    public static void main(String[] args) {

        DoctorManagement manager = new DoctorManagement();
        DoctorDAO doctorDAO = new DoctorDAO();

        Doctor modelDoctor = new Doctor(
                "35", // Age
                "MD", // Qualification
                "Cardiology", // Major
                "10 years", // Experience
                "Yes", // Is Available
                "dr_smith123", // Username
                "Dr. Smith", // Name
                "555-5678", // Phone Number
                "dr.smith@email.com", // Email
                "Male", // Gender
                "securePassword" // Password
        );
        // User doctor = new Doctor("")
        manager.addDoctor(modelDoctor);
        // System.out.println(manager.getPatients().get("john@example.com").getInsurance());

        // doctorDAO.saveDataByChar(manager.getListDoctor());
        ArrayList<Doctor> doctors = doctorDAO.restoreDataFromChar();
        // ArrayList<Patient> temp1 = patientDAO.restoreDataFromChar();
    }
}