package Minh.Form.Main;

import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import Doctor.Doctor;
import Minh.Form.Controller.FormControllerDoctor;
import Minh.Form.Model.OfDoctor;

import java.awt.Font;

public class TestMainDoctor {

    public static void main(String[] args) {
        // Install necessary libraries
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("crazypanel");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();

        // Configure a controller
        OfDoctor viewDoctor = new OfDoctor();

        Doctor modelDoctor = new Doctor(
                "35", // Age
                "MD", // Qualification
                "Cardiology", // Major
                "10 years", // Experience
                "Yes", // Is Available
                "dr_smith123", // Username
                "Dr. Smith", // Name
                "555-5678", // Phone Number
                "dr.smith@email.com", // Email
                "Male", // Gender
                "securePassword" // Password
        );
        new FormControllerDoctor(modelDoctor, viewDoctor);
        
    }
}