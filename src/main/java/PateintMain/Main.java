/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PateintMain;

import PateintEvent.PateintEventMenuSelected;
import PatientForm.Patient_FormAccount;
import PatientForm.Patient_FormAppointment;
import PatientForm.Patient_FormChat;
import PatientForm.Patient_FormDashboard;
import PatientForm.Patient_FormHistory;
import PatientForm.Patient_FormHome;
import PatientForm.Patient_FormLogOut;
import java.awt.Color;
import javax.swing.JComponent;

/**
 *
 * @author My PC
 */
public class Main extends javax.swing.JFrame {

    // Data members
    private Patient_FormHome patient_FormHome;
    private Patient_FormAccount patient_FormAccount;
    private Patient_FormAppointment patient_FormAppointment;
    private Patient_FormDashboard patient_FormDashboard;
    private Patient_FormHistory patient_FormHistory;
    private Patient_FormLogOut patient_FormLogOut;
    private Patient_FormChat patient_FormChat;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        patientMenu.initMoving(Main.this);
        patient_FormHome = new Patient_FormHome();
        patient_FormAccount = new Patient_FormAccount();
        patient_FormAppointment = new Patient_FormAppointment();
        patient_FormDashboard = new Patient_FormDashboard();
        patient_FormHistory = new Patient_FormHistory();
        patient_FormLogOut = new Patient_FormLogOut();
        patient_FormChat = new Patient_FormChat();

        patientMenu.addEventMenuSelected(new PateintEventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    setForm(patient_FormHome);
                } else if (index == 1) {
                    setForm(patient_FormAccount);
                } else if (index == 2) {
                    setForm(patient_FormAppointment);
                } else if (index == 3) {
                    setForm(patient_FormHistory);
                } else if (index == 4) {
                    setForm(patient_FormChat);
                } else if (index == 9) {
                    setForm(patient_FormLogOut);
                }
            }

        });
        setForm(new Patient_FormHome());
    }

    public void setForm(JComponent com) {
        Patient_mainPanel.removeAll();
        Patient_mainPanel.add(com);
        Patient_mainPanel.repaint();
        Patient_mainPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pateintBorderPanel1 = new PateintSwing.PateintBorderPanel();
        patientMenu = new PateintComponent.PatientMenu();
        Patient_mainPanel = new javax.swing.JPanel();
        patientHeader1 = new PateintComponent.PatientHeader();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pateintBorderPanel1.setBackground(new java.awt.Color(238, 234, 234));

        Patient_mainPanel.setOpaque(false);
        Patient_mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pateintBorderPanel1Layout = new javax.swing.GroupLayout(pateintBorderPanel1);
        pateintBorderPanel1.setLayout(pateintBorderPanel1Layout);
        pateintBorderPanel1Layout.setHorizontalGroup(
            pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                .addComponent(patientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(patientHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(Patient_mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        pateintBorderPanel1Layout.setVerticalGroup(
            pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                .addComponent(patientHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Patient_mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pateintBorderPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pateintBorderPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Patient_mainPanel;
    private PateintSwing.PateintBorderPanel pateintBorderPanel1;
    private PateintComponent.PatientHeader patientHeader1;
    private PateintComponent.PatientMenu patientMenu;
    // End of variables declaration//GEN-END:variables
}
