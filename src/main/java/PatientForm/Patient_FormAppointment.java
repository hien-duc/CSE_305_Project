
package PatientForm;

import DAO.DoctorDAO;
import Doctor.Doctor;
import Doctor.DoctorManagement;
import PateintMain.PatientMain;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Patient_FormAppointment extends javax.swing.JPanel {

    // Data members
    DoctorDAO doctorDao = new DoctorDAO();
    DoctorManagement doctorManagement;
    PatientMain mf;
    DialogPatientBookComfirm dialogConfirm;

    public Patient_FormAppointment() {
        initComponents();
        doctorManagement = new DoctorManagement();
        doctorManagement.setListDoctor(doctorDao.restoreDataFromChar());
        addData(doctorDao.restoreDataFromChar());
        this.addListenerDoctor(mf);
        FlatMacLightLaf.setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pateintBorderPanel1 = new PateintSwing.PateintBorderPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new PateintModel.PatientTable();
        pateintBorderPanel2 = new PateintSwing.PateintBorderPanel();
        txtSearchText = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboPatientSearch = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));

        pateintBorderPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Major", "Gender", "Phone Number", "Email", "Status"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        javax.swing.GroupLayout pateintBorderPanel1Layout = new javax.swing.GroupLayout(pateintBorderPanel1);
        pateintBorderPanel1.setLayout(pateintBorderPanel1Layout);
        pateintBorderPanel1Layout.setHorizontalGroup(
                pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap()));
        pateintBorderPanel1Layout.setVerticalGroup(
                pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                pateintBorderPanel1Layout.createSequentialGroup()
                                        .addContainerGap(12, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)));

        pateintBorderPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchText.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchText.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchText.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Vani", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("ADD APPOITMENT");

        jLabel2.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("______________________");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PateintIcon/icons8-filter-30.png"))); // NOI18N
        jLabel3.setText("Filters By");

        cboPatientSearch.setBackground(new java.awt.Color(198, 226, 255));
        cboPatientSearch.setForeground(new java.awt.Color(51, 51, 51));
        cboPatientSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Major", "Gender", "Status" }));

        javax.swing.GroupLayout pateintBorderPanel2Layout = new javax.swing.GroupLayout(pateintBorderPanel2);
        pateintBorderPanel2.setLayout(pateintBorderPanel2Layout);
        pateintBorderPanel2Layout.setHorizontalGroup(
                pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pateintBorderPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(pateintBorderPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(65, 65, 65)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboPatientSearch, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtSearchText, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)));
        pateintBorderPanel2Layout.setVerticalGroup(
                pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pateintBorderPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)
                                .addGroup(pateintBorderPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pateintBorderPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pateintBorderPanel2Layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20,
                                                        Short.MAX_VALUE)
                                                .addGroup(pateintBorderPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cboPatientSearch,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(btnSearch)
                                                        .addComponent(txtSearchText,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(43, 43, 43)))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pateintBorderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pateintBorderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pateintBorderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pateintBorderPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSearchActionPerformed
        addData(doctorDao.restoreDataFromChar());

        if (((String) (cboPatientSearch.getSelectedItem())).equals("Major")) {
            DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
            model.setRowCount(0);
            String text = txtSearchText.getText();
            ArrayList<Doctor> listByMajor = doctorManagement.searchByMajor(text);
            System.out.println(listByMajor.get(0).getMajor());
            addData(listByMajor);
        }
        if (((String) (cboPatientSearch.getSelectedItem())).equals("Gender")) {
            DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
            model.setRowCount(0);
            String text = txtSearchText.getText();
            ArrayList<Doctor> listByGender = doctorManagement.searchByGender(text);
            // System.out.println(listByGender.get(0).getMajor());
            addData(listByGender);
        }
        if (((String) (cboPatientSearch.getSelectedItem())).equals("Status")) {
            DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
            model.setRowCount(0);
            String text = txtSearchText.getText();

            if (text.equalsIgnoreCase("AVAILABLE")) {
                text = "TRUE";
            } else {
                text = "FALSE";
            }
            ArrayList<Doctor> listByStatus = doctorManagement.searchByStatus(text);
            addData(listByStatus);
        }

    }// GEN-LAST:event_btnSearchActionPerformed

    public void addData(ArrayList<Doctor> listDoctor) {
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        // DoctorDAO doctorDao = new DoctorDAO();
        // ArrayList<Doctor> listDoctor = doctorDao.restoreDataFromChar();
        String status = "";
        for (int i = 0; i < listDoctor.size(); i++) {
            String name = listDoctor.get(i).getName();
            String major = listDoctor.get(i).getMajor();
            String gender = listDoctor.get(i).getGender();
            String phoneNumber = listDoctor.get(i).getPhoneNumber();
            String email = listDoctor.get(i).getEmail();
            String isAval = listDoctor.get(i).getIsAvailable();
            if (isAval.equalsIgnoreCase("true")) {
                status = "AVAILABLE";
            } else {
                status = "NOT AVAILABLE";

            }
            model.addRow(new String[] { name, major, gender, phoneNumber, email, status });
            // System.out.println(listDoctor.get(i).getName());

        }

    }

    public void openConfirmDialog() {
        int rowSelected = this.tblPatient.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) this.tblPatient.getModel();
        String name = (String) model.getValueAt(rowSelected, 0);
        Doctor doctorPicked = doctorManagement.searchByName(name);
        try {
            if (doctorPicked != null) {
                DialogPatientBookComfirm dialogConfirm = new DialogPatientBookComfirm(mf, true, doctorManagement,
                        doctorPicked, this);
                dialogConfirm.setVisible(true);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public DoctorManagement setListDoctor(DoctorManagement doctorMag) {
        return doctorMag;
    }

    public void addListenerDoctor(PatientMain mf) {

        this.tblPatient.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
                    openConfirmDialog();
                }
            }
        });
    }

    private void cboPatientSearchActionPerformed(java.awt.event.ActionEvent evt) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboPatientSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private PateintSwing.PateintBorderPanel pateintBorderPanel1;
    private PateintSwing.PateintBorderPanel pateintBorderPanel2;
    private PateintModel.PatientTable tblPatient;
    private javax.swing.JTextField txtSearchText;
    // End of variables declaration//GEN-END:variables
}
