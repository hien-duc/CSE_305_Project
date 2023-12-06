package Minh;

import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import Doctor.Doctor;
import Minh.UI.FormRegister.ofDoctor;
import Minh.UI.FormRegister.ofPatient;
import Patient.Patient;
import java.awt.Font;

public class demoController {
    public static void main(String[] args) throws InterruptedException {

        // Install necessary libraries
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("crazypanel");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();

        // Configure a controller
        ofPatient viewPatient = new ofPatient();
        ofDoctor viewDoctor = new ofDoctor();

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

        FormController controller = new FormController(modelPatient, viewPatient);
        controller.initActionPatient();

        // Controller controller = new Controller(modelDoctor, viewDoctor);
        // controller.initActionDoctor();

    }

}
