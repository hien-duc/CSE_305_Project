package DoctorComponent;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class DoctorHeader extends javax.swing.JPanel {

    public DoctorHeader() {
        initComponents();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        patientSearchText1 = new DoctorSwing.DoctorSearchText();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\icons8-search-26.png"))); // NOI18N

        patientSearchText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchText1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\icons8-x-32.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientSearchText1, javax.swing.GroupLayout.DEFAULT_SIZE, 376,
                                        Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(patientSearchText1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void patientSearchText1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_patientSearchText1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_patientSearchText1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0);

    }// GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private DoctorSwing.DoctorSearchText patientSearchText1;
    // End of variables declaration//GEN-END:variables
}
