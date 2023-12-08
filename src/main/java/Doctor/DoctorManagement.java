package Doctor;

import DAO.*;

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

    protected ArrayList<Doctor> listExperience = new ArrayList<>();
    protected int numOfDoctor = 0;

    protected ArrayList<Doctor> listDoctorbyName = new ArrayList<>();
    DoctorDAO doctorDao = new DoctorDAO();

    ;

    public DoctorManagement() {
        listDoctor = doctorDao.restoreDataFromChar();
        numOfDoctor = listDoctor.size();
        

    }

    public boolean addDoctor(Doctor doctor) {
        Doctor temp = searchbyUserName(doctor.getUserName());
        if (temp != null) {
            listDoctor.add(doctor);
            numOfDoctor++;
            System.out.println("Added Succesfully");
            doctorDao.saveDataByChar(listDoctor);
            return true;

        }
        System.out.println("Counldnt add");
        return false;

    }

    public ArrayList<Doctor> getListDoctor() {
        return listDoctor;
    }

    public void setListDoctor(ArrayList<Doctor> manager) {
        this.listDoctor = manager;
    }

    public Doctor searchByName(String name) {
        for (int i = 0; i < numOfDoctor; i++) {
            Doctor temp = listDoctor.get(i);
            if (temp.getName().equalsIgnoreCase(name)) {
                return temp;
            }

        }
        return null;
    }

    public Doctor searchbyUserName(String username) {
        for (int i = 0; i < numOfDoctor; i++) {
            if (listDoctor.get(i).getUserName().equalsIgnoreCase(username)) {
                return listDoctor.get(i);
            }

        }
        return null;
    }

    public ArrayList<Doctor> searchByGender(String gender) {
        ArrayList<Doctor> listGender = new ArrayList<>();
        for (int i = 0; i < numOfDoctor; i++) {
            if (listDoctor.get(i).getGender().toLowerCase().equals(gender.toLowerCase())) {
                listGender.add(listDoctor.get(i));
            }

        }
        return listGender;
    }

    public ArrayList<Doctor> searchByMajor(String major) {
        ArrayList<Doctor> listMajor = new ArrayList<>();
        for (int i = 0; i < numOfDoctor; i++) {
            if (listDoctor.get(i).getMajor().toLowerCase().contains(major.toLowerCase())) {
                listMajor.add(listDoctor.get(i));
            }

        }
        return listMajor;
    }

    public ArrayList<Doctor> searchByStatus(String status) {
        ArrayList<Doctor> listStatus = new ArrayList<>();
        for (int i = 0; i < numOfDoctor; i++) {
            if (listDoctor.get(i).getIsAvailable().toLowerCase().equals(status.toLowerCase())) {
                listStatus.add(listDoctor.get(i));
            }

        }
        return listStatus;
    }

    public boolean editDoctor(Doctor doctor) {
        Doctor temp = doctor;
        if (searchbyUserName(temp.getUserName()) != null) {
            System.out.println("Successful");
            return true;
        } else {
            return false;
        }

    }

    public void a(Doctor doctor) {

        Doctor temp = searchbyUserName(doctor.getUserName());
        System.out.println(temp.getIsAvailable());

    }
}
