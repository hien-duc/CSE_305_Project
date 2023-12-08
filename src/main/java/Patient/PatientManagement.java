package Patient;

import DAO.PatientDAO;

import java.util.ArrayList;

public class PatientManagement {

    // Data members
    private PatientDAO patientDao = new PatientDAO();
    private ArrayList<Patient> listPatient = patientDao.restoreDataFromChar();
    private int numOfPatient = listPatient.size();

    // Constructors
    public PatientManagement() {

    }

    // Methods
    public ArrayList<Patient> getListPatient() {
        return listPatient;
    }

    public void setListPatient(ArrayList<Patient> manager) {
        this.listPatient = manager;
    }

    public Patient searchByUserName(String userName) {
        for (int i = 0; i < numOfPatient; i++) {
            Patient temp = listPatient.get(i);
            if (temp.getUserName().equals(userName)) {
                return temp;
            }
        }
        return null;
    }

    public Patient searchByName(String name) {
        for (int i = 0; i < numOfPatient; i++) {
            Patient temp = listPatient.get(i);
            if (temp.getName().equals(name)) {
                return temp;
            }
        }
        return null;
    }

    public boolean addPatient(Patient patient) {
        Patient newPatient = searchByUserName(patient.getUserName());
        if (newPatient == null) {
            listPatient.add(newPatient);
            numOfPatient++;
            return true;
        }
        return false;
    }

    public boolean editPatient(Patient editPatient) {
        Patient tempPatient = searchByUserName(editPatient.getUserName());

        if (tempPatient != null) {
            listPatient.set(listPatient.indexOf(tempPatient), editPatient);

            return true;
        } else {
            return false;
        }
    }

}
