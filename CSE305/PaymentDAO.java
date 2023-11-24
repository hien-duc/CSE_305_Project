


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class PaymentDAO {
	// data members
	private String rootPath = System.getProperty("user.dir");
	private String folderPath = rootPath + "\\Backup";
	private String fileData = folderPath + "\\" + "PaymentData.csv";

	private LocalDate currentDate = LocalDate.now();// get current date
	private LocalTime currentTime = LocalTime.now();// get current time

	// Constructors
	public PaymentDAO() {
		File folder = new File(folderPath);
		File data = new File(fileData);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		if (!data.exists()) {
			try {
				data.createNewFile();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
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

				String line = money + "," + method + "," + insurance + "," + currentDate + "," + currentTime;

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
		ArrayList<Payment> listPayments = new ArrayList<>();
		try {
			FileReader fr = new FileReader(folderPath);
			BufferedReader br = new BufferedReader(fr);
			String[] temp = new String[5];
			String line = "";

			while ((line = br.readLine()) != null) {
				temp = line.split(",");
				Payment payment = new Payment(temp[0], temp[1], temp[2], temp[3], temp[4]);
				listPayments.add(payment);
			}
		} catch (IOException ex) {

		}
		return listPayments;
	}
}
