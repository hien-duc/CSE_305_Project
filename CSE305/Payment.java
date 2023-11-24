
public class Payment {

  private double money;
  private String insurance;
  private String method;
  private String date;
  private String time;

  public Payment(String money, String insurance, String method, String date, String time) {
    this.money = Double.parseDouble(money);
    this.insurance = insurance;
    this.method = method;
    this.date = date;
    this.time = time;
  }

  public Payment() {
  }

  public double calculateBill() {
    double bill = 0;
    if (insurance.equals("true")) {
      bill = money * 0.3;
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

  public String getInsurance() {
    return insurance;
  }

  public void setInsurance(String insurance) {
    this.insurance = insurance;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
