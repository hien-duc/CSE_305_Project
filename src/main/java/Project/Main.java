package Project;

import DAO.*;
import Doctor.Doctor;
import Doctor.DoctorManagement;

public class Main {

	public static void main(String[] args) {
		/*
		 * PaymentDAO paymentDAO = new PaymentDAO();
		 * PaymentManager paymentManager = new PaymentManager();
		 * Payment payment = new Payment("1", "1", "Yes", "1", "1", "1");
		 * paymentManager.addPayment(payment);
		 * paymentDAO.savePayment(paymentManager.getListPayment());
		 * System.out.println(paymentManager.getListPayment().get(0).getInsurance());
		 * System.out.println(paymentManager.getListPayment().size());
		 */

		DoctorDAO doctorDAO = new DoctorDAO();
		DoctorManagement doctorManager = new DoctorManagement();
		Doctor doctor = new Doctor("1", "1", "Yes", "1", "1", "1", "1", "11", "1", "1", "1");
		doctorManager.addDoctor(doctor);
		doctorDAO.saveDataByChar(doctorManager.getListDoctor());

		System.out.println(doctorDAO.restoreDataFromChar().get(1).getPhoneNumber());

	}
}
