package Duc.Payment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* import java.time.LocalDate;
import java.time.LocalTime; */
import java.util.ArrayList;

public class PaymentDAO {
	// file members
	private String rootPath = System.getProperty("user.dir");
	private String folderPath = rootPath + "\\Backup";
	private String filePath = folderPath + "\\" + "Payment.csv";
	private ArrayList<Payment> list = new ArrayList<Payment>();

	/*
	 * private String currentDate = LocalDate.now().toString();// get current date
	 * private String currentTime = LocalTime.now().toString();// get current time
	 */

	// Constructors
	public PaymentDAO() {
		File folder = new File(folderPath);
		File file = new File(filePath);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException ex) {
			}
		}
	}

	// Methods
	public void savePayment(ArrayList<Payment> list) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();

		} catch (IOException ex) {

		} finally {
			try {
				fos.close();
				oos.close();
			} catch (Exception ex) {

			}
		}
	}

	public ArrayList<Payment> restorePayment() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		ArrayList<Payment> paymentData = null;
		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			paymentData = (ArrayList<Payment>) ois.readObject();

		} catch (IOException ex) {

		} catch (ClassNotFoundException ex) {

		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {

				}
			}
		}
		return paymentData;
	}

	public ArrayList<Payment> getAllPayments() {
		return list;
	}
}
