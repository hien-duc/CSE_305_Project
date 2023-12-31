package Minh.Form.Controller;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import DAO.PatientDAO;
import Minh.Authentication.AccountDAO;
import Minh.Form.Model.OfPatient;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import Patient.Patient;
import java.awt.Font;

public class FormControllerPatient {
    private Patient modelPatient;
    private OfPatient viewPatient;
    private PatientDAO patientDAO = new PatientDAO();

    public FormControllerPatient(Patient modelPatient, OfPatient viewPatient) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("crazypanel");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();

        this.modelPatient = modelPatient;
        this.viewPatient = viewPatient;
        initViewPatient();
        initActionPatient();
    }

    public void initViewPatient() {
        viewPatient.setVisible(true);
    }

    public void initActionPatient() {
        viewPatient.getChangeMode().addActionListener(e -> doChangeMode(e));
        viewPatient.getBtnConfirm().addActionListener(e -> confirmPatient(e));
    }

    public void saveAccount() {
        ArrayList<Patient> patients = AccountDAO.restoreAccountPatient();
        patients.add(modelPatient);
        AccountDAO.saveAccountPatient(patients);
    }

    private void confirmPatient(java.awt.event.ActionEvent evt) {
        if (validPatient()) {
            ArrayList<Patient> patients = new ArrayList<Patient>();
            patients = patientDAO.restoreDataFromChar();
            patients.add(modelPatient);
            patientDAO.saveDataByChar(patients);
            saveAccount();
            JOptionPane.showMessageDialog(viewPatient, "Successfully added your account, Welcome!");
        } else {
            JOptionPane.showMessageDialog(viewPatient, "You may need to input all of them");
        }
    }

    public String[] separateName(String nameString) {
        return nameString.split(" ");
    }

    private void doChangeMode(java.awt.event.ActionEvent evt) {
        EventQueue.invokeLater(() -> {
            FlatAnimatedLafChange.showSnapshot();
            if (!FlatLaf.isLafDark()) {
                FlatMacDarkLaf.setup();
            } else {
                FlatMacLightLaf.setup();
            }

            FlatLaf.updateUI();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    }

    public boolean validPatient() {
        int point = 0;
        if (!viewPatient.getTxtFirstName().getText().equals("")) {
            point++;
        }
        if (!viewPatient.getTxtLastname().getText().equals("")) {
            point++;
        }
        if (!viewPatient.getTxtPhoneNumber().getText().equals("")) {
            point++;
        }
        if (!viewPatient.getTxtEmail().getText().equals("")) {
            point++;
        }
        if (!viewPatient.getTxtDOB().getText().equals("")) {
            point++;
        }
        if (!viewPatient.getTxtHeight().getText().equals("")) {
            point++;
        }
        if (!viewPatient.getTxtWeight().getText().equals("")) {
            point++;
        }
        if (!viewPatient.getTxtJob().getText().equals("")) {
            point++;
        }
        if (viewPatient.getRdoFemale().isSelected() || viewPatient.getRdoOther().isSelected()
                || viewPatient.getRdoMale().isSelected()) {
            point++;
        }
        if (viewPatient.getRdoInsuranceNo().isSelected() || viewPatient.getRdoInsuranceYes().isSelected()) {
            point++;
        }
        if (point == 10) {
            buildPatient();
            return true;
        }
        return false;
    }

    public void buildPatient() {
        modelPatient.setName(viewPatient.getTxtFirstName().getText() + " " + viewPatient.getTxtLastname().getText());
        modelPatient.setPhoneNumber(viewPatient.getTxtPhoneNumber().getText());
        modelPatient.setEmail(viewPatient.getTxtEmail().getText());
        modelPatient.setdOB(viewPatient.getTxtDOB().getText());
        modelPatient.setWeight(viewPatient.getTxtWeight().getText());
        modelPatient.setHeight(viewPatient.getTxtHeight().getText());
        modelPatient.setBloodType(viewPatient.getCboBloodType().getSelectedItem().toString());
        modelPatient.setJob(viewPatient.getTxtJob().getText());
        if (viewPatient.getRdoMale().isSelected()) {
            modelPatient.setGender("Male");
        } else if (viewPatient.getRdoFemale().isSelected()) {
            modelPatient.setGender("Female");
        } else {
            modelPatient.setGender("Other");
        }

        if (viewPatient.getRdoInsuranceYes().isSelected()) {
            modelPatient.setInsurance("Yes");
        } else if (viewPatient.getRdoInsuranceNo().isSelected()) {
            modelPatient.setInsurance("No");
        }

    }

}
