/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PatientForm;

import PateintMain.PatientMain;

/**
 *
 * @author My PC
 */
public class Patient_FormChat extends javax.swing.JPanel {

    // Data members

    private PatientMain main;

    public Patient_FormChat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pateintBorderPanel1 = new PateintSwing.PateintBorderPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPatientDoctorNameComfirm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pateintBorderPanel2 = new PateintSwing.PateintBorderPanel();

        setBackground(new java.awt.Color(229, 255, 255));

        pateintBorderPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("/PateintIcon/icons8-doctor-96.png")); // NOI18N

        lblPatientDoctorNameComfirm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPatientDoctorNameComfirm.setText("Dr. John Doe");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon("/PateintIcon/icons8-clock-24.png")); // NOI18N
        jLabel3.setText("8 am to 6 pm");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("SEND MESSAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pateintBorderPanel1Layout = new javax.swing.GroupLayout(pateintBorderPanel1);
        pateintBorderPanel1.setLayout(pateintBorderPanel1Layout);
        pateintBorderPanel1Layout.setHorizontalGroup(
                pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(pateintBorderPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(lblPatientDoctorNameComfirm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436,
                                        Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)));
        pateintBorderPanel1Layout.setVerticalGroup(
                pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                                .addGroup(pateintBorderPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pateintBorderPanel1Layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(pateintBorderPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                pateintBorderPanel1Layout.createSequentialGroup()
                                                                        .addComponent(lblPatientDoctorNameComfirm)
                                                                        .addGap(27, 27, 27)
                                                                        .addComponent(jLabel3))
                                                        .addComponent(jButton1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pateintBorderPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pateintBorderPanel2Layout = new javax.swing.GroupLayout(pateintBorderPanel2);
        pateintBorderPanel2.setLayout(pateintBorderPanel2Layout);
        pateintBorderPanel2Layout.setHorizontalGroup(
                pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        pateintBorderPanel2Layout.setVerticalGroup(
                pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 334, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pateintBorderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pateintBorderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pateintBorderPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pateintBorderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

    }// GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPatientDoctorNameComfirm;
    private PateintSwing.PateintBorderPanel pateintBorderPanel1;
    private PateintSwing.PateintBorderPanel pateintBorderPanel2;
    // End of variables declaration//GEN-END:variables
}
