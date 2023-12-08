package AuthenticationUI.login;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {

    public Login() {
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        chkRememberMe = new JCheckBox("Remember me");
        btnLoginPatient = new JButton("Login as patient");
        btnLoginDoctor = new JButton("Login as doctor");
        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, "" +
                "arc:20;" +
                "[light]background:darken(@background,3%);" +
                "[dark]background:lighten(@background,3%)");

        txtPassword.putClientProperty(FlatClientProperties.STYLE, "" +
                "showRevealButton:true");
        btnLoginPatient.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]background:darken(@background,10%);" +
                "[dark]background:lighten(@background,10%);" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0");
        btnLoginDoctor.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]background:darken(@background,10%);" +
                "[dark]background:lighten(@background,10%);" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your username or email");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");

        JLabel lbTitle = new JLabel("Welcome back!");
        JLabel description = new JLabel("Your Health, Our Happiness");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold +10");
        description.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");

        panel.add(lbTitle);
        panel.add(description);
        panel.add(new JLabel("Username"), "gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        panel.add(chkRememberMe, "grow 0");
        panel.add(btnLoginPatient, "gapy 10, split 2");
        panel.add(btnLoginDoctor, "gapy 10");
        JPanel panelChange = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelChange.putClientProperty(FlatClientProperties.STYLE, "" +
                "background:null");
        btnChangeToRegister = new JButton("<html><a href=\"#\">Sign up</a></html>");
        btnChangeToRegister.putClientProperty(FlatClientProperties.STYLE, "" +
                "border:3,3,3,3");
        btnChangeToRegister.setContentAreaFilled(false);
        btnChangeToRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // btnChangeToLogin.addActionListener(e -> {
        // FormsManager.getInstance().showForm(new Register());
        // });
        JLabel label = new JLabel("Don't have an account ?");
        label.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");
        panelChange.add(label);
        panelChange.add(btnChangeToRegister);
        panel.add(panelChange);
        add(panel);
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JCheckBox getChkRememberMe() {
        return chkRememberMe;
    }

    public JButton getBtnLoginPatient() {
        return btnLoginPatient;
    }

    public JButton getBtnLoginDoctor() {
        return btnLoginDoctor;
    }

    public JButton getBtnChangeToRegister() {
        return btnChangeToRegister;
    }

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JCheckBox chkRememberMe;
    private JButton btnLoginPatient;
    private JButton btnLoginDoctor;
    private JButton btnChangeToRegister;
}