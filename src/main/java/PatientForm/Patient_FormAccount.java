
package PatientForm;

import DAO.PatientDAO;
import Patient.Patient;
import Patient.PatientManagement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Patient_FormAccount extends javax.swing.JPanel {
    // Data members

    // Tuyết test
    private PatientDAO patientDao = new PatientDAO();
    private PatientManagement patientManager = new PatientManagement();
    private ArrayList<Patient> listPatient = patientDao.restoreDataFromChar();
    private Patient patient;

    public Patient_FormAccount(Patient patient) {
        initComponents();
        // Tuyết test
        this.patient = patient;
        patientManager.setListPatient(patientDao.restoreDataFromChar());
        fillData();
        FlatMacLightLaf.setup();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblUserlogo = new javax.swing.JLabel();
        txtPatientUserName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtPatientFullName = new javax.swing.JTextField();
        lblPatientName = new javax.swing.JLabel();
        lblPatientName1 = new javax.swing.JLabel();
        txtPatientDoB = new javax.swing.JTextField();
        lblPatientName2 = new javax.swing.JLabel();
        txtPatientPhoneNumber = new javax.swing.JTextField();
        lblPatientName3 = new javax.swing.JLabel();
        txtPatientJob = new javax.swing.JTextField();
        lblPatientName4 = new javax.swing.JLabel();
        txtPatientEmail = new javax.swing.JTextField();
        lblPatientName5 = new javax.swing.JLabel();
        txtPatientGender = new javax.swing.JTextField();
        lblPatientName6 = new javax.swing.JLabel();
        rdoPatientInsNo = new javax.swing.JRadioButton();
        rdoPatientInsYes = new javax.swing.JRadioButton();
        txtPatientAge = new javax.swing.JTextField();
        lblPatientName7 = new javax.swing.JLabel();
        txtPatientWeight = new javax.swing.JTextField();
        lblPatientName8 = new javax.swing.JLabel();
        txtPatientHeight = new javax.swing.JTextField();
        lblPatientName9 = new javax.swing.JLabel();
        txtPatientHeight1 = new javax.swing.JTextField();
        lblPatientName10 = new javax.swing.JLabel();
        txtPatientBloodType = new javax.swing.JTextField();
        lblPatientName11 = new javax.swing.JLabel();
        btnPatientSaveAccount = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserlogo
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/PateintIcon/icons8-user-profile-96.png"))); // NOI18N
        jPanel2.add(lblUserlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtPatientUserName.setEditable(false);
        txtPatientUserName.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientUserName.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtPatientUserName.setForeground(new java.awt.Color(0, 0, 0));
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPatientFullName.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientFullName.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientFullName.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientFullName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientFullName
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientFullName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientFullNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, 30));

        lblPatientName.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName.setText("Full Name");
        jPanel3.add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblPatientName1.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName1.setText("Day Of Birth");
        jPanel3.add(lblPatientName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtPatientDoB.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientDoB.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientDoB.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientDoB.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientDoB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientDoB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientDoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientDoBActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        lblPatientName2.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName2.setText("Phone Number");
        jPanel3.add(lblPatientName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtPatientPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientPhoneNumber.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientPhoneNumber
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientPhoneNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPhoneNumberActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 30));

        lblPatientName3.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName3.setText("Job");
        jPanel3.add(lblPatientName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        txtPatientJob.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientJob.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientJob.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientJob.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientJob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientJob.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientJobActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 150, 30));

        lblPatientName4.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName4.setText("Email Address");
        jPanel3.add(lblPatientName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        txtPatientEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientEmail.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 150, 30));

        lblPatientName5.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName5.setText("Gender");
        jPanel3.add(lblPatientName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        txtPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientGender.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientGender.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientGender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientGender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientGenderActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 110, 30));

        lblPatientName6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPatientName6.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName6.setText("Insurance");
        jPanel3.add(lblPatientName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        buttonGroup1.add(rdoPatientInsNo);
        rdoPatientInsNo.setForeground(new java.awt.Color(0, 0, 0));
        rdoPatientInsNo.setText("No");
        jPanel3.add(rdoPatientInsNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        buttonGroup1.add(rdoPatientInsYes);
        rdoPatientInsYes.setForeground(new java.awt.Color(0, 0, 0));
        rdoPatientInsYes.setText("Yes");
        rdoPatientInsYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoPatientInsYesActionPerformed(evt);
            }
        });
        jPanel3.add(rdoPatientInsYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        txtPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientAge.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientAge.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientAge.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientAge.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAgeActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 90, 30));

        lblPatientName7.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName7.setText("Age");
        jPanel3.add(lblPatientName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        txtPatientWeight.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientWeight.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientWeight.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientWeight.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientWeight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientWeight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientWeightActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 50, 30));

        lblPatientName8.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName8.setText("Weight");
        jPanel3.add(lblPatientName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtPatientHeight.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientHeight.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientHeight.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientHeight.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientHeight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientHeight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientHeightActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, 30));

        lblPatientName9.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName9.setText("Height");
        jPanel3.add(lblPatientName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        txtPatientHeight1.setEditable(false);
        txtPatientHeight1.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientHeight1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientHeight1.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientHeight1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientHeight1
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientHeight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientHeight1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientHeight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, 30));

        lblPatientName10.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName10.setText("Height");
        jPanel3.add(lblPatientName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        txtPatientBloodType.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientBloodType.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        txtPatientBloodType.setForeground(new java.awt.Color(0, 0, 0));
        txtPatientBloodType.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientBloodType
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPatientBloodType.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPatientBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientBloodTypeActionPerformed(evt);
            }
        });
        jPanel3.add(txtPatientBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 50, 30));

        lblPatientName11.setForeground(new java.awt.Color(0, 0, 0));
        lblPatientName11.setText("Blood Type");
        jPanel3.add(lblPatientName11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        btnPatientSaveAccount.setBackground(new java.awt.Color(51, 51, 255));
        btnPatientSaveAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPatientSaveAccount.setText("SAVE");
        btnPatientSaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientSaveAccountActionPerformed(evt);
            }
        });
        jPanel3.add(btnPatientSaveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 100, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 560, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PateintIcon/backgroundProfile.jpg"))); // NOI18N
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

    public boolean doValidate() {
        boolean flag = true;

        if ((txtPatientFullName.getText()).equals("")) {
            flag = false;
        }
        if (txtPatientGender.getText().equals("")) {
            flag = false;
        }
        if (txtPatientJob.getText().equals("")) {
            flag = false;
        }
        if ((txtPatientEmail.getText()).equals("")) {
            flag = false;
        }
        if (txtPatientDoB.getText().equals("")) {
            flag = false;
        }
        if (txtPatientAge.getText().equals("")) {
            flag = false;
        }
        if ((txtPatientPhoneNumber.getText()).equals("")) {
            flag = false;
        }
        if (txtPatientHeight.getText().equals("")) {
            flag = false;
        }
        if (txtPatientWeight.getText().equals("")) {
            flag = false;
        }
        if (txtPatientBloodType.getText().equals("")) {
            flag = false;
        }
        if (!rdoPatientInsNo.isSelected() && !rdoPatientInsYes.isSelected()) {
            flag = false;

        }

        if (!flag) {
            JOptionPane.showMessageDialog(this, "Please full fill the blank", "Validation Data",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return flag;
    }

    public void fillData() {
        txtPatientUserName.setText(patient.getUserName());
        txtPatientFullName.setText(patient.getName());
        txtPatientGender.setText(patient.getGender());
        txtPatientDoB.setText(patient.getdOB());
        txtPatientAge.setText(String.valueOf(patient.calculateAge(patient.getdOB())));
        txtPatientJob.setText(patient.getJob());
        txtPatientPhoneNumber.setText(patient.getPhoneNumber());
        txtPatientEmail.setText(patient.getEmail());
        txtPatientWeight.setText(patient.getWeight());
        txtPatientHeight.setText(patient.getHeight());
        txtPatientBloodType.setText(patient.getBloodType());

    }

    private void txtPatientUserNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientUserNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientUserNameActionPerformed

    private void txtPatientFullNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientFullNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientFullNameActionPerformed

    private void txtPatientDoBActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientDoBActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientDoBActionPerformed

    private void txtPatientPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientPhoneNumberActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientPhoneNumberActionPerformed

    private void txtPatientJobActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientJobActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientJobActionPerformed

    private void txtPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientEmailActionPerformed

    private void txtPatientGenderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientGenderActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientGenderActionPerformed

    private void rdoPatientInsYesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdoPatientInsYesActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rdoPatientInsYesActionPerformed

    private void txtPatientAgeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientAgeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientAgeActionPerformed

    private void txtPatientWeightActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientWeightActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientWeightActionPerformed

    private void txtPatientHeightActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientHeightActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientHeightActionPerformed

    private void txtPatientHeight1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientHeight1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientHeight1ActionPerformed

    private void btnPatientSaveAccountActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPatientSaveAccountActionPerformed
        if (doValidate()) {
            this.patient.setUserName(txtPatientUserName.getText());
            this.patient.setName(txtPatientFullName.getText());
            this.patient.setGender(txtPatientGender.getText());
            this.patient.setdOB(txtPatientDoB.getText());
            // String age=txtPatientAge.getText();
            this.patient.setJob(txtPatientJob.getText());
            this.patient.setPhoneNumber(txtPatientPhoneNumber.getText());
            this.patient.setEmail(txtPatientEmail.getText());
            this.patient.setWeight(txtPatientWeight.getText());
            this.patient.setHeight(txtPatientHeight.getText());
            this.patient.setBloodType(txtPatientBloodType.getText());

            String ins = "";
            if (rdoPatientInsYes.isSelected()) {
                ins = "Yes";
            } else {
                ins = "No";
            }
            // SUA
            this.patient.setInsurance(ins);
            patientManager.editPatient(patient);

            patientManager.setListPatient(listPatient);
            patientDao.saveDataByChar(listPatient);

            JOptionPane.showMessageDialog(this, "Successfully");
        }
    }// GEN-LAST:event_btnPatientSaveAccountActionPerformed

    private void txtPatientBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientBloodTypeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPatientBloodTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientSaveAccount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientName1;
    private javax.swing.JLabel lblPatientName10;
    private javax.swing.JLabel lblPatientName11;
    private javax.swing.JLabel lblPatientName2;
    private javax.swing.JLabel lblPatientName3;
    private javax.swing.JLabel lblPatientName4;
    private javax.swing.JLabel lblPatientName5;
    private javax.swing.JLabel lblPatientName6;
    private javax.swing.JLabel lblPatientName7;
    private javax.swing.JLabel lblPatientName8;
    private javax.swing.JLabel lblPatientName9;
    private javax.swing.JLabel lblUserlogo;
    private javax.swing.JRadioButton rdoPatientInsNo;
    private javax.swing.JRadioButton rdoPatientInsYes;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JTextField txtPatientBloodType;
    private javax.swing.JTextField txtPatientDoB;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientFullName;
    private javax.swing.JTextField txtPatientGender;
    private javax.swing.JTextField txtPatientHeight;
    private javax.swing.JTextField txtPatientHeight1;
    private javax.swing.JTextField txtPatientJob;
    private javax.swing.JTextField txtPatientPhoneNumber;
    private javax.swing.JTextField txtPatientUserName;
    private javax.swing.JTextField txtPatientWeight;
    // End of variables declaration//GEN-END:variables
}
