package Duc.History;

import java.util.ArrayList;

public class History {

  private String patientName;
  private String illness;
  private String medication;
  private String reports;

  public History(
      String patientName,
      String illness,
      String medication,
      String reports) {
    this.patientName = patientName;
    this.illness = illness;
    this.medication = medication;
    this.reports = reports;
  }

  public void editPreviousRecords(ArrayList<String> records) {
    patientName = records.get(0);
    illness = records.get(1);
    medication = records.get(2);
    reports = records.get(3);
  }

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public String getIllness() {
    return illness;
  }

  public void setIllness(String illness) {
    this.illness = illness;
  }

  public String getMedication() {
    return medication;
  }

  public void setMedication(String medication) {
    this.medication = medication;
  }

  public String getReports() {
    return reports;
  }

  public void setReports(String reports) {
    this.reports = reports;
  }
}
