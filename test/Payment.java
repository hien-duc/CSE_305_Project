/**
 * Payment
 */
public class Payment {

  private double money;
  private boolean insurance;
  private String method;
  String temp;

  public Payment(double money, boolean insurance, String method) {
    this.money = money;
    this.insurance = insurance;
    this.method = method;
  }

  public double calculateBill() {
    double bill = 0;
    if (insurance) {
      bill = money * 0.30;
    } else {
      bill = money;
    }
    return bill;
  }

  public double calculateTax() {
    double tax = 0;
    return tax;

  }

  public double calculateTotal() {
    double total = 0;
    total = calculateBill() - calculateTax();
    return total;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public boolean isInsurance() {
    return insurance;
  }

  public void setInsurance(boolean insurance) {
    this.insurance = insurance;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getTemp() {
    return temp;
  }

  public void setTemp(String temp) {
    this.temp = temp;
  }
}
