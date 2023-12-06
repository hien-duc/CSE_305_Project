package AuthenticationUI.login;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import AuthenticationUI.main.Application;
import Doctor.Doctor;
import DoctorMain.DoctorMain;
import Minh.Authentication.AccountDAO;
import PateintMain.PatientMain;
import Patient.Patient;

public class LoginController {
    private Login loginView;
    private Application application;

    ArrayList<Patient> patients;
    ArrayList<Doctor> doctors;

    String username;
    char[] passwordArr;
    String password;
    boolean rememberMe;

    public LoginController(Login loginView, Application application) {
        this.application = application;
        this.loginView = loginView;
        initAction();
    }

    public void initAction() {
        loginView.getBtnLoginPatient().addActionListener(e -> LoginPerformedPatient());
        loginView.getBtnLoginDoctor().addActionListener(e -> LoginPerformedDoctor());

    }

    private void LoginPerformedPatient() {
        if (validation()) {
            patients = AccountDAO.restoreAccountPatient();
            for (int i = 0; i < patients.size(); i++) {
                if (username.equals(patients.get(i).getUserName())) {
                    JOptionPane.showMessageDialog(loginView, "Login successful. Welcome, Patient!");
                    openPatientUI();
                    application.hideLogin();
                    return;
                }
            }
        }
    }

    public void LoginPerformedDoctor() {
        if (validation()) {
            doctors = AccountDAO.restoreAccountDoctor();
            for (int i = 0; i < doctors.size(); i++) {
                if (username.equals(doctors.get(i).getUserName())) {
                    JOptionPane.showMessageDialog(loginView, "Login successful. Welcome, Doctor!");
                    openDoctorUI();
                    application.hideLogin();
                    return;
                }
            }
            JOptionPane.showMessageDialog(loginView, "Invalid credentials. Please check your username and password.");

        }
    }

    private void openPatientUI() {
        PatientMain main = new PatientMain();
        main.setVisible(true);
    }

    private void openDoctorUI() {
        DoctorMain main = new DoctorMain();
        main.setVisible(true);
    }

    public boolean validation() {
        getInformationLogin();
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(loginView, "Please enter both username and password.");
            return false;
        }
        return true;
    }

    public void getInformationLogin() {
        username = loginView.getTxtUsername().getText();
        passwordArr = loginView.getTxtPassword().getPassword();
        password = Application.getStringPassword(passwordArr);
        rememberMe = loginView.getChkRememberMe().isSelected();
    }
}