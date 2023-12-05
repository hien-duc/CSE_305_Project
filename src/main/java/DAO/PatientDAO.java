package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Patient.Patient;

public class PatientDAO {

	// data members
	private String rootPath = System.getProperty("user.dir");
	private String folderPath = rootPath + "\\Backup";
	private String fileData = folderPath + "\\" + "PatientData.csv";

	// Constructors
	public PatientDAO() {
		File folder = new File(folderPath);
		File data = new File(fileData);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		if (!data.exists()) {
			try {
				data.createNewFile();
			} catch (IOException ex) {
				Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);

			}
		}
	}

	// Methods
	public void saveDataByChar(ArrayList<Patient> list) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(fileData);
			bw = new BufferedWriter(fw);

			for (int i = 0; i < list.size(); i++) {
				Patient patient = list.get(i);
				String userName = patient.getUserName();
				String name = patient.getName();
				String phoneNumber = patient.getPhoneNumber();
				String email = patient.getEmail();
				String dOB = patient.getdOB();
				String job = patient.getJob();
				String gender = patient.getGender();
				String insurance = patient.getInsurance();
				String password = patient.getPassword();
				String height = patient.getHeight();
				String weight = patient.getWeight();
				String bloodType = patient.getBloodType();

				String line = dOB + "," + job + "," + insurance + "," + height + "," + weight + "," + bloodType + ","
						+ userName + "," + name + "," + phoneNumber + ","
						+ email + "," + gender + "," + password;

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

	public ArrayList<Patient> restoreDataFromChar() {
		FileReader fr = null;
		BufferedReader br = null;
		String[] temp = new String[14];
		ArrayList<Patient> listPatient = new ArrayList<>();
		try {
			fr = new FileReader(fileData);
			br = new BufferedReader(fr);
			String line = "";

			while ((line = br.readLine()) != null) {
				temp = line.split(",");

				Patient patient = new Patient(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7],
						temp[8], temp[9], temp[10], temp[11]);
				listPatient.add(patient);
			}
			return listPatient;
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
		return null;
	}
}
