package Payment;

import java.util.ArrayList;
import DAO.PaymentDAO;

public class PaymentManagement {
	// Data members
	private PaymentDAO paymentDao = new PaymentDAO();
	private ArrayList<Payment> listPayment = paymentDao.restoreDataFromChar();
	private int numOfPayment = listPayment.size();

	// Constructors
	public PaymentManagement() {

	}

	// Methods
	public ArrayList<Payment> getListPatient() {
		return listPayment;
	}

	public void setListPatient(ArrayList<Payment> payment) {
		this.listPayment = payment;
		numOfPayment++;
	}

	public void addPayment(Payment payment) {
		listPayment.add(payment);
	}

}
