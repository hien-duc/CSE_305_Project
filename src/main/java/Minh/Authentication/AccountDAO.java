package Minh.Authentication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Doctor.Doctor;
import Patient.Patient;

public class AccountDAO {
    protected static String rootPath = System.getProperty("user.dir");
    protected static String folderPath = rootPath + "\\Backup";
    protected static String patientPath = folderPath + "\\" + "Patient Account.csv";
    protected static String doctorPath = folderPath + "\\" + "Doctor Account.csv";

    public AccountDAO() {
        File folder = new File(folderPath);
        File file = new File(patientPath);
        File file1 = new File(doctorPath);

        if (!folder.exists()) {
            folder.mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
            }
        }
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException ex) {
            }
        }
    }

    public static ArrayList<Patient> restoreAccountPatient() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Patient> accountData = null;

        try {
            fis = new FileInputStream(patientPath);
            ois = new ObjectInputStream(fis);
            accountData = (ArrayList<Patient>) ois.readObject();

        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        } finally {

            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
            }
        }

        return accountData;
    }

    public static void saveAccountPatient(ArrayList<Patient> list) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(patientPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();

        } catch (IOException ex) {
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException ex) {
            }
        }
    }

    public static ArrayList<Doctor> restoreAccountDoctor() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Doctor> accountData = null;

        try {
            fis = new FileInputStream(doctorPath);
            ois = new ObjectInputStream(fis);
            accountData = (ArrayList<Doctor>) ois.readObject();

        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        } finally {

            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
            }
        }

        return accountData;
    }

    public static void saveAccountDoctor(ArrayList<Doctor> list) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(doctorPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();

        } catch (IOException ex) {
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException ex) {
            }
        }
    }

}
