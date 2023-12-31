package Minh.UI.card;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.UIManager;

public class Test extends javax.swing.JFrame {

    public Test() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        iconIncome = new raven.glassmorphism.GlassIcon();
        iconExpense = new raven.glassmorphism.GlassIcon();
        iconProfit = new raven.glassmorphism.GlassIcon();
        jButton2 = new javax.swing.JButton();
        crazyPanel1 = new raven.crazypanel.CrazyPanel();
        crazyPanel2 = new raven.crazypanel.CrazyPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        crazyPanel3 = new raven.crazypanel.CrazyPanel();
        crazyPanel4 = new raven.crazypanel.CrazyPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        crazyPanel5 = new raven.crazypanel.CrazyPanel();
        crazyPanel6 = new raven.crazypanel.CrazyPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        iconIncome.setGlassIconConfig(new raven.glassmorphism.GlassIconConfig(
                "/card/dollar.svg", 2.0f, 0, 5,
                new java.util.HashMap<Integer, String>() {
                    {
                        put(0, "@background");
                    }
                },
                new raven.glassmorphism.GlassIconConfig.GlassShape(
                        java.awt.Color.decode("#0ca064"),
                        new java.awt.geom.RoundRectangle2D.Double(2.0, 2.0, 10.0, 10.0, 5.0, 5.0),
                        45.0f)));

        iconExpense.setGlassIconConfig(new raven.glassmorphism.GlassIconConfig(
                "/card/expense.svg", 2.0f, 0, 5,
                new java.util.HashMap<Integer, String>() {
                    {
                        put(0, "@background");
                    }
                },
                new raven.glassmorphism.GlassIconConfig.GlassShape(
                        java.awt.Color.decode("#d23535"),
                        new java.awt.geom.RoundRectangle2D.Double(2.0, 2.0, 10.0, 10.0, 5.0, 5.0),
                        45.0f)));

        iconProfit.setGlassIconConfig(new raven.glassmorphism.GlassIconConfig(
                "/card/profit.svg", 2.0f, 3, 5,
                new java.util.HashMap<Integer, String>() {
                    {
                        put(3, "@background");
                    }
                },
                new raven.glassmorphism.GlassIconConfig.GlassShape(
                        java.awt.Color.decode("#6825d6"),
                        new java.awt.geom.RoundRectangle2D.Double(2.0, 2.0, 10.0, 10.0, 5.0, 5.0),
                        45.0f)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Change Mode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        crazyPanel1.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
                "arc:20;[light]background:shade(@background,2%);[dark]background:tint(@background,2%);[light]border:0,0,0,0,shade(@background,5%),,20;[dark]border:0,0,0,0,tint(@background,5%),,20",
                null));
        crazyPanel1.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
                "fill",
                "[fill,200]",
                "[fill]",
                null));

        crazyPanel2.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
                "arc:20;[light]background:lighten(@background,3%);[dark]background:darken(@background,3%)",
                new String[] {
                        "",
                        "[light]foreground:tint(@foreground,50%);[dark]foreground:shade(@foreground,50%)",
                        "font:bold +3"
                }));
        crazyPanel2.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
                "inset s 10 10 10 15",
                "[]20 push[trail]",
                "[]0[]",
                new String[] {
                        "span 1 2",
                        "wrap",
                        "ay top"
                }));

        jLabel1.setIcon(iconIncome);
        crazyPanel2.add(jLabel1);

        jLabel2.setText("Income Sell");
        crazyPanel2.add(jLabel2);

        jLabel3.setText("$900");
        crazyPanel2.add(jLabel3);

        crazyPanel1.add(crazyPanel2);

        crazyPanel3.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
                "arc:20;[light]background:shade(@background,2%);[dark]background:tint(@background,2%);[light]border:0,0,0,0,shade(@background,5%),,20;[dark]border:0,0,0,0,tint(@background,5%),,20",
                null));
        crazyPanel3.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
                "fill",
                "[fill,200]",
                "[fill]",
                null));

        crazyPanel4.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
                "arc:20;[light]background:lighten(@background,3%);[dark]background:darken(@background,3%)",
                new String[] {
                        "",
                        "[light]foreground:tint(@foreground,50%);[dark]foreground:shade(@foreground,50%)",
                        "font:bold +3"
                }));
        crazyPanel4.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
                "inset s 10 10 10 15",
                "[]20 push[trail]",
                "[]0[]",
                new String[] {
                        "span 1 2",
                        "wrap",
                        "ay top"
                }));

        jLabel4.setIcon(iconExpense);
        crazyPanel4.add(jLabel4);

        jLabel5.setText("Income Sell");
        crazyPanel4.add(jLabel5);

        jLabel6.setText("$900");
        crazyPanel4.add(jLabel6);

        crazyPanel3.add(crazyPanel4);

        crazyPanel5.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
                "arc:20;[light]background:shade(@background,2%);[dark]background:tint(@background,2%);[light]border:0,0,0,0,shade(@background,5%),,20;[dark]border:0,0,0,0,tint(@background,5%),,20",
                null));
        crazyPanel5.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
                "fill",
                "[fill,200]",
                "[fill]",
                null));

        crazyPanel6.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
                "arc:20;[light]background:lighten(@background,3%);[dark]background:darken(@background,3%)",
                new String[] {
                        "",
                        "[light]foreground:tint(@foreground,50%);[dark]foreground:shade(@foreground,50%)",
                        "font:bold +3"
                }));
        crazyPanel6.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
                "inset s 10 10 10 15",
                "[]20 push[trail]",
                "[]0[]",
                new String[] {
                        "span 1 2",
                        "wrap",
                        "ay top"
                }));

        jLabel7.setIcon(iconProfit);
        crazyPanel6.add(jLabel7);

        jLabel8.setText("Income Sell");
        crazyPanel6.add(jLabel8);

        jLabel9.setText("$900");
        crazyPanel6.add(jLabel9);

        crazyPanel5.add(crazyPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(crazyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(crazyPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(crazyPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE)
                                .addGap(261, 261, 261)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(crazyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crazyPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crazyPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369,
                                        Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap()));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        if (!FlatLaf.isLafDark()) {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatMacDarkLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        } else {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatMacLightLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        }
    }// GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.crazypanel.CrazyPanel crazyPanel1;
    private raven.crazypanel.CrazyPanel crazyPanel2;
    private raven.crazypanel.CrazyPanel crazyPanel3;
    private raven.crazypanel.CrazyPanel crazyPanel4;
    private raven.crazypanel.CrazyPanel crazyPanel5;
    private raven.crazypanel.CrazyPanel crazyPanel6;
    private raven.glassmorphism.GlassIcon iconExpense;
    private raven.glassmorphism.GlassIcon iconIncome;
    private raven.glassmorphism.GlassIcon iconProfit;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
