package Minh;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import DAO.DoctorDAO;
import DAO.PatientDAO;
import Doctor.Doctor;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Minh.UI.FormRegister.ofDoctor;
import Minh.UI.FormRegister.ofPatient;
import Patient.Patient;

public class Controller {
    private Patient modelPatient;
    private ofPatient viewPatient;
    private Doctor modelDoctor;;
    private ofDoctor viewDoctor;
    private PatientDAO patientDAO = new PatientDAO();
    private DoctorDAO doctorDAO = new DoctorDAO();

    public Controller(Patient modelPatient, ofPatient viewPatient) {
        this.modelPatient = modelPatient;
        this.viewPatient = viewPatient;
        initViewPatient();
    }

    public Controller(Doctor modelDoctor, ofDoctor viewDoctor) {
        this.modelDoctor = modelDoctor;
        this.viewDoctor = viewDoctor;
        initViewDoctor();
    }

    public void initViewPatient() {
        try {
            viewPatient.getTxtFirstName().setText(modelPatient.getName().split(" ")[0]);
            viewPatient.getTxtLastname().setText(modelPatient.getName().split(" ")[1]);
            viewPatient.getTxtPhoneNumber().setText(modelPatient.getPhoneNumber());
            viewPatient.getTxtEmail().setText(modelPatient.getEmail());
            viewPatient.getTxtDOB().setText(modelPatient.getdOB());
            viewPatient.getTxtHeight().setText(modelPatient.getHeight());
            viewPatient.getTxtWeight().setText(modelPatient.getWeight());
            viewPatient.getCboBloodType().setSelectedItem(modelPatient.getBloodType());
            if (modelPatient.getGender().equalsIgnoreCase("male")) {
                viewPatient.getRdoMale().setSelected(true);
            } else if (modelPatient.getGender().equalsIgnoreCase("female")) {
                viewPatient.getRdoFemale().setSelected(true);
            } else {
                viewPatient.getRdoOther().setSelected(true);
            }

            if (modelPatient.getInsurance().equalsIgnoreCase("yes")) {
                viewPatient.getRdoInsuranceYes().setSelected(true);
            } else if (modelPatient.getInsurance().equalsIgnoreCase("no")) {
                viewPatient.getRdoInsuranceNo().setSelected(true);
            }

            viewPatient.setVisible(true);

        } catch (Exception e) {

        }
    }

    private void initViewDoctor() {
        try {
            viewDoctor.getTxtFirstName().setText(modelDoctor.getName().split(" ")[0]);
            viewDoctor.getTxtLastname().setText(modelDoctor.getName().split(" ")[1]);
            viewDoctor.getTxtPhoneNumber().setText(modelDoctor.getPhoneNumber());
            viewDoctor.getTxtEmail().setText(modelDoctor.getEmail());
            viewDoctor.getTxtAge().setText(modelDoctor.getAge());
            viewDoctor.getTxtQualification().setText(modelDoctor.getQualification());
            viewDoctor.getTxtMajor().setText(modelDoctor.getMajor());
            viewDoctor.getCboExperience().setSelectedItem(modelDoctor.getExperience());
            viewDoctor.setVisible(true);

        } catch (Exception e) {

        }
    }

    public void initActionPatient() {
        viewPatient.getChangeMode().addActionListener(e -> doChangeMode(e));
        viewPatient.getBtnConfirm().addActionListener(e -> confirmPatient(e));
    }

    public void initActionDoctor() {
        viewDoctor.getChangeMode().addActionListener(e -> doChangeMode(e));
        viewDoctor.getBtnConfirm().addActionListener(e -> confirmDoctor(e));
    }

    private void confirmDoctor(java.awt.event.ActionEvent evt) {
        if (validDoctor()) {
            ArrayList<Doctor> doctors = new ArrayList<Doctor>();
            doctors = doctorDAO.restoreDataFromChar();
            doctors.add(modelDoctor);
            doctorDAO.saveDataByChar(doctors);
            JOptionPane.showMessageDialog(viewPatient, "Successfully");
        } else {
            JOptionPane.showMessageDialog(viewPatient, "You may need to input all of them");
        }
    }

    private void confirmPatient(java.awt.event.ActionEvent evt) {
        if (validPatient()) {
            ArrayList<Patient> patients = new ArrayList<Patient>();
            patients = patientDAO.restoreDataFromChar();
            patients.add(modelPatient);
            patientDAO.saveDataByChar(patients);
            JOptionPane.showMessageDialog(viewPatient, "Yes");
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
        if (viewPatient.getRdoFemale().isSelected() || viewPatient.getRdoOther().isSelected()
                || viewPatient.getRdoMale().isSelected()) {
            point++;
        }
        if (viewPatient.getRdoInsuranceNo().isSelected() || viewPatient.getRdoInsuranceYes().isSelected()) {
            point++;
        }
        System.out.println(point);
        if (point == 9) {
            buildPatient();
            return true;
        }
        return false;
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

        System.out.println(point);
        if (point == 7) {
            buildDoctor();
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
