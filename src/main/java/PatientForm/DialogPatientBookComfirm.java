
package PatientForm;

import Booking.Booking;
import Booking.BookingManage;
import DAO.BookingDAO;
import DAO.DoctorDAO;
import Doctor.Doctor;
import Doctor.DoctorManagement;
import PateintMain.PatientMain;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class DialogPatientBookComfirm extends javax.swing.JDialog {

        // Data members
        // private DoctorManagement doctorManagement;
        private Patient_FormAppointment formAppoitment;
        private Doctor doctor;
        private DoctorDAO doctorDAO = new DoctorDAO();
        private DoctorManagement doctorManagement;
        private ArrayList<Doctor> listDoctor = doctorDAO.restoreDataFromChar();
        private BookingDAO bookingDao = new BookingDAO();
        private BookingManage bookingManagement = new BookingManage();

        // Constructors
        public DialogPatientBookComfirm(java.awt.Frame parent, boolean modal, DoctorManagement doctorManagement,
                        Doctor doctor, Patient_FormAppointment formAppoitment) {
                super(parent, modal);
                initComponents();
                setLocationRelativeTo(this);
                this.doctor = doctor;
                this.doctorManagement = doctorManagement;
                bookingManagement.setListBooking(bookingDao.restoreDataFromChar());
                fillData(doctor);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                pateintBorderPanel1 = new PateintSwing.PateintBorderPanel();
                pateintBorderPanel2 = new PateintSwing.PateintBorderPanel();
                jLabel2 = new javax.swing.JLabel();
                lblPatientDoctorNameComfirm = new javax.swing.JLabel();
                lblPatientDoctorMajorConfirm = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                lblPatientDoctorExpComfirm = new javax.swing.JLabel();
                lblPatientDoctorGenderComfirm = new javax.swing.JLabel();
                lblPatientConfirmEx = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                btnPatientCancel = new javax.swing.JButton();
                btnPatientBook = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                txtPatientConfirmName = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                txtPatientConfirmContact = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                txtPatientConfirmGender = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                txtPatientConfirmAge = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                txaPatientConfirmProblem = new javax.swing.JTextArea();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));

                jPanel1.setBackground(new java.awt.Color(230, 253, 253));

                pateintBorderPanel1.setBackground(new java.awt.Color(255, 255, 255));
                pateintBorderPanel1
                                .setBorder(javax.swing.BorderFactory
                                                .createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

                pateintBorderPanel2.setBackground(new java.awt.Color(0, 51, 255));

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PateintIcon/icons8-doctor-96.png"))); // NOI18N

                lblPatientDoctorNameComfirm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
                lblPatientDoctorNameComfirm.setForeground(new java.awt.Color(0, 0, 0));
                lblPatientDoctorNameComfirm.setText("Dr. John Doe");

                lblPatientDoctorMajorConfirm.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
                lblPatientDoctorMajorConfirm.setForeground(new java.awt.Color(0, 0, 0));
                lblPatientDoctorMajorConfirm.setText("Dentist");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(204, 204, 204));
                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PateintIcon/icons8-clock-24.png"))); // NOI18N
                jLabel3.setText("8 am to 6 pm");

                javax.swing.GroupLayout pateintBorderPanel2Layout = new javax.swing.GroupLayout(pateintBorderPanel2);
                pateintBorderPanel2.setLayout(pateintBorderPanel2Layout);
                pateintBorderPanel2Layout.setHorizontalGroup(
                                pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pateintBorderPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(pateintBorderPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(lblPatientDoctorNameComfirm)
                                                                                .addComponent(lblPatientDoctorMajorConfirm))
                                                                .addContainerGap(37, Short.MAX_VALUE)));
                pateintBorderPanel2Layout.setVerticalGroup(
                                pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pateintBorderPanel2Layout.createSequentialGroup()
                                                                .addGroup(pateintBorderPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(pateintBorderPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jLabel2))
                                                                                .addGroup(pateintBorderPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(14, 14, 14)
                                                                                                .addComponent(lblPatientDoctorNameComfirm)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(lblPatientDoctorMajorConfirm)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                14,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel3)
                                                                .addContainerGap()));

                lblPatientDoctorExpComfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                lblPatientDoctorExpComfirm.setForeground(new java.awt.Color(51, 51, 51));
                lblPatientDoctorExpComfirm.setText("40 Years 3 Months");

                lblPatientDoctorGenderComfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                lblPatientDoctorGenderComfirm.setForeground(new java.awt.Color(51, 51, 51));
                lblPatientDoctorGenderComfirm.setText("Male");

                lblPatientConfirmEx.setForeground(new java.awt.Color(51, 51, 51));
                lblPatientConfirmEx.setText("American Dental Association (ADA)");

                jLabel4.setBackground(new java.awt.Color(51, 51, 255));
                jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(0, 0, 204));
                jLabel4.setText("CONFIRM");

                btnPatientCancel.setBackground(new java.awt.Color(153, 153, 153));
                btnPatientCancel.setText("CANCEL");
                btnPatientCancel.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPatientCancelActionPerformed(evt);
                        }
                });

                btnPatientBook.setBackground(new java.awt.Color(51, 51, 255));
                btnPatientBook.setText("BOOK");
                btnPatientBook.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPatientBookActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout pateintBorderPanel1Layout = new javax.swing.GroupLayout(pateintBorderPanel1);
                pateintBorderPanel1.setLayout(pateintBorderPanel1Layout);
                pateintBorderPanel1Layout.setHorizontalGroup(
                                pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                                                                .addComponent(pateintBorderPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(pateintBorderPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblPatientDoctorExpComfirm)
                                                                                .addComponent(lblPatientDoctorGenderComfirm)
                                                                                .addComponent(lblPatientConfirmEx)
                                                                                .addGroup(pateintBorderPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(btnPatientCancel)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(btnPatientBook))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                pateintBorderPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                90,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addGap(23, 23, 23)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                pateintBorderPanel1Layout.setVerticalGroup(
                                pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                                                                .addGroup(pateintBorderPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(pateintBorderPanel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(pateintBorderPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(lblPatientDoctorExpComfirm)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(lblPatientDoctorGenderComfirm)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(lblPatientConfirmEx)
                                                                                                .addGap(45, 45, 45)
                                                                                                .addComponent(jLabel4)
                                                                                                .addGap(8, 8, 8)
                                                                                                .addGroup(pateintBorderPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(btnPatientCancel)
                                                                                                                .addComponent(btnPatientBook))))
                                                                .addGap(0, 14, Short.MAX_VALUE)));

                jLabel5.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 51, 204));
                jLabel5.setText("PATIENT - DETAIL");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(0, 0, 0));
                jLabel6.setText("Full Name:");

                txtPatientConfirmName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(0, 0, 0));
                jLabel7.setText("Contact:");

                txtPatientConfirmContact.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                txtPatientConfirmContact.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtPatientConfirmContactActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(0, 0, 0));
                jLabel8.setText("Gender:");

                txtPatientConfirmGender.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(0, 0, 0));
                jLabel9.setText("Your Age:");

                txtPatientConfirmAge.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(0, 0, 0));
                jLabel10.setText("Your Problem:");

                txaPatientConfirmProblem.setColumns(20);
                txaPatientConfirmProblem.setRows(5);
                jScrollPane1.setViewportView(txaPatientConfirmProblem);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(19, 19, 19)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                jPanel1Layout.createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                jLabel10)
                                                                                                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                jLabel9)
                                                                                                                                                                                                                                                                                .addGap(37,
                                                                                                                                                                                                                                                                                                37,
                                                                                                                                                                                                                                                                                                37)))
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                jLabel8)
                                                                                                                                                                                                                                                .addGap(51,
                                                                                                                                                                                                                                                                51,
                                                                                                                                                                                                                                                                51)))
                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                                                                .addGap(49, 49, 49)))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel6)
                                                                                                                                                                .addGap(33, 33, 33)))
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                false)
                                                                                                                                                                .addComponent(txtPatientConfirmContact,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                214,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(txtPatientConfirmName,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING))
                                                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                false)
                                                                                                                                                                .addComponent(txtPatientConfirmAge,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(txtPatientConfirmGender,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                115,
                                                                                                                                                                                Short.MAX_VALUE))))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(pateintBorderPanel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(pateintBorderPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(txtPatientConfirmName,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(txtPatientConfirmContact,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(txtPatientConfirmGender,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(txtPatientConfirmAge,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel10)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(98, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        public boolean doValidate() {
                boolean flag = true;

                if ((txtPatientConfirmName.getText()).equals("")) {
                        flag = false;
                }
                if (txtPatientConfirmContact.getText().equals("")) {
                        flag = false;
                }
                if (txtPatientConfirmGender.getText().equals("")) {
                        flag = false;
                }
                if ((txtPatientConfirmAge.getText()).equals("")) {
                        flag = false;
                }
                if (txaPatientConfirmProblem.getText().equals("")) {
                        flag = false;
                }

                if (!flag) {
                        JOptionPane.showMessageDialog(this, "Please full fill the blank", "Validation Data",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
                return flag;
        }

        private void txtPatientConfirmContactActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPatientConfirmContactActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txtPatientConfirmContactActionPerformed

        private void btnPatientBookActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPatientBookActionPerformed
                if (doValidate()) {
                        bookAppoitment(doctor);
                        JOptionPane.showMessageDialog(this, "Booking Successfully");
                }
        }// GEN-LAST:event_btnPatientBookActionPerformed

        private void btnPatientCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPatientCancelActionPerformed
                dispose();
        }// GEN-LAST:event_btnPatientCancelActionPerformed

        public void fillData(Doctor doctor) {
                lblPatientDoctorExpComfirm.setText(doctor.getExperience());
                lblPatientDoctorGenderComfirm.setText(doctor.getGender());
                lblPatientDoctorMajorConfirm.setText(doctor.getMajor());
                lblPatientDoctorNameComfirm.setText(doctor.getName());
                lblPatientConfirmEx.setText(doctor.getQualification());
        }

        public void bookAppoitment(Doctor doctor) {
                Booking booking = new Booking(doctor, txtPatientConfirmName.getText(),
                                txtPatientConfirmContact.getText(),
                                txtPatientConfirmGender.getText(), txtPatientConfirmAge.getText(),
                                txaPatientConfirmProblem.getText());
                System.out.println(booking.toString());
                bookingManagement.addBooking(booking);

                for (int i = 0; i < listDoctor.size(); i++) {
                        if (listDoctor.get(i).getUserName().equals(doctor.getUserName())) {
                                listDoctor.get(i).setIsAvailable("FALSE");
                        }
                }
                formAppoitment = new Patient_FormAppointment();
                formAppoitment.addData(listDoctor);
                doctorDAO.saveDataByChar(listDoctor);
        }

        public static void main(String args[]) {
                FlatMacLightLaf.setup();
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {

                                Doctor doctor = new Doctor();
                                DoctorManagement doctorManagement = new DoctorManagement();
                                PatientMain mf = new PatientMain();
                                Patient_FormAppointment formAppointment = new Patient_FormAppointment();
                                DialogPatientBookComfirm dialog = new DialogPatientBookComfirm(mf, true,
                                                doctorManagement, doctor,
                                                formAppointment);
                                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                        @Override
                                        public void windowClosing(java.awt.event.WindowEvent e) {
                                                System.exit(0);
                                        }
                                });
                                dialog.setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnPatientBook;
        private javax.swing.JButton btnPatientCancel;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblPatientConfirmEx;
        private javax.swing.JLabel lblPatientDoctorExpComfirm;
        private javax.swing.JLabel lblPatientDoctorGenderComfirm;
        private javax.swing.JLabel lblPatientDoctorMajorConfirm;
        private javax.swing.JLabel lblPatientDoctorNameComfirm;
        private PateintSwing.PateintBorderPanel pateintBorderPanel1;
        private PateintSwing.PateintBorderPanel pateintBorderPanel2;
        private javax.swing.JTextArea txaPatientConfirmProblem;
        private javax.swing.JTextField txtPatientConfirmAge;
        private javax.swing.JTextField txtPatientConfirmContact;
        private javax.swing.JTextField txtPatientConfirmGender;
        private javax.swing.JTextField txtPatientConfirmName;
        // End of variables declaration//GEN-END:variables
}
