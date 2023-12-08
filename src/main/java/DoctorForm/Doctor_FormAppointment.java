/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DoctorForm;

import Booking.BookingManage;
import DAO.BookingDAO;
import DAO.DoctorDAO;
import DAO.PatientDAO;
import Doctor.Doctor;
import DoctorMain.DoctorMain;
import Duc.Chat.chatUI.ChatDialogDoctor;
import Duc.PaymentForm.PaymentForm;
import Patient.Patient;
import Patient.PatientManagement;
import java.util.ArrayList;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Doctor_FormAppointment extends javax.swing.JPanel {

    DAO.PatientDAO patientDao = new PatientDAO();

    ArrayList<Patient> listPatient;
    PatientManagement patientmanage = new PatientManagement();
    Booking.BookingManage bookingmanage = new BookingManage();
    DAO.BookingDAO bookingDao = new BookingDAO();
    ArrayList<Booking.Booking> listBooking;
    Doctor doctor = new Doctor();
    DoctorDAO doctorDao = new DoctorDAO();

    //
    private DoctorMain main;

    public Doctor_FormAppointment(Doctor doctor) {
        initComponents();
        this.doctor = doctor;
        bookingmanage.setListBooking(bookingDao.restoreDataFromChar());
        listBooking = bookingDao.restoreDataFromChar();
        listPatient = patientDao.restoreDataFromChar();
        patientmanage.setListPatient(listPatient);

        this.fillData();
    }

    public Doctor_FormAppointment(DoctorMain main, Doctor doctor) {
        FlatMacLightLaf.setup();

        initComponents();
        this.doctor = doctor;
        this.main = main;
        bookingmanage.setListBooking(bookingDao.restoreDataFromChar());
        listBooking = bookingDao.restoreDataFromChar();
        listPatient = patientDao.restoreDataFromChar();
        patientmanage.setListPatient(listPatient);
        this.fillData();
    }

    public void fillData() {
        for (int i = 0; i < listBooking.size(); i++) {
            Booking.Booking temp = listBooking.get(i);
            if (temp.getDoctor().getName().equals(doctor.getName())) {
                Patient patient = new Patient();

                patient = patientmanage.searchByName(temp.getPatientName());

                txtPatientUserName.setText(patient.getUserName());
                txtPatientFullName.setText(patient.getName());
                txtPatientSymptom.setText(temp.getPatientProblem());
                txtPatientBloodType.setText(patient.getBloodType());
                txtPatientEmail.setText(patient.getEmail());
                txtPatientGender.setText(patient.getGender());
                txtPatientHeight.setText(patient.getHeight());
                txtPatientWeight.setText(patient.getWeight());
                txtPatientPhoneNumber.setText(patient.getPhoneNumber());
                txtPatientAge.setText((String.valueOf(patient.calculateAge(patient.getdOB()))));
                return;
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUserlogo = new javax.swing.JLabel();
        txtPatientUserName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtPatientFullName = new javax.swing.JTextField();
        lblPatientName = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        txtPatientBloodType = new javax.swing.JTextField();
        lblPatientHeight = new javax.swing.JLabel();
        txtPatientHeight = new javax.swing.JTextField();
        lblDoctorMajor = new javax.swing.JLabel();
        lblPatientName4 = new javax.swing.JLabel();
        txtPatientEmail = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        txtPatientGender = new javax.swing.JTextField();
        txtPatientWeight = new javax.swing.JTextField();
        txtPatientAge = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblPatientWeight1 = new javax.swing.JLabel();
        lblPatientWeight2 = new javax.swing.JLabel();
        txtPatientPhoneNumber = new javax.swing.JTextField();
        btnSendMessage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPatientSymptom = new javax.swing.JTextArea();
        btnSendPayment = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        jLabel1.setText("Your Registed Patient Info");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserlogo
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/PateintIcon/icons8-user-profile-96.png"))); // NOI18N
        jPanel2.add(lblUserlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        txtPatientUserName.setEditable(false);
        txtPatientUserName.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientUserName.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtPatientUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPatientUserName.setText("@UserName");
        txtPatientUserName
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPatientUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtPatientUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 237, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 213,
                                                Short.MAX_VALUE)
                                        .addContainerGap())));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 427,
                                                Short.MAX_VALUE))));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPatientFullName.setEditable(false);
        txtPatientFullName.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientFullName.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientFullName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientFullName
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientFullNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 30));

        lblPatientName.setText("Full Name");
        jPanel3.add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblPatientAge.setText("Age");
        jPanel3.add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtPatientBloodType.setEditable(false);
        txtPatientBloodType.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientBloodType.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientBloodType.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientBloodType
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientBloodTypeActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 120, 30));

        lblPatientHeight.setText("Height");
        jPanel3.add(lblPatientHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtPatientHeight.setEditable(false);
        txtPatientHeight.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientHeight.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientHeight.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientHeight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientHeightActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 30));

        lblDoctorMajor.setText("Phone number");
        jPanel3.add(lblDoctorMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        lblPatientName4.setText("Email Address");
        jPanel3.add(lblPatientName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        txtPatientEmail.setEditable(false);
        txtPatientEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientEmail.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, 30));

        lblPatientGender.setText("Gender");
        jPanel3.add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        txtPatientGender.setEditable(false);
        txtPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientGender.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientGender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientGenderActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 110, 30));

        txtPatientWeight.setEditable(false);
        txtPatientWeight.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientWeight.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientWeight.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientWeight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientWeightActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 30));

        txtPatientAge.setEditable(false);
        txtPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientAge.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientAge.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAgeActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        lblPhoneNumber.setText("Blood Type");
        jPanel3.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        lblPatientWeight1.setText("Symptoms");
        jPanel3.add(lblPatientWeight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        lblPatientWeight2.setText("Weight");
        jPanel3.add(lblPatientWeight2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        txtPatientPhoneNumber.setEditable(false);
        txtPatientPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientPhoneNumber.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientPhoneNumber
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPhoneNumberActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 150, 30));

        btnSendMessage.setFont(new java.awt.Font("Malgun Gothic", 2, 14)); // NOI18N
        btnSendMessage.setForeground(new java.awt.Color(204, 204, 0));
        btnSendMessage.setText("Send Message");
        btnSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageActionPerformed(evt);
            }
        });
        jPanel3.add(btnSendMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        txtPatientSymptom.setColumns(20);
        txtPatientSymptom.setRows(5);
        jScrollPane1.setViewportView(txtPatientSymptom);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        btnSendPayment.setFont(new java.awt.Font("Hack Nerd Font", 2, 12)); // NOI18N
        btnSendPayment.setForeground(new java.awt.Color(255, 204, 51));
        btnSendPayment.setText("Send Payment");
        btnSendPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendPaymentActionPerformed(evt);
            }
        });
        jPanel3.add(btnSendPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 323, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 638,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 439,
                                                Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendPaymentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSendPaymentActionPerformed
        // TODO add your handling code here:
        PaymentForm paymentForm = new PaymentForm(main, true);
        paymentForm.setVisible(true);
    }// GEN-LAST:event_btnSendPaymentActionPerformed

    private void txtPatientFullNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientFullNameActionPerformed

    }// GEN-LAST:event_txtPatientFullNameActionPerformed

    private void txtPatientBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientBloodTypeActionPerformed

    }// GEN-LAST:event_txtPatientBloodTypeActionPerformed

    private void txtPatientHeightActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientHeightActionPerformed

    }// GEN-LAST:event_txtPatientHeightActionPerformed

    private void txtPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientEmailActionPerformed

    private void txtPatientGenderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientGenderActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientGenderActionPerformed

    private void txtPatientWeightActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientWeightActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientWeightActionPerformed

    private void txtPatientAgeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientAgeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientAgeActionPerformed

    private void txtPatientUserNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientUserNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientUserNameActionPerformed

    private void txtPatientPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientPhoneNumberActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientPhoneNumberActionPerformed

    private void btnSendMessageActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSendMessageActionPerformed
        // TODO add your handling code here:
        ChatDialogDoctor chatDoctor = new ChatDialogDoctor(main, true);
        chatDoctor.setVisible(true);

    }// GEN-LAST:event_btnSendMessageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendMessage;
    private javax.swing.JButton btnSendPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoctorMajor;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHeight;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientName4;
    private javax.swing.JLabel lblPatientWeight1;
    private javax.swing.JLabel lblPatientWeight2;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUserlogo;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JTextField txtPatientBloodType;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientFullName;
    private javax.swing.JTextField txtPatientGender;
    private javax.swing.JTextField txtPatientHeight;
    private javax.swing.JTextField txtPatientPhoneNumber;
    private javax.swing.JTextArea txtPatientSymptom;
    private javax.swing.JTextField txtPatientUserName;
    private javax.swing.JTextField txtPatientWeight;
    // End of variables declaration//GEN-END:variables
}
