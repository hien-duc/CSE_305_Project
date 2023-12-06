package AuthenticationUI.register;

import AuthenticationUI.main.Application;
import Doctor.Doctor;
import DoctorMain.DoctorMain;
import Minh.Authentication.AccountDAO;
import PateintMain.PatientMain;
import Patient.Patient;

import java.util.ArrayList;

import javax.swing.*;

public class RegisterController {
    private Register registerView;
    private Application application;

    ArrayList<Patient> patients;
    ArrayList<Doctor> doctors;

    String username;
    char[] passwordArr;
    String password;
    char[] confirmPasswordArr;
    String confirmPassword;

    public RegisterController(Register registerView, Application application) {
        this.registerView = registerView;
        this.application = application;
        initActions();
    }

    public void initActions() {
        registerView.getBtnRegisterPatient().addActionListener(e -> registerPatient());
        registerView.getBtnRegisterDoctor().addActionListener(e -> registerDoctor());
    }

    public void registerPatient() {
        if (validateRegistration()) {
            openPatientUI();
            application.hideLogin();
        }
    }

    public void registerDoctor() {
        if (validateRegistration()) {
            openDoctorUI();
            application.hideLogin();

        }
    }

    private boolean validateRegistration() {
        patients = AccountDAO.restoreAccountPatient();
        getInformation();

        if (registerView.getTxtUsername().getText().isEmpty() ||
                registerView.getTxtPassword().getPassword().length == 0 ||
                registerView.getTxtConfirmPassword().getPassword().length == 0) {
            JOptionPane.showMessageDialog(registerView, "Please fill in all required fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(registerView, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getUserName().equals(registerView.getTxtUsername().getText())) {
                JOptionPane.showMessageDialog(registerView, "Duplicate username", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private void openPatientUI() {
        PatientMain patientMain = new PatientMain();
        patientMain.setVisible(true);
    }

    private void openDoctorUI() {
        DoctorMain doctorMain = new DoctorMain();
        doctorMain.setVisible(true);
    }

    public void getInformation() {
        username = registerView.getTxtUsername().getText();
        passwordArr = registerView.getTxtPassword().getPassword();
        password = Application.getStringPassword(passwordArr);
        confirmPasswordArr = registerView.getTxtConfirmPassword().getPassword();
        confirmPassword = Application.getStringPassword(confirmPasswordArr);
    }
}
