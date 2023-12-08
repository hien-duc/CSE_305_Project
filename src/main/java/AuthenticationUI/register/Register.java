package AuthenticationUI.register;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;
import AuthenticationUI.component.PasswordStrengthStatus;

import javax.swing.*;
import java.awt.*;

public class Register extends JPanel {
        public Register() {
                init();
        }

        private void init() {
                setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
                txtFirstName = new JTextField();
                txtLastName = new JTextField();
                txtUsername = new JTextField();
                txtPassword = new JPasswordField();
                txtConfirmPassword = new JPasswordField();
                btnRegisterPatient = new JButton("Sign up as patient");
                btnRegisterDoctor = new JButton("Sign up as doctor");
                passwordStrengthStatus = new PasswordStrengthStatus();

                JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "[fill,360]"));
                panel.putClientProperty(FlatClientProperties.STYLE, "" +
                                "arc:20;" +
                                "[light]background:darken(@background,3%);" +
                                "[dark]background:lighten(@background,3%)");

                txtFirstName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "First name");
                txtLastName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Last name");
                txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your username or email");
                txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");
                txtConfirmPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Re-enter your password");
                txtPassword.putClientProperty(FlatClientProperties.STYLE, "" +
                                "showRevealButton:true");
                txtConfirmPassword.putClientProperty(FlatClientProperties.STYLE, "" +
                                "showRevealButton:true");

                btnRegisterPatient.putClientProperty(FlatClientProperties.STYLE, "" +
                                "[light]background:darken(@background,10%);" +
                                "[dark]background:lighten(@background,10%);" +
                                "borderWidth:0;" +
                                "focusWidth:0;" +
                                "innerFocusWidth:0");
                btnRegisterDoctor.putClientProperty(FlatClientProperties.STYLE, "" +
                                "[light]background:darken(@background,10%);" +
                                "[dark]background:lighten(@background,10%);" +
                                "borderWidth:0;" +
                                "focusWidth:0;" +
                                "innerFocusWidth:0");

                JLabel lbTitle = new JLabel("Welcome to our consult product");
                JLabel description = new JLabel("Join us to understand, connect, and your health. Sign up now!");
                lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                                "font:bold +10");
                description.putClientProperty(FlatClientProperties.STYLE, "" +
                                "[light]foreground:lighten(@foreground,30%);" +
                                "[dark]foreground:darken(@foreground,30%)");

                passwordStrengthStatus.initPasswordField(txtPassword);

                panel.add(lbTitle);
                panel.add(description);
                panel.add(new JSeparator(), "gapy 5 5");
                panel.add(new JLabel("Username or Email"));
                panel.add(txtUsername);
                panel.add(new JLabel("Password"), "gapy 8");
                panel.add(txtPassword);
                panel.add(passwordStrengthStatus, "gapy 0");
                panel.add(new JLabel("Confirm Password"), "gapy 0");
                panel.add(txtConfirmPassword);
                panel.add(btnRegisterPatient, "gapy 20, split 2");
                panel.add(btnRegisterDoctor, "gapy 20");
                JPanel panelRegister = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
                panelRegister.putClientProperty(FlatClientProperties.STYLE, "" +
                                "background:null");
                btnChangeToLogin = new JButton("<html><a href=\"#\">Sign in here</a></html>");
                btnChangeToLogin.putClientProperty(FlatClientProperties.STYLE, "" +
                                "border:3,3,3,3");
                btnChangeToLogin.setContentAreaFilled(false);
                btnChangeToLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
                // btnChangeToLogin.addActionListener(e -> {
                // FormsManager.getInstance().showForm(new Login());
                // });
                JLabel label = new JLabel("Already have an account?");
                label.putClientProperty(FlatClientProperties.STYLE, "" +
                                "[light]foreground:lighten(@foreground,30%);" +
                                "[dark]foreground:darken(@foreground,30%)");
                panelRegister.add(label);
                panelRegister.add(btnChangeToLogin);
                panel.add(panelRegister);
                add(panel);
        }

        public JButton getBtnChangeToLogin() {
                return btnChangeToLogin;
        }

        public JTextField getTxtFirstName() {
                return txtFirstName;
        }

        public JTextField getTxtLastName() {
                return txtLastName;
        }

        public JRadioButton getRdoMale() {
                return rdoMale;
        }

        public JRadioButton getRdoFemale() {
                return rdoFemale;
        }

        public JTextField getTxtUsername() {
                return txtUsername;
        }

        public JPasswordField getTxtPassword() {
                return txtPassword;
        }

        public JPasswordField getTxtConfirmPassword() {
                return txtConfirmPassword;
        }

        public ButtonGroup getBgGender() {
                return bgGender;
        }

        public JButton getBtnRegisterPatient() {
                return btnRegisterPatient;
        }

        public JButton getBtnRegisterDoctor() {
                return btnRegisterDoctor;
        }

        public PasswordStrengthStatus getPasswordStrengthStatus() {
                return passwordStrengthStatus;
        }

        private JTextField txtFirstName;
        private JTextField txtLastName;
        private JRadioButton rdoMale;
        private JRadioButton rdoFemale;
        private JTextField txtUsername;
        private JPasswordField txtPassword;
        private JPasswordField txtConfirmPassword;
        private ButtonGroup bgGender;
        private JButton btnRegisterPatient;
        private JButton btnRegisterDoctor;
        private PasswordStrengthStatus passwordStrengthStatus;
        private JButton btnChangeToLogin;

}
