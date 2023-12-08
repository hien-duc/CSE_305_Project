
package PatientForm;

import java.util.ArrayList;

import DAO.PatientDAO;
import Patient.Patient;
import Patient.PatientManagement;

public class Patient_FormHome extends javax.swing.JPanel {
    private PatientDAO patientDao = new PatientDAO();
    private PatientManagement patientManager = new PatientManagement();
    private ArrayList<Patient> listPatient = patientDao.restoreDataFromChar();
    private Patient patient;

    public Patient_FormHome(Patient patient) {
        this.patient = patient;
        patientManager.setListPatient(patientDao.restoreDataFromChar());
        initComponents();
        fillData();

    }

    public void fillData() {
        lblPatientAge.setText(String.valueOf(patient.calculateAge(patient.getdOB())));
        lblPatientBloodType.setText(patient.getBloodType());
        lblPatientDoB.setText(patient.getdOB());
        lblPatientEmail.setText(patient.getEmail());
        lblPatientHeight.setText(patient.getHeight());
        lblPatientJob.setText(patient.getJob());
        lblPatientName.setText(patient.getName());
        lblPatientPhoneNum.setText(patient.getPhoneNumber());
        lblPatientWeight.setText(patient.getWeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSlider3 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        hei = new javax.swing.JLabel();
        lblPatientHeight = new javax.swing.JLabel();
        wei = new javax.swing.JLabel();
        lblPatientWeight = new javax.swing.JLabel();
        blood = new javax.swing.JLabel();
        lblPatientBloodType = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPatientPhoneNum = new javax.swing.JLabel();
        lblPatientJob = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPatientDoB = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPatientEmail = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSlider3.setForeground(new java.awt.Color(255, 255, 102));
        jSlider3.setMinimum(74);
        jSlider3.setValue(84);
        jPanel3.add(jSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 90, -1));

        jSlider2.setForeground(new java.awt.Color(255, 255, 102));
        jSlider2.setMaximum(150);
        jSlider2.setMinimum(80);
        jSlider2.setValue(96);
        jPanel3.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\doctorSticker.JPG"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 230, 330));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\howAruFelTday.JPG"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 170));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hei.setForeground(new java.awt.Color(255, 255, 255));
        hei.setText("Height");
        jPanel1.add(hei, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        lblPatientHeight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPatientHeight.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientHeight.setText("50");
        jPanel1.add(lblPatientHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 40, -1));

        wei.setForeground(new java.awt.Color(255, 255, 255));
        wei.setText("Weight");
        jPanel1.add(wei, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        lblPatientWeight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPatientWeight.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientWeight.setText("160");
        jPanel1.add(lblPatientWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 40, -1));

        blood.setForeground(new java.awt.Color(255, 255, 255));
        blood.setText("Blood Type");
        jPanel1.add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        lblPatientBloodType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPatientBloodType.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientBloodType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientBloodType.setText("AB");
        jPanel1.add(lblPatientBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 60, -1));

        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientAge.setText("Age");
        jPanel1.add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        lblPatientName.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientName.setText("Patient_Name");
        jPanel1.add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\user.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\blueBackground.JPG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 340, 130));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Phone:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Job:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblPatientPhoneNum.setForeground(new java.awt.Color(102, 102, 102));
        lblPatientPhoneNum.setText("0217387322");
        jPanel1.add(lblPatientPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 20));

        lblPatientJob.setForeground(new java.awt.Color(102, 102, 102));
        lblPatientJob.setText("Engineer");
        jPanel1.add(lblPatientJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("DoB:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblPatientDoB.setForeground(new java.awt.Color(102, 102, 102));
        lblPatientDoB.setText("3-10-2003");
        jPanel1.add(lblPatientDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblPatientEmail.setForeground(new java.awt.Color(102, 102, 102));
        lblPatientEmail.setText("abc@gmail.com");
        jPanel1.add(lblPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 20));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, 370, 210));

        jSlider1.setForeground(new java.awt.Color(255, 255, 102));
        jSlider1.setMaximum(150);
        jSlider1.setMinimum(80);
        jSlider1.setValue(124);
        jPanel3.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 90, -1));

        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("96 mmHg");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("124 mmHg");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("84 b/m");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Blood Pressure");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("src\\main\\java\\PateintIcon\\darkBackground.JPG")); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 230, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\remdir.JPG"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 460));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blood;
    private javax.swing.JLabel hei;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientBloodType;
    private javax.swing.JLabel lblPatientDoB;
    private javax.swing.JLabel lblPatientEmail;
    private javax.swing.JLabel lblPatientHeight;
    private javax.swing.JLabel lblPatientJob;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientPhoneNum;
    private javax.swing.JLabel lblPatientWeight;
    private javax.swing.JLabel wei;
    // End of variables declaration//GEN-END:variables
}
