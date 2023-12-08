package AuthenticationUI.login;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import AuthenticationUI.util.GetRole;
import AuthenticationUI.util.ValidLogin;
import DAO.DoctorDAO;
import DAO.PatientDAO;
import Doctor.Doctor;
import Doctor.DoctorManagement;
import DoctorMain.DoctorMain;

import PateintMain.PatientMain;
import Patient.Patient;
import Patient.PatientManagement;

public class LoginController {
    private Login loginView;
    ValidLogin validator;

    public LoginController(Login loginView) {
        this.loginView = loginView;
        validator = new ValidLogin(loginView);
        initAction();
    }

    public void initAction() {
        loginView.getBtnLoginPatient().addActionListener(e -> LoginPatientPerformed());
        loginView.getBtnLoginDoctor().addActionListener(e -> LoginDoctorPerformed());

    }

    private void LoginPatientPerformed() {
        if (validator.doValidLogin()) {
            if (validator.checkAccount(GetRole.PATIENT_SIDE.getCode())) {
                JOptionPane.showMessageDialog(loginView, "Welcome back, " + validator.getUserName());
                openPatientUI();
            }

        }
    }

    public void LoginDoctorPerformed() {
        if (validator.doValidLogin()) {
            if (validator.checkAccount(GetRole.DOCTOR_SIDE.getCode())) {
                JOptionPane.showMessageDialog(loginView, "Welcome back, Dr." + validator.getUserName());
                openDoctorUI();
            }

        }
    }

    private void openPatientUI() {
        PatientManagement manager = new PatientManagement();
        PatientDAO patientDAO = new PatientDAO();
        ArrayList<Patient> list = patientDAO.restoreDataFromChar();
        Patient patient = manager.searchByUserName(validator.getUserName());
        PatientMain main = new PatientMain(patient);

        main.setVisible(true);
    }

    private void openDoctorUI() {
        DoctorManagement manager = new DoctorManagement();
        DoctorDAO doctorDAO = new DoctorDAO();
        ArrayList<Doctor> list = doctorDAO.restoreDataFromChar();
        Doctor doctor = manager.searchbyUserName(validator.getUserName());
        DoctorMain main = new DoctorMain(doctor);
        main.setVisible(true);
    }
}