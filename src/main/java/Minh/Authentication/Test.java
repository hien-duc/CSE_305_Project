package Minh.Authentication;

import java.util.ArrayList;
import java.util.Map;

import Doctor.Doctor;
import Patient.Patient;

public class Test {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        Doctor modelDoctor = new Doctor(
                "35", // Age
                "MD", // Qualification
                "Cardiology", // Major
                "10 years", // Experience
                "Yes", // Is Available
                "c", // Username
                "a", // Name
                "555-5678", // Phone Number
                "dr.smith@email.com", // Email
                "Male", // Gender
                "c" // Password
        );

        Doctor modelDoctor1 = new Doctor(
                "35", // Age
                "MD", // Qualification
                "Cardiology", // Major
                "10 years", // Experience
                "Yes", // Is Available
                "d", // Username
                "a", // Name
                "555-5678", // Phone Number
                "dr.smith@email.com", // Email
                "Male", // Gender
                "d" // Password
        );

        Patient patient1 = new Patient("1990-05-15", "Software Engineer", "Health Insurance Inc.", "175 cm", "70 kg",
                "A+",
                "a", "John Doe", "123-456-7890", "john.doe@example.com", "Male", "a");

        // Example 2: Creating a Patient instance with different values
        Patient patient2 = new Patient("1985-08-20", "Doctor", "Medical Insurance Corp.", "180 cm", "85 kg", "B-",
                "b", "Jane Smith", "987-654-3210", "jane.smith@example.com", "Female", "b");
        // User doctor = new Doctor("")
        manager.register(modelDoctor);
        manager.register(modelDoctor1);
        manager.register(patient1);
        manager.register(patient2);
        // System.out.println(manager.getPatients().get("john@example.com").getInsurance());

        // doctorDAO.saveDataByChar(manager.getListDoctor());
        AccountDAO.saveAccountPatient(manager.getPatientList());
        AccountDAO.saveAccountDoctor(manager.getDoctorList());
        ArrayList<Doctor> doctors = AccountDAO.restoreAccountDoctor();
        System.out.println(doctors.get(0).getPassword());
        // ArrayList<Patient> temp1 = patientDAO.restoreDataFromChar();
    }
}