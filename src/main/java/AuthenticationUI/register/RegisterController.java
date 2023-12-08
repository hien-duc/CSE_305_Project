package AuthenticationUI.register;

import AuthenticationUI.util.GetRole;
import AuthenticationUI.util.ValidRegister;
import Doctor.Doctor;
import Minh.Form.Controller.FormControllerDoctor;
import Minh.Form.Controller.FormControllerPatient;
import Minh.Form.Model.OfDoctor;
import Minh.Form.Model.OfPatient;
import Patient.Patient;

import javax.swing.*;

public class RegisterController {
   private Register registerView;
   ValidRegister validator;

   public RegisterController(Register registerView) {
      this.registerView = registerView;
      validator = new ValidRegister(registerView);
      initActions();
   }

   public void initActions() {
      registerView.getBtnRegisterPatient().addActionListener(e -> RegisterPatientPerformed());
      registerView.getBtnRegisterDoctor().addActionListener(e -> RegisterDoctorPerformed());
   }

   public void RegisterDoctorPerformed() {
      if (validator.doValidRegister()) {
         if (validator.doCheckDuplicate(GetRole.DOCTOR_SIDE.getCode())) {
            JOptionPane.showMessageDialog(registerView,
                  "Register successfully! Please fill all information in the form");
            OfDoctor doctorView = new OfDoctor();
            Doctor doctor = new Doctor();
            doctor.setUserName(validator.getUsername());
            doctor.setPassword(validator.getPassword());
            new FormControllerDoctor(doctor, doctorView);
         }
      }
   }

   public void RegisterPatientPerformed() {
      if (validator.doValidRegister()) {
         if (validator.doCheckDuplicate(GetRole.PATIENT_SIDE.getCode())) {
            JOptionPane.showMessageDialog(registerView,
                  "Register successfully! Please fill all information in the form");
            OfPatient patientView = new OfPatient();
            Patient patient = new Patient();
            patient.setUserName(validator.getUsername());
            patient.setPassword(validator.getPassword());
            new FormControllerPatient(patient, patientView);
         }
      }
   }

}
