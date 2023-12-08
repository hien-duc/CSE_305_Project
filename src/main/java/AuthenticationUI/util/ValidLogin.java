package AuthenticationUI.util;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import AuthenticationUI.login.Login;
import AuthenticationUI.main.Application;
import Doctor.Doctor;
import Minh.Authentication.AccountDAO;
import Patient.Patient;

public class ValidLogin {

    private Login loginView;

    ArrayList<Patient> patients;
    ArrayList<Doctor> doctors;

    String username;
    char[] passwordArr;
    String password;

    public ValidLogin(Login loginView) {
        this.loginView = loginView;
    }

    public boolean doValidLogin() {
        getInformation();
        if (username.isEmpty() || passwordArr.length == 0) {
            JOptionPane.showMessageDialog(loginView, "Please fill in all required fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean checkAccount(int role) {
        if (role == GetRole.DOCTOR_SIDE.getCode()) {
            doctors = AccountDAO.restoreAccountDoctor();
            for (int i = 0; i < doctors.size(); i++) {
                Doctor temp = doctors.get(i);
                if (temp.getUserName().equals(username) && temp.getPassword().equals(password)) {
                    return true;
                }
            }
            JOptionPane.showMessageDialog(loginView, "Not found account", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            patients = AccountDAO.restoreAccountPatient();
            for (int i = 0; i < patients.size(); i++) {
                Patient temp = patients.get(i);
                if (temp.getUserName().equals(username) && temp.getPassword().equals(password)) {
                    return true;
                }
            }
            JOptionPane.showMessageDialog(loginView, "Not found account", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void getInformation() {
        username = loginView.getTxtUsername().getText();
        passwordArr = loginView.getTxtPassword().getPassword();
        password = Application.getStringPassword(passwordArr);
    }

    public String getUserName() {
        return loginView.getTxtUsername().getText();
    }

}