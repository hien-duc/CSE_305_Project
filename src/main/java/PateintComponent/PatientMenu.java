package PateintComponent;

import PateintEvent.PateintEventMenuSelected;
import PateintModel.PatientModel_Menu;
//import PateintIcon;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.text.GapContent;

public class PatientMenu extends javax.swing.JPanel {

    // Data members
    private int x;
    private int y;
    private PateintEventMenuSelected event;

    // Constructors
    public PatientMenu() {
        initComponents();
        setOpaque(false);
        patientList_Menu1.setOpaque(false);
        init();
    }

    // Methods
    public void addEventMenuSelected(PateintEventMenuSelected event) {
        this.event = event;
        patientList_Menu1.addEventMenuSelected(event);
    }

    private void init() {
        patientList_Menu1
                .addItem(new PatientModel_Menu("icons8-dashboard-24", "Dashboard", PatientModel_Menu.MenuType.MENU));
        patientList_Menu1
                .addItem(new PatientModel_Menu("icons8-account-24", "Account", PatientModel_Menu.MenuType.MENU));
        patientList_Menu1.addItem(
                new PatientModel_Menu("icons8-person-calendar-24", "Appointment", PatientModel_Menu.MenuType.MENU));
        patientList_Menu1.addItem(
                new PatientModel_Menu("icons8-activity-history-24", "History", PatientModel_Menu.MenuType.MENU));
        patientList_Menu1.addItem(new PatientModel_Menu("icons8-chat-25", "Chat", PatientModel_Menu.MenuType.MENU));

        patientList_Menu1.addItem(new PatientModel_Menu("", " ", PatientModel_Menu.MenuType.EMPTY));
        patientList_Menu1.addItem(new PatientModel_Menu("", " ", PatientModel_Menu.MenuType.EMPTY));
        patientList_Menu1.addItem(new PatientModel_Menu("", " ", PatientModel_Menu.MenuType.EMPTY));
        patientList_Menu1.addItem(new PatientModel_Menu("", " ", PatientModel_Menu.MenuType.EMPTY));
        patientList_Menu1
                .addItem(new PatientModel_Menu("icons8-open-pane-24", "Log-out", PatientModel_Menu.MenuType.MENU));

    }

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#0575E6"), 0, getHeight(), Color.decode("#021B79"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 2, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientpanelMoving = new javax.swing.JPanel();
        patientList_Menu1 = new PateintSwing.PatientList_Menu<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPatientNameMenuSide = new javax.swing.JLabel();

        PatientpanelMoving.setOpaque(false);

        javax.swing.GroupLayout PatientpanelMovingLayout = new javax.swing.GroupLayout(PatientpanelMoving);
        PatientpanelMoving.setLayout(PatientpanelMovingLayout);
        PatientpanelMovingLayout.setHorizontalGroup(
                PatientpanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 54, Short.MAX_VALUE));
        PatientpanelMovingLayout.setVerticalGroup(
                PatientpanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 62, Short.MAX_VALUE));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient_User");

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\user.png"))); // NOI18N

        lblPatientNameMenuSide.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        lblPatientNameMenuSide.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientNameMenuSide.setText("ABC_HMG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPatientNameMenuSide)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel3)))
                                .addGap(37, 37, 37)
                                .addComponent(PatientpanelMoving, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(patientList_Menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 244,
                                        Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(PatientpanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 405, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPatientNameMenuSide,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)))
                                .addContainerGap(385, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 80, Short.MAX_VALUE)
                                        .addComponent(patientList_Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 387,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))));
    }// </editor-fold>//GEN-END:initComponents

    public void initMoving(JFrame frame) {
        PatientpanelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();

            }
        });

        PatientpanelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                frame.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PatientpanelMoving;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPatientNameMenuSide;
    private PateintSwing.PatientList_Menu<String> patientList_Menu1;
    // End of variables declaration//GEN-END:variables
}
