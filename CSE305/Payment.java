/**
 * Payment
 */
public class Payment {

  private double money;
  private String insurance;
  private String method;
  String temp;

  public Payment(String money, String insurance, String method) {
    this.money = Double.parseDouble(money);
    this.insurance = insurance;
    this.method = method;
  }

  public Payment() {
  }

  public double calculateBill() {
    double bill = 0;
    if (insurance.equals("true")) {
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

  public String getInsurance() {
    return insurance;
  }

  public void setInsurance(String insurance) {
    this.insurance = insurance;
  }
}
