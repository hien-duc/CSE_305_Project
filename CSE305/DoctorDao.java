package projectgroup_cse305;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DoctorDao {

    //Data members
    protected String folderPath = "";
    protected String FileData = "";

    //Constructor
    public DoctorDao() {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File fileData = new File(folderPath + "\\" + FileData);
        if (!fileData.exists()) {
            try {
                fileData.createNewFile();
            } catch (Exception e) {
                System.out.println("File couldnt create");
            }
        }
    }

    public void saveDataByChar(ArrayList<Doctor> list) {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(folderPath + "\\" + FileData);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                Doctor temp = list.get(i);
                String name = temp.getName();
                String userName = temp.getUserName();
                String age = temp.getAge();
                String gender = temp.getGender();
                String email = temp.getEmail();
                String qualification = temp.getQualification();
                String major = temp.getMajor();
                String phoneNumber = temp.getPhoneNumber();
                String experience = temp.getExperience();
                String isAvailable = temp.getIsAvailable();
                String password = temp.getPassword();

                String line = age + "," + qualification + "," + major + "," + experience + "," + isAvailable + "," + userName + "," + name + "," + phoneNumber + "," + email + "," + gender + "," + password;

                bw.write(line);
                bw.newLine();

            }
            bw.flush();

        } catch (Exception ex) {

        } finally {
            try {
                fw.close();
                bw.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ArrayList<Doctor> restoreDataFromChar() {
        FileReader fr = null;
        BufferedReader br = null;
        String[] temp = new String[13];
        ArrayList<Doctor> list1 = new ArrayList<>();
        try {
            fr = new FileReader(folderPath + "\\" + FileData);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {

                temp = line.split(",");

                Doctor doctor = new Doctor(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9], temp[10]);

                list1.add(doctor);
            }
            return list1;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

}
