package PatientForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import Duc.Table.TableGradientCell;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import Duc.Payment.*;
import PateintMain.PatientMain;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Patient_FormHistory extends javax.swing.JPanel {

    /**
     * Creates new form Patient_FormHistory
     */
    private String username;
    private PatientMain main;
    PaymentManager paymentManager = new PaymentManager();
    ArrayList<Payment> payments;

    public Patient_FormHistory(String name, PatientMain main) {
        FlatLaf.registerCustomDefaultsSource("raven.table");
        // FlatMacDarkLaf.setup();
        FlatMacLightLaf.setup();
        initComponents();
        tblPayment.setDefaultRenderer(Object.class, new TableGradientCell());
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        tblPayment.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
        scroll.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");
        payments = paymentManager.searchByUserName(username);
        fillTableFata(payments);
        this.username = name;
        this.main = main;
        this.addListenerPayment(main);
        btnReload.doClick();
    }

    //
    public Patient_FormHistory() {
        FlatLaf.registerCustomDefaultsSource("raven.table");
        // FlatMacDarkLaf.setup();
        FlatMacLightLaf.setup();
        initComponents();
        tblPayment.setDefaultRenderer(Object.class, new TableGradientCell());
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        tblPayment.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
        scroll.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");
        fillTableFata(payments);
        this.addListenerPayment(main);
    }

    private void fillTableFata(ArrayList<Payment> payments) {
        DefaultTableModel model = (DefaultTableModel) tblPayment.getModel();
        // PaymentManager paymentManager = new PaymentManager();
        // payments = paymentManager.searchByUserName(username);
        // ArrayList<Payment> payment= paymentManager.searchPayments(name);
        // PaymentDAO paymentDAO = new PaymentDAO();
        // ArrayList<Payment> payments = paymentDAO.restorePayment();
        // System.out.println(payments.get(0).getUsername());
        for (int i = 0; i < payments.size(); i++) {
            String name = payments.get(i).getUsername();
            String illness = payments.get(i).getIllness();
            String medication = payments.get(i).getMedication();
            String payment = Double.toString(payments.get(i).calculateTotal());
            String date = payments.get(i).getDate();
            String paid = payments.get(i).getPaid();
            model.addRow(new String[] { name, illness, medication, payment, date, paid });
        }

    }

    public void openPaymentDialog() {
        DefaultTableModel model = (DefaultTableModel) this.tblPayment.getModel();
        int rowSelected = this.tblPayment.getSelectedRow();
        String date = (String) model.getValueAt(rowSelected, 4);
        PaymentManager paymentManager = new PaymentManager();

        Payment paymentPick = paymentManager.searchPaymentByDate(date);
        System.out.println(paymentPick);
        try {
            if (paymentPick != null) {
                PaymentDialog paymentDialog = new PaymentDialog(main, true, paymentPick, date);
                // PaymentDialog paymentDialog = new PaymentDialog(main,true);

                paymentDialog.setVisible(true);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addListenerPayment(PatientMain mf) {

        this.tblPayment.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
                    openPaymentDialog();
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        btnReload = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new java.awt.BorderLayout());

        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Illness", "Medication", "Payment", "Date", "Paid"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPaymentMouseClicked(evt);
            }
        });
        scroll.setViewportView(tblPayment);

        jPanel1.add(scroll, java.awt.BorderLayout.CENTER);

        btnReload.setBackground(new java.awt.Color(51, 204, 255));
        btnReload.setText("Reload");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnReload))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807,
                                                        Short.MAX_VALUE)))
                                .addGap(36, 36, 36)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnReload)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addGap(38, 38, 38)));
    }// </editor-fold>//GEN-END:initComponents

    private void tblPaymentMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblPaymentMouseClicked
        // TODO add your handling code here:
        /*
         * this.tblPayment.addMouseListener(new MouseAdapter() {
         * 
         * @Override
         * public void mouseClicked(MouseEvent e) {
         * if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
         * openPaymentDialog();
         * }
         * }
         * });
         */
    }// GEN-LAST:event_tblPaymentMouseClicked

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnReloadActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) this.tblPayment.getModel();
        model.setRowCount(0);
        PaymentManager paymentManager = new PaymentManager();
        ArrayList<Payment> payments = paymentManager.searchByUserName(username);
        fillTableFata(payments);
        System.out.println(username);
        System.out.println(payments.size());
    }// GEN-LAST:event_btnReloadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReload;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblPayment;
    // End of variables declaration//GEN-END:variables
}
