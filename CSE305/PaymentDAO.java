import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentDAO {
  // data members
  protected String rootPath = System.getProperty("user.dir");
  protected String folderPath = rootPath + "\\Patient Backup";
  protected String fileData = folderPath + "\\" + "PatientData.csv";

  // Constructors
  public PaymentDAO() {
    File folder = new File(folderPath);
    if (!folder.exists()) {
      folder.mkdirs();
    }

    File data = new File(folderPath + "\\" + fileData);
    if (!data.exists()) {
      try {
        data.createNewFile();
      } catch (IOException ex) {
        Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);

      }
    }
  }

  // Methods
  public void saveDataByChar(ArrayList<Payment> list) {
    FileWriter fw = null;
    BufferedWriter bw = null;

    try {
      fw = new FileWriter(folderPath + "\\" + fileData);
      bw = new BufferedWriter(fw);

      for (int i = 0; i < list.size(); i++) {
        Payment payment = list.get(i);
        double money = payment.getMoney();
        String method = payment.getMethod();
        String insurance = payment.getInsurance();

        String line = money + "," + method + "," + insurance;

        bw.write(line);
        bw.newLine();
      }
      bw.flush();
    } catch (IOException ex) {
      System.err.println(ex.getMessage());
    } finally {
      try {
        fw.close();
        bw.close();
      } catch (Exception ex) {
        System.err.println(ex.getMessage());
      }
    }
  }

  public ArrayList<Payment> restoreDataFromChar() {
    FileReader fr = null;
    BufferedReader br = new BufferedReader(fr);
    String[] temp = new String[10];
    String line = "";
    ArrayList<Payment> listPayments = new ArrayList<>();
    try {
      while ((line = br.readLine()) != null) {
        temp = line.split(",");
        Payment payment = new Payment(temp[0], temp[1], temp[2]);
        listPayments.add(payment);
      }
    } catch (IOException ex) {
      System.err.println(ex.getMessage());
    }
    return null;
  }
}
