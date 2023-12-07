package Project;

import Duc.Payment.Payment;
import Duc.Payment.PaymentDAO;
import Duc.Payment.PaymentManager;

public class Main {

	public static void main(String[] args) {

		PaymentDAO paymentDAO = new PaymentDAO();
		PaymentManager paymentManager = new PaymentManager();
		Payment payment = new Payment("Daniel Reed", "2800", "Rental Insurance", "PayPal",
				"2023-12-15", "11:55", "Stomach Flu", "Rest and Fluids", "Medical Evaluation");
		paymentManager.addPayment(payment);
		paymentDAO.savePayment(paymentManager.getListPayment());
		System.out.println(paymentManager.getListPayment().get(0).getInsurance());
		System.out.println(paymentManager.getListPayment().size());

		/*
		 * DoctorDAO doctorDAO = new DoctorDAO();
		 * DoctorManagement doctorManager = new DoctorManagement();
		 * Doctor doctor = new Doctor("1", "1", "Yes", "1", "1", "1", "1", "11", "1",
		 * "1", "1");
		 * doctorManager.addDoctor(doctor);
		 * doctorDAO.saveDataByChar(doctorManager.getListDoctor());
		 * 
		 * System.out.println(doctorDAO.restoreDataFromChar().get(1).getPhoneNumber());
		 */

	}
}
