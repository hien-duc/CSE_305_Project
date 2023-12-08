package AuthenticationUI.main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import AuthenticationUI.login.Login;
import AuthenticationUI.login.LoginController;
import AuthenticationUI.register.Register;
import AuthenticationUI.register.RegisterController;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    JPanel cardPanel;
    Login loginView = null;
    Register registerView = null;

    public Application() {
        init();
    }

    private void init() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(new Dimension(600, 650));
        setLocationRelativeTo(null);

        // Create the Login view and controller
        cardPanel = new JPanel(new CardLayout());
        loginView = new Login();
        registerView = new Register();

        cardPanel.add(loginView, "login");
        cardPanel.add(registerView, "register");

        new LoginController(loginView);
        new RegisterController(registerView);

        setContentPane(cardPanel);
        loginView.getBtnChangeToRegister().addActionListener(e -> changePanelToRegister());
        registerView.getBtnChangeToLogin().addActionListener(e -> changePanelToLogin());

    }

    public void changePanelToLogin() {
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.show(cardPanel, "login");
    }

    public void changePanelToRegister() {
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.show(cardPanel, "register");
    }

    public static void main(String[] args) {
        // Set up the look and feel
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("raven.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();

        // Launch the application
        SwingUtilities.invokeLater(() -> {
            Application application = new Application();
            application.setVisible(true);
        });
    }

    public void hideLogin() {
        this.setVisible(false);
    }

    public static String getStringPassword(char[] password) {
        StringBuilder sb = new StringBuilder();
        for (char c : password) {
            sb.append(c);
        }
        return sb.toString();
    }
}
