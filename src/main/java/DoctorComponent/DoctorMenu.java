package DoctorComponent;

import DoctorModel.DoctorModel_Menu;
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
import DoctorEvent.DoctorEventMenuSelected;

public class DoctorMenu extends javax.swing.JPanel {

    //Data members
    private int x;
    private int y;
    private DoctorEventMenuSelected event;

    //Constructors
    public DoctorMenu() {
        initComponents();
        setOpaque(false);
        doctorList_Menu1.setOpaque(false);
        init();
    }

    //Methods
    public void addEventMenuSelected(DoctorEventMenuSelected event) {
        this.event = event;
        doctorList_Menu1.addEventMenuSelected(event);
    }

    private void init() {
        doctorList_Menu1.addItem(new DoctorModel_Menu("icons8-dashboard-24", "Dashboard", DoctorModel_Menu.MenuType.MENU));
        doctorList_Menu1.addItem(new DoctorModel_Menu("icons8-account-24", "Account", DoctorModel_Menu.MenuType.MENU));
        doctorList_Menu1.addItem(new DoctorModel_Menu("icons8-person-calendar-24", "Appointment", DoctorModel_Menu.MenuType.MENU));
        doctorList_Menu1.addItem(new DoctorModel_Menu("icons8-activity-history-24", "History", DoctorModel_Menu.MenuType.MENU));     
        doctorList_Menu1.addItem(new DoctorModel_Menu("", " ", DoctorModel_Menu.MenuType.EMPTY));
        doctorList_Menu1.addItem(new DoctorModel_Menu("", " ", DoctorModel_Menu.MenuType.EMPTY));
        doctorList_Menu1.addItem(new DoctorModel_Menu("", " ", DoctorModel_Menu.MenuType.EMPTY));
        doctorList_Menu1.addItem(new DoctorModel_Menu("", " ", DoctorModel_Menu.MenuType.EMPTY));
        doctorList_Menu1.addItem(new DoctorModel_Menu("icons8-open-pane-24", "Log-out", DoctorModel_Menu.MenuType.MENU));

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientpanelMoving = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doctorList_Menu1 = new DoctorSwing.DoctorList_Menu<>();

        setPreferredSize(new java.awt.Dimension(258, 467));

        PatientpanelMoving.setOpaque(false);

        javax.swing.GroupLayout PatientpanelMovingLayout = new javax.swing.GroupLayout(PatientpanelMoving);
        PatientpanelMoving.setLayout(PatientpanelMovingLayout);
        PatientpanelMovingLayout.setHorizontalGroup(
            PatientpanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        PatientpanelMovingLayout.setVerticalGroup(
            PatientpanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Doctor_User");

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(("src\\main\\java\\PateintIcon\\user.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ABC_HMG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientpanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGap(21, 21, 21))
            .addComponent(doctorList_Menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientpanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(doctorList_Menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
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
    private DoctorSwing.DoctorList_Menu<String> doctorList_Menu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
