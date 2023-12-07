package DAO;

import Booking.Booking;
import Doctor.Doctor;
import Doctor.DoctorManagement;
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
import java.text.SimpleDateFormat;

public class BookingDAO {

    // data members
    private String rootPath = System.getProperty("user.dir");
    private String folderPath = rootPath + "\\Backup";
    private String fileData = folderPath + "\\" + "BookingData.csv";
    private DoctorDAO doctorDao = new DoctorDAO();
    private DoctorManagement doctorManagement = new DoctorManagement();

    // Constructors
    public BookingDAO() {
        doctorManagement.setListDoctor(doctorDao.restoreDataFromChar());

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
    public void saveDataByChar(ArrayList<Booking> list) {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(fileData);
            bw = new BufferedWriter(fw);

            for (Booking booking : list) {
                String bookingData = convertBookingToString(booking);
                bw.write(bookingData);
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

    public ArrayList<Booking> restoreDataFromChar() {
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<Booking> listBooking = new ArrayList<>();
        try {
            fr = new FileReader(fileData);
            br = new BufferedReader(fr);
            String line = "";

            while ((line = br.readLine()) != null) {
                Booking booking = convertStringToBooking(line);
                if (booking != null) {
                    listBooking.add(booking);
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return listBooking;
    }

    public static String convertBookingToString(Booking booking) {
        String doctorName = booking.getDoctor().getName();
        String patientName = booking.getPatientName();
        String contactNumber = booking.getContact();
        String patientGender = booking.getPatientGender();
        String patientAge = booking.getPatientAge();
        String patientProblem = booking.getPatientProblem();

        return String.format("%s,%s,%s,%s,%s,%s",
                doctorName, patientName, contactNumber,
                patientGender, patientAge, patientProblem);
    }

    public  Booking convertStringToBooking(String data) {
        try {
            String[] parts = data.split(",");
            String doctorName = parts[0];
            String patientName = parts[1];
            String contactNumber = parts[2];
            String patientGender = parts[3];
            String patientAge = parts[4];
            String patientProblem = parts[5];

            Doctor doctor = doctorManagement.searchByName(doctorName);

            return new Booking(doctor, patientName, contactNumber,
                    patientGender, patientAge, patientProblem);
        } catch (Exception e) {
            e.printStackTrace(); // Handle parsing errors appropriately
            return null;
        }
    }

}
