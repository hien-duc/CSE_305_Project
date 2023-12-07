package Duc.Payment;

import java.util.ArrayList;

public class PaymentManager {
	// Data members
	private PaymentDAO paymentDao = new PaymentDAO();
	private ArrayList<Payment> listPayment = paymentDao.restorePayment();
	private ArrayList<Payment> listSearch = new ArrayList<Payment>();

	// Constructors
	public PaymentManager() {
		if (listPayment == null) {
			listPayment = new ArrayList<>();
		} else {
			listPayment = paymentDao.restorePayment();
		}
	}

	// Methods
	public void addPayment(Payment payment) {
		listPayment.add(payment);

	}

	public ArrayList<Payment> searchByUserName(String userName) {
		for (int i = 0; i < listPayment.size(); i++) {
			Payment temp = listPayment.get(i);
			if (temp.getUsername().equals(userName)) {
				listSearch.add(temp);
			}
		}
		return listSearch;
	}

	public Payment searchPayments(String userName) {
		for (int i = 0; i < listPayment.size(); i++) {
			Payment temp = listPayment.get(i);
			if (temp.getUsername().equals(userName)) {
				return temp;
			}
		}
		return null;
	}

	// Getter and setter methods
	public ArrayList<Payment> getListPayment() {
		return listPayment;
	}

	public void setListPayment(ArrayList<Payment> listPayment) {
		this.listPayment = listPayment;
	}

	public void setListPatient(ArrayList<Payment> payment) {
		this.listPayment = payment;

	}

}
