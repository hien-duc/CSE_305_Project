package AuthenticationUI.util;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import AuthenticationUI.main.Application;
import AuthenticationUI.register.Register;
import Doctor.Doctor;
import Minh.Authentication.AccountDAO;
import Patient.Patient;

public class ValidRegister {
    private Register registerView;

    ArrayList<Patient> patients;
    ArrayList<Doctor> doctors;

    String username;
    char[] passwordArr;
    String password;
    char[] confirmPasswordArr;
    String confirmPassword;

    public ValidRegister(Register registerView) {
        this.registerView = registerView;
    }

    public boolean doValidRegister() {
        getInformation();
        if (username.isEmpty() || passwordArr.length == 0 || confirmPasswordArr.length == 0) {
            JOptionPane.showMessageDialog(registerView, "Please fill in all required fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(registerView, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public boolean doCheckDuplicate(int role) {
        if (role == GetRole.DOCTOR_SIDE.getCode()) {
            doctors = AccountDAO.restoreAccountDoctor();
            for (int i = 0; i < doctors.size(); i++) {
                if (doctors.get(i).getUserName().equals(username)) {
                    JOptionPane.showMessageDialog(registerView, "Duplicate username", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            return true;
        } else {
            patients = AccountDAO.restoreAccountPatient();
            for (int i = 0; i < patients.size(); i++) {
                if (patients.get(i).getUserName().equals(username)) {
                    JOptionPane.showMessageDialog(registerView, "Duplicate username", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            return true;
        }
    }

    private void getInformation() {
        username = registerView.getTxtUsername().getText();
        passwordArr = registerView.getTxtPassword().getPassword();
        password = Application.getStringPassword(passwordArr);
        confirmPasswordArr = registerView.getTxtConfirmPassword().getPassword();
        confirmPassword = Application.getStringPassword(confirmPasswordArr);
    }

    public String getUsername() {
        return registerView.getTxtUsername().getText();
    }

    public String getPassword() {
        return Application.getStringPassword(registerView.getTxtPassword().getPassword());
    }

}