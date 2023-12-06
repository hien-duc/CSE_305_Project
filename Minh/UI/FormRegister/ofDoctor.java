package Minh.UI.FormRegister;

import javax.swing.JProgressBar;

public class ofDoctor extends javax.swing.JFrame {

    public ofDoctor() {
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
        txtAge = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMajor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboExperience = new javax.swing.JComboBox<>();
        space = new javax.swing.JLabel();

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
                        "showClearButton:true;JTextField.placeholderText=Your age",
                        "",
                        "showClearButton:true;JTextField.placeholderText=Your qualification",
                        "",
                        "showClearButton:true;JTextField.placeholderText=Your major",
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
                        "",
                        "",
                        "span 2,al trail"
                }));

        jLabel1.setText("Doctor's Information");
        crazyPanel1.add(jLabel1);

        jLabel2.setText("Contact info");
        crazyPanel1.add(jLabel2);
        jLabel3.setText("Get to know you better!");
        crazyPanel1.add(jLabel3);
        jLabel4.setText("Full Name");
        crazyPanel1.add(jLabel4);
        crazyPanel1.add(txtFirstName);
        crazyPanel1.add(txtLastname);
        jLabel5.setText("Phone Number");
        crazyPanel1.add(jLabel5);
        crazyPanel1.add(txtPhoneNumber);
        jLabel6.setText("Email Address");
        crazyPanel1.add(jLabel6);
        crazyPanel1.add(txtEmail);
        crazyPanel1.add(jSeparator1);
        jLabel7.setText("Personal information");
        crazyPanel1.add(jLabel7);
        jLabel8.setText("Used for understanding you");
        crazyPanel1.add(jLabel8);
        jLabel9.setText("Age");
        crazyPanel1.add(jLabel9);
        crazyPanel1.add(txtAge);
        jLabel10.setText("Qualification");
        crazyPanel1.add(jLabel10);
        crazyPanel1.add(txtQualification);
        jLabel11.setText("Major");
        crazyPanel1.add(jLabel11);
        crazyPanel1.add(txtMajor);
        jLabel12.setText("Experiences");
        crazyPanel1.add(jLabel12);

        cboExperience.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "High School Diploma or Equivalent", "Associate's Degree", "Bachelor's Degree",
                        "Master's Degree", "Professional Doctorate", "Doctor of Philosophy (Ph.D.)" }));

        crazyPanel1.add(cboExperience);

        crazyPanel1.add(space);
        crazyPanel1.add(space);
        btnConfirm.setBackground(new java.awt.Color(140, 170, 238));
        btnConfirm.setText("Confirm");
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

    }

    public javax.swing.JButton getBtnConfirm() {
        return btnConfirm;
    }

    public void setBtnConfirm(javax.swing.JButton btnConfirm) {
        this.btnConfirm = btnConfirm;
    }

    public javax.swing.JComboBox<String> getCboExperience() {
        return cboExperience;
    }

    public void setCboExperience(javax.swing.JComboBox<String> cboExperience) {
        this.cboExperience = cboExperience;
    }

    public javax.swing.JButton getChangeMode() {
        return changeMode;
    }

    public void setChangeMode(javax.swing.JButton changeMode) {
        this.changeMode = changeMode;
    }

    public javax.swing.JTextField getTxtAge() {
        return txtAge;
    }

    public void setTxtAge(javax.swing.JTextField txtAge) {
        this.txtAge = txtAge;
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

    public javax.swing.JTextField getTxtQualification() {
        return txtQualification;
    }

    public void setTxtQualification(javax.swing.JTextField txtQualification) {
        this.txtQualification = txtQualification;
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

    public javax.swing.JTextField getTxtMajor() {
        return txtMajor;
    }

    public void setTxtMajor(javax.swing.JTextField txtMajor) {
        this.txtMajor = txtMajor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cboExperience;
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
    private javax.swing.JLabel space;
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
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtMajor;
    // End of variables declaration//GEN-END:variables
}
