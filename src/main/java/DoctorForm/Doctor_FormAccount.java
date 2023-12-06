/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DoctorForm;

import java.util.ArrayList;

import DAO.DoctorDAO;
import Doctor.Doctor;

/**
 *
 * @author My PC
 */
public class Doctor_FormAccount extends javax.swing.JPanel {
    DoctorDAO doctorDAO;
    ArrayList<Doctor> listdoctor;
    Doctor doctor;

    public Doctor_FormAccount() {
        initComponents();
        doctorDAO = new DoctorDAO();
        listdoctor = doctorDAO.restoreDataFromChar();
        doctor = listdoctor.get(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblUserlogo = new javax.swing.JLabel();
        txtPatientUserName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtDoctorFullName = new javax.swing.JTextField();
        lblPatientName = new javax.swing.JLabel();
        lblDoctorAge = new javax.swing.JLabel();
        txtDoctorPhoneNumber = new javax.swing.JTextField();
        lblDoctorQualification = new javax.swing.JLabel();
        txtDoctorQualification = new javax.swing.JTextField();
        lblDoctorMajor = new javax.swing.JLabel();
        txtDoctorMajor = new javax.swing.JTextField();
        lblPatientName4 = new javax.swing.JLabel();
        txtDoctorEmail = new javax.swing.JTextField();
        lblDoctorGender = new javax.swing.JLabel();
        txtDoctorGender = new javax.swing.JTextField();
        txtDoctorExperience = new javax.swing.JTextField();
        lblDoctorExperience = new javax.swing.JLabel();
        lblBtnSave = new javax.swing.JLabel();
        lblBtnEdit = new javax.swing.JLabel();
        txtDoctorAge1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserlogo.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\icons8-user-profile-96.png"))); // NOI18N
        jPanel2.add(lblUserlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

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
        jPanel2.add(txtPatientUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 350));

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDoctorFullName.setEditable(false);
        txtDoctorFullName.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorFullName.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtDoctorFullName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoctorFullName
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDoctorFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorFullNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, 30));

        lblPatientName.setText("Full Name");
        jPanel3.add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblDoctorAge.setText("Age");
        jPanel3.add(lblDoctorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtDoctorPhoneNumber.setEditable(false);
        txtDoctorPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorPhoneNumber.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtDoctorPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoctorPhoneNumber
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDoctorPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPhoneNumberActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, 30));

        lblDoctorQualification.setText("Qualification");
        jPanel3.add(lblDoctorQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtDoctorQualification.setEditable(false);
        txtDoctorQualification.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorQualification.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtDoctorQualification.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoctorQualification
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDoctorQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorQualificationActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 30));

        lblDoctorMajor.setText("Major");
        jPanel3.add(lblDoctorMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        txtDoctorMajor.setEditable(false);
        txtDoctorMajor.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorMajor.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtDoctorMajor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoctorMajor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDoctorMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorMajorActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 150, 30));

        lblPatientName4.setText("Email Address");
        jPanel3.add(lblPatientName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        txtDoctorEmail.setEditable(false);
        txtDoctorEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorEmail.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtDoctorEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoctorEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDoctorEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 150, 30));

        lblDoctorGender.setText("Gender");
        jPanel3.add(lblDoctorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        txtDoctorGender.setEditable(false);
        txtDoctorGender.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorGender.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtDoctorGender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoctorGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDoctorGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorGenderActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 110, 30));

        txtDoctorExperience.setEditable(false);
        txtDoctorExperience.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorExperience.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtDoctorExperience.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoctorExperience
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDoctorExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorExperienceActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, 30));

        lblDoctorExperience.setText("Experience");
        jPanel3.add(lblDoctorExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblBtnSave.setIcon(new javax.swing.ImageIcon("src\\main\\java\\PateintIcon\\btnsave.png")); // NOI18N
        jPanel3.add(lblBtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        lblBtnEdit.setIcon(new javax.swing.ImageIcon("src\\main\\java\\PateintIcon\\btnEdit.png")); // NOI18N
        jPanel3.add(lblBtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 60, -1));

        txtDoctorAge1.setEditable(false);
        txtDoctorAge1.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorAge1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtDoctorAge1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDoctorAge1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDoctorAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorAge1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        jLabel2.setText("Phone number");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 560, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\PateintIcon\\backgroundProfile.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(811, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(811, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(811, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1303,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientUserNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientUserNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientUserNameActionPerformed

    private void txtDoctorFullNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDoctorFullNameActionPerformed
        txtDoctorFullName.setText(doctor.getName());
    }// GEN-LAST:event_txtDoctorFullNameActionPerformed

    private void txtDoctorPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDoctorPhoneNumberActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDoctorPhoneNumberActionPerformed

    private void txtDoctorQualificationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDoctorQualificationActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDoctorQualificationActionPerformed

    private void txtDoctorMajorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDoctorMajorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDoctorMajorActionPerformed

    private void txtDoctorEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDoctorEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDoctorEmailActionPerformed

    private void txtDoctorGenderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDoctorGenderActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDoctorGenderActionPerformed

    private void txtDoctorExperienceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDoctorExperienceActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDoctorExperienceActionPerformed

    private void txtDoctorAge1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDoctorAge1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDoctorAge1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBtnEdit;
    private javax.swing.JLabel lblBtnSave;
    private javax.swing.JLabel lblDoctorAge;
    private javax.swing.JLabel lblDoctorExperience;
    private javax.swing.JLabel lblDoctorGender;
    private javax.swing.JLabel lblDoctorMajor;
    private javax.swing.JLabel lblDoctorQualification;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientName4;
    private javax.swing.JLabel lblUserlogo;
    private javax.swing.JTextField txtDoctorAge1;
    private javax.swing.JTextField txtDoctorEmail;
    private javax.swing.JTextField txtDoctorExperience;
    private javax.swing.JTextField txtDoctorFullName;
    private javax.swing.JTextField txtDoctorGender;
    private javax.swing.JTextField txtDoctorMajor;
    private javax.swing.JTextField txtDoctorPhoneNumber;
    private javax.swing.JTextField txtDoctorQualification;
    private javax.swing.JTextField txtPatientUserName;
    // End of variables declaration//GEN-END:variables
}
