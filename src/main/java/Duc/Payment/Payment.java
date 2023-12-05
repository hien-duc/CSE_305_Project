package Duc.Payment;

import java.io.Serializable;

public class Payment implements Serializable {

  private String username;
  private double money;
  private String insurance;
  private String method;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  private String date;
  private String time;

  public Payment(String userName, String money, String insurance, String method, String date, String time) {
    this.username = userName;
    this.money = Double.parseDouble(money);
    this.insurance = insurance;
    this.method = method;
    this.date = date;
    this.time = time;
  }

  public double calculateInsurance() {
    double insurance = 0;
    insurance = money * 0.15;
    return insurance;
  }

  public double calculateTotal() {
    double total = 0;
    total = money - calculateInsurance();
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
