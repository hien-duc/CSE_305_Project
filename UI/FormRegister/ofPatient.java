package Minh.UI.FormRegister;

import javax.swing.ButtonModel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

public class ofPatient extends javax.swing.JFrame {

    public ofPatient() {
        initComponents();
        new JProgressBar().setIndeterminate(true);
    }

    private void initComponents() {
        glassIcon1 = new raven.glassmorphism.GlassIcon();
        glassIcon2 = new raven.glassmorphism.GlassIcon();
        glassIcon3 = new raven.glassmorphism.GlassIcon();
        glassIcon4 = new raven.glassmorphism.GlassIcon();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        bgGender = new javax.swing.ButtonGroup();
        bgInsurance = new javax.swing.ButtonGroup();
        changeMode = new javax.swing.JButton();
        crazyPanel1 = new raven.crazypanel.CrazyPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboBloodType = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        rdoOther = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rdoInsuranceYes = new javax.swing.JRadioButton();
        rdoInsuranceNo = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();

        glassIcon1.setGlassIconConfig(new raven.glassmorphism.GlassIconConfig(
                "/glassicon/icon/card.svg", 5.0f, 0, 5,
                new java.util.HashMap<Integer, String>() {
                    {
                        put(0, "@background");
                        put(1, "#6691a1");
                        put(2, "#6691a1");
                    }
                },
                new raven.glassmorphism.GlassIconConfig.GlassShape(
                        java.awt.Color.decode("#db214f"),
                        new java.awt.geom.RoundRectangle2D.Double(2.0, 2.0, 10.0, 10.0, 5.0, 5.0),
                        45.0f)));

        glassIcon2.setGlassIconConfig(new raven.glassmorphism.GlassIconConfig(
                "/glassicon/icon/doc.svg", 5.0f, 1, 5,
                new java.util.HashMap<Integer, String>() {
                    {
                        put(0, "#6691a1");
                        put(1, "@background");
                        put(2, "#6691a1");
                        put(3, "#6691a1");
                        put(4, "#6691a1");
                    }
                },
                new raven.glassmorphism.GlassIconConfig.GlassShape(
                        java.awt.Color.decode("#0ca064"),
                        new java.awt.geom.RoundRectangle2D.Double(2.0, 2.0, 10.0, 10.0, 5.0, 5.0),
                        45.0f)));

        glassIcon3.setGlassIconConfig(new raven.glassmorphism.GlassIconConfig(
                "/glassicon/icon/currency.svg", 5.0f, 0, 5,
                new java.util.HashMap<Integer, String>() {
                    {
                        put(0, "@background");
                        put(1, "#6691a1");
                        put(2, "#6691a1");
                    }
                },
                new raven.glassmorphism.GlassIconConfig.GlassShape(
                        java.awt.Color.decode("#9db035"),
                        new java.awt.geom.RoundRectangle2D.Double(2.0, 2.0, 10.0, 10.0, 5.0, 5.0),
                        45.0f)));

        glassIcon4.setGlassIconConfig(new raven.glassmorphism.GlassIconConfig(
                "/glassicon/icon/dollar.svg", 5.0f, 0, 5,
                new java.util.HashMap<Integer, String>() {
                    {
                        put(0, "@background");
                        put(1, "#6691a1");
                        put(2, "#6691a1");
                        put(3, "#6691a1");
                        put(4, "#6691a1");
                    }
                },
                new raven.glassmorphism.GlassIconConfig.GlassShape(
                        java.awt.Color.decode("#2ca6f3"),
                        new java.awt.geom.RoundRectangle2D.Double(6.0, 7.0, 10.0, 10.0, 10.0, 10.0),
                        45.0f)));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "United States", "Canada", "Germany", "Japan", "Brazil" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("jRadioButton1");
        changeMode.setText("Change Mode");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crazyPanel1.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
                "[light]border:0,0,0,0,shade(@background,5%),,20;[dark]border:0,0,0,0,tint(@background,5%),,20;[light]background:shade(@background,2%);[dark]background:tint(@background,2%)",
                new String[] {
                        "font:bold +10",
                        "font:bold +1",
                        "",
                        "",
                        "showClearButton:true;JTextField.placeholderText=first",
                        "showClearButton:true;JTextField.placeholderText=last",
                        "",
                        "showClearButton:true;JTextField.placeholderText=Phone number",
                        "",
                        "showClearButton:true;JTextField.placeholderText=example@gmail.com",
                        "",
                        "font:bold +1",
                        "",
                        "",
                        "showClearButton:true;JTextField.placeholderText=DD-MM-YYYY",
                        "",
                        "showClearButton:true;JTextField.placeholderText=Your height",
                        "",
                        "showClearButton:true;JTextField.placeholderText=Your weight",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                }));
        crazyPanel1.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
                "wrap 2,fillx,insets 25",
                "[grow 0,trail]15[fill]",
                "",
                new String[] {
                        "wrap,al lead",
                        "wrap,al lead",
                        "wrap,al lead",
                        "",
                        "split 2",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "span 2,grow 1",
                        "wrap,al lead",
                        "wrap,al lead",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "split 3",
                        "",
                        "",
                        "",
                        "split 2",
                        "span 2,al trail",
                        "span 2,al trail"
                }));

        jLabel1.setText("Patient's Information");
        crazyPanel1.add(jLabel1);

        jLabel2.setText("Contact info");
        crazyPanel1.add(jLabel2);

        jLabel3.setText("Used for contacting you");
        crazyPanel1.add(jLabel3);

        jLabel4.setText("Full Name");
        crazyPanel1.add(jLabel4);
        crazyPanel1.add(txtFirstName);
        crazyPanel1.add(txtLastname);

        jLabel5.setText("Phone Number");
        crazyPanel1.add(jLabel5);

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        crazyPanel1.add(txtPhoneNumber);

        jLabel6.setText("Email Address");
        crazyPanel1.add(jLabel6);
        crazyPanel1.add(txtEmail);
        crazyPanel1.add(jSeparator1);

        jLabel7.setText("Personal information");
        crazyPanel1.add(jLabel7);

        jLabel8.setText("Used for understanding you");
        crazyPanel1.add(jLabel8);

        jLabel9.setText("Date of birth");
        crazyPanel1.add(jLabel9);

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        crazyPanel1.add(txtDOB);

        jLabel10.setText("Height");
        crazyPanel1.add(jLabel10);
        crazyPanel1.add(txtHeight);

        jLabel11.setText("Weight");
        crazyPanel1.add(jLabel11);
        crazyPanel1.add(txtWeight);

        jLabel12.setText("Blood Type");
        crazyPanel1.add(jLabel12);

        cboBloodType.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cboBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBloodTypeActionPerformed(evt);
            }
        });
        crazyPanel1.add(cboBloodType);

        jLabel16.setText("Gender");
        crazyPanel1.add(jLabel16);

        bgGender.add(rdoMale);
        rdoMale.setText("Male");
        rdoMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMaleActionPerformed(evt);
            }
        });
        crazyPanel1.add(rdoMale);

        bgGender.add(rdoFemale);
        rdoFemale.setText("Female");
        rdoFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFemaleActionPerformed(evt);
            }
        });
        crazyPanel1.add(rdoFemale);

        bgGender.add(rdoOther);
        rdoOther.setText("Other");
        rdoOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoOtherActionPerformed(evt);
            }
        });
        crazyPanel1.add(rdoOther);

        jLabel13.setText("Insurance");
        crazyPanel1.add(jLabel13);

        bgInsurance.add(rdoInsuranceYes);
        rdoInsuranceYes.setText("Yes");
        crazyPanel1.add(rdoInsuranceYes);

        bgInsurance.add(rdoInsuranceNo);
        rdoInsuranceNo.setText("No");
        crazyPanel1.add(rdoInsuranceNo);
        crazyPanel1.add(jLabel14);
        crazyPanel1.add(jLabel15);

        btnConfirm.setBackground(new java.awt.Color(140, 170, 238));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        crazyPanel1.add(btnConfirm);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(changeMode)
                                                        .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(crazyPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                549, Short.MAX_VALUE)
                                                        .addGap(30, 30, 30)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(changeMode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crazyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)));

        pack();
        setLocationRelativeTo(null);

    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPhoneNumberActionPerformed

    private void cboBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cboBloodTypeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cboBloodTypeActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox2ActionPerformed

    private void rdoMaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdoMaleActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rdoMaleActionPerformed

    private void rdoFemaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdoFemaleActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rdoFemaleActionPerformed

    private void rdoOtherActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdoOtherActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rdoOtherActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDOBActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnConfirmActionPerformed

    public javax.swing.ButtonGroup getBgGender() {
        return bgGender;
    }

    public void setBgGender(javax.swing.ButtonGroup bgGender) {
        this.bgGender = bgGender;
    }

    public javax.swing.ButtonGroup getBgInsurance() {
        return bgInsurance;
    }

    public void setBgInsurance(javax.swing.ButtonGroup bgInsurance) {
        this.bgInsurance = bgInsurance;
    }

    public javax.swing.JButton getBtnConfirm() {
        return btnConfirm;
    }

    public void setBtnConfirm(javax.swing.JButton btnConfirm) {
        this.btnConfirm = btnConfirm;
    }

    public javax.swing.JComboBox<String> getCboBloodType() {
        return cboBloodType;
    }

    public void setCboBloodType(javax.swing.JComboBox<String> cboBloodType) {
        this.cboBloodType = cboBloodType;
    }

    public javax.swing.JButton getChangeMode() {
        return changeMode;
    }

    public void setChangeMode(javax.swing.JButton changeMode) {
        this.changeMode = changeMode;
    }

    public javax.swing.JRadioButton getRdoFemale() {
        return rdoFemale;
    }

    public void setRdoFemale(javax.swing.JRadioButton rdoFemale) {
        this.rdoFemale = rdoFemale;
    }

    public javax.swing.JRadioButton getRdoInsuranceNo() {
        return rdoInsuranceNo;
    }

    public void setRdoInsuranceNo(javax.swing.JRadioButton rdoInsuranceNo) {
        this.rdoInsuranceNo = rdoInsuranceNo;
    }

    public javax.swing.JRadioButton getRdoInsuranceYes() {
        return rdoInsuranceYes;
    }

    public void setRdoInsuranceYes(javax.swing.JRadioButton rdoInsuranceYes) {
        this.rdoInsuranceYes = rdoInsuranceYes;
    }

    public JRadioButton getRdoMale() {
        return rdoMale;
    }

    public void setRdoMale(javax.swing.JRadioButton rdoMale) {
        this.rdoMale = rdoMale;
    }

    public javax.swing.JRadioButton getRdoOther() {
        return rdoOther;
    }

    public void setRdoOther(javax.swing.JRadioButton rdoOther) {
        this.rdoOther = rdoOther;
    }

    public javax.swing.JTextField getTxtDOB() {
        return txtDOB;
    }

    public void setTxtDOB(javax.swing.JTextField txtDOB) {
        this.txtDOB = txtDOB;
    }

    public javax.swing.JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(javax.swing.JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public javax.swing.JTextField getTxtFirstName() {
        return txtFirstName;
    }

    public void setTxtFirstName(javax.swing.JTextField txtFirstName) {
        this.txtFirstName = txtFirstName;
    }

    public javax.swing.JTextField getTxtHeight() {
        return txtHeight;
    }

    public void setTxtHeight(javax.swing.JTextField txtHeight) {
        this.txtHeight = txtHeight;
    }

    public javax.swing.JTextField getTxtLastname() {
        return txtLastname;
    }

    public void setTxtLastname(javax.swing.JTextField txtLastname) {
        this.txtLastname = txtLastname;
    }

    public javax.swing.JTextField getTxtPhoneNumber() {
        return txtPhoneNumber;
    }

    public void setTxtPhoneNumber(javax.swing.JTextField txtPhoneNumber) {
        this.txtPhoneNumber = txtPhoneNumber;
    }

    public javax.swing.JTextField getTxtWeight() {
        return txtWeight;
    }

    public void setTxtWeight(javax.swing.JTextField txtWeight) {
        this.txtWeight = txtWeight;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.ButtonGroup bgInsurance;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cboBloodType;
    private raven.crazypanel.CrazyPanel crazyPanel1;
    private raven.glassmorphism.GlassIcon glassIcon1;
    private raven.glassmorphism.GlassIcon glassIcon2;
    private raven.glassmorphism.GlassIcon glassIcon3;
    private raven.glassmorphism.GlassIcon glassIcon4;
    private javax.swing.JButton changeMode;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoInsuranceNo;
    private javax.swing.JRadioButton rdoInsuranceYes;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JRadioButton rdoOther;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
