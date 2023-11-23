import java.time.LocalDate;

public class Authentication {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        LocalDate date = LocalDate.now();
        String temp = date.toString();
        Patient patient = new Patient(temp, "patientpass", "John Doe",
                "+1234567890", "john@example.com", "Male", "1999", "Software Engineer", "Blue Cross");
        // User doctor = new Doctor("")
        manager.register(patient);
        System.out.println(manager.getPatients().get("john@example.com").getInsurance());
    }
}