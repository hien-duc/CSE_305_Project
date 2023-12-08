package Minh.Authentication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Patient.Patient;
import Doctor.Doctor;

public class AccountManager {
    private Map<String, Patient> patients = new HashMap<String, Patient>();
    private Map<String, Doctor> doctors = new HashMap<String, Doctor>();

    public Map<String, Patient> getPatients() {
        return patients;
    }

    public Map<String, Doctor> getDoctors() {
        return doctors;
    }

    public boolean register(Patient newPatient) {
        if (!patients.containsKey(newPatient.getUserName())) {
            patients.put(newPatient.getUserName(), newPatient);
            System.out.println("Account registered successfully.");
            return true;
        }
        System.out.println("Username already exists. Please choose another one.");
        return false;
    }

    public boolean register(Doctor newDoctor) {
        if (!doctors.containsKey(newDoctor.getUserName())) {
            doctors.put(newDoctor.getUserName(), newDoctor);
            System.out.println("Account registered successfully.");
            return true;
        }
        System.out.println("Username already exists. Please choose another one.");
        return false;
    }

    public boolean login(String username, String password) {
        if (patients.containsKey(username)) {
            Patient patient = patients.get(username);
            if (patient.getPassword().equals(password)) {
                System.out.println("Patient login successful. Welcome, " + patient.getName() + "!");
                return true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else if (doctors.containsKey(username)) {
            Doctor doctor = doctors.get(username);
            if (doctor.getPassword().equals(password)) {
                System.out.println("Doctor login successful. Welcome, Dr. " + doctor.getName() + "!");
                return true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("Username not found. Please register an account.");
        }
        return false;
    }

    public boolean changePassword(String username, String oldPassword, String newPassword) {
        if (patients.containsKey(username)) {
            Patient patient = patients.get(username);
            if (patient.getPassword().equals(oldPassword)) {
                patient.setPassword(newPassword);
                System.out.println("Change password successfully.");
                return true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else if (doctors.containsKey(username)) {
            Doctor doctor = doctors.get(username);
            if (doctor.getPassword().equals(oldPassword)) {
                doctor.setPassword(newPassword);
                System.out.println("Change password successfully.");
                return true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("Username not found. Please register an account.");
        }
        return false;
    }

    public ArrayList<Patient> getPatientList() {
        ArrayList<Patient> list = new ArrayList<Patient>(patients.values());
        return list;
    }

    public ArrayList<Doctor> getDoctorList() {
        ArrayList<Doctor> list = new ArrayList<Doctor>(doctors.values());
        return list;
    }
}
