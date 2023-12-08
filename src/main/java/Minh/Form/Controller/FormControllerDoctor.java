package Minh.Form.Controller;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import DAO.DoctorDAO;
import Doctor.Doctor;
import Minh.Authentication.AccountDAO;
import Minh.Form.Model.OfDoctor;

public class FormControllerDoctor {

    private Doctor modelDoctor;
    private OfDoctor viewDoctor;
    private DoctorDAO doctorDAO = new DoctorDAO();

    public FormControllerDoctor(Doctor modelDoctor, OfDoctor viewDoctor) {
        this.modelDoctor = modelDoctor;
        this.viewDoctor = viewDoctor;
        initViewDoctor();
        initActionDoctor();
    }

    private void initViewDoctor() {
        viewDoctor.setVisible(true);
    }

    public void initActionDoctor() {

        viewDoctor.getChangeMode().addActionListener(e -> doChangeMode(e));
        viewDoctor.getBtnConfirm().addActionListener(e -> confirmDoctor(e));
    }

    public void saveAccount() {
        ArrayList<Doctor> doctors = AccountDAO.restoreAccountDoctor();
        doctors.add(modelDoctor);
        AccountDAO.saveAccountDoctor(doctors);
    }

    private void confirmDoctor(java.awt.event.ActionEvent evt) {
        if (validDoctor()) {
            ArrayList<Doctor> doctors = new ArrayList<Doctor>();
            doctors = doctorDAO.restoreDataFromChar();
            doctors.add(modelDoctor);
            doctorDAO.saveDataByChar(doctors);
            saveAccount();
            JOptionPane.showMessageDialog(viewDoctor, "Successfully added your account, Welcome!");
        } else {
            JOptionPane.showMessageDialog(viewDoctor, "You may need to input all of them");
        }
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

    public boolean validDoctor() {
        int point = 0;
        if (!viewDoctor.getTxtFirstName().getText().equals("")) {
            point++;
        }
        if (!viewDoctor.getTxtLastname().getText().equals("")) {
            point++;
        }
        if (!viewDoctor.getTxtPhoneNumber().getText().equals("")) {
            point++;
        }
        if (!viewDoctor.getTxtEmail().getText().equals("")) {
            point++;
        }
        if (!viewDoctor.getTxtAge().getText().equals("")) {
            point++;
        }
        if (!viewDoctor.getTxtQualification().getText().equals("")) {
            point++;
        }
        if (!viewDoctor.getTxtMajor().getText().equals("")) {
            point++;
        }
        if (viewDoctor.getRdoFemale().isSelected() || viewDoctor.getRdoOther().isSelected()
                || viewDoctor.getRdoMale().isSelected()) {
            point++;
        }

        if (point == 8) {
            buildDoctor();
            return true;
        }
        return false;
    }

    private void buildDoctor() {
        modelDoctor.setName(viewDoctor.getTxtFirstName().getText() + " " + viewDoctor.getTxtLastname().getText());
        modelDoctor.setPhoneNumber(viewDoctor.getTxtPhoneNumber().getText());
        modelDoctor.setEmail(viewDoctor.getTxtEmail().getText());
        modelDoctor.setAge(viewDoctor.getTxtAge().getText());
        modelDoctor.setQualification(viewDoctor.getTxtQualification().getText());
        modelDoctor.setMajor(viewDoctor.getTxtMajor().getText());
        modelDoctor.setExperience(viewDoctor.getCboExperience().getSelectedItem().toString());
    }
}
