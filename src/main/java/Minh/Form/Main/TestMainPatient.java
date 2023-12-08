package Minh.Form.Main;

import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import Minh.Form.Controller.FormControllerPatient;
import Minh.Form.Model.OfPatient;
import Patient.Patient;

import java.awt.Font;

public class TestMainPatient {
    public static void main(String[] args) throws InterruptedException {

        // Install necessary libraries
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("crazypanel");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();

        // Configure a controller
        OfPatient viewPatient = new OfPatient();

        Patient modelPatient = new Patient(
                "30-11-2003", // Date of Birth
                "Software Engineer", // Job
                "yes", // Insurance
                "5'10", // Height
                "160 lbs", // Weight
                "A+", // Blood Type
                "john_doe123", // Username
                "John Doe", // Name
                "555-1234", // Phone Number
                "john.doe@email.com", // Email
                "Male", // Gender
                "securePassword" // Password
        );

        new FormControllerPatient(modelPatient, viewPatient);

        // Controller controller = new Controller(modelDoctor, viewDoctor);
        // controller.initActionDoctor();

    }

}
