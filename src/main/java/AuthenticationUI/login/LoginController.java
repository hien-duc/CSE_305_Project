package AuthenticationUI.login;

import javax.swing.JOptionPane;

import AuthenticationUI.util.GetRole;
import AuthenticationUI.util.ValidLogin;

import DoctorMain.DoctorMain;

import PateintMain.PatientMain;

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
        PatientMain main = new PatientMain();
        main.setVisible(true);
    }

    private void openDoctorUI() {
        DoctorMain main = new DoctorMain();
        main.setVisible(true);
    }
}