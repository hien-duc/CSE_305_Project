
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class DoctorManagement {

    protected ArrayList<Doctor> listDoctor = new ArrayList<>();

    protected ArrayList<Doctor> listMajor = new ArrayList<>();
    protected ArrayList<Doctor> listExperience = new ArrayList<>();
    protected int numOfDoctor = 0;
    protected ArrayList<Doctor> listDoctorbyName = new ArrayList<>();

    public DoctorManagement() {
        DoctorDao doctorDao = new DoctorDao();

    }

    public boolean addDoctor(Doctor doctor) {
        Doctor temp = searchbyUserName(doctor.getUserName());
        if (temp != null) {
            listDoctor.add(doctor);
            numOfDoctor++;
            System.out.println("Added Succesfully");
            return true;

        }
        System.out.println("Counldnt add");
        return false;

    }

    public ArrayList<Doctor> getListDoctor() {
        return listDoctor;
    }

    public void setListPet(ArrayList<Doctor> manager) {
        this.listDoctor = manager;
    }

    public ArrayList<Doctor> searchByName(String name) {
        for (int i = 0; i < numOfDoctor; i++) {
            Doctor temp = listDoctor.get(i);
            if (temp.getName().equalsIgnoreCase(name)) {
                listDoctorbyName.add(temp);
            }

            return listDoctorbyName;

        }
        return null;
    }

    public Doctor searchbyUserName(String username) {
        for (int i = 0; i < numOfDoctor; i++) {
            if (listDoctor.get(i).getAge().equalsIgnoreCase(username)) {
                return listDoctor.get(i);
            }

        }
        return null;
    }

    public ArrayList<Doctor> searchByGender(String gender) {
        ArrayList<Doctor> listGender = new ArrayList<>();
        for (int i = 0; i < numOfDoctor; i++) {
            if (listDoctor.get(i).getGender().equalsIgnoreCase(gender)) {
                listGender.add(listDoctor.get(i));
            }

        }
        return listGender;
    }
}
