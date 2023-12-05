package Duc.History;

import java.util.ArrayList;


public class HistoryManager {
  // Data members
  private HistoryDAO historyDao = new HistoryDAO();
  private ArrayList<History> listHistory = historyDao.restoreHistory();

  // Constructors
  public HistoryManager() {
    if (listHistory == null) {
      listHistory = new ArrayList<>();
    } else {
      listHistory = historyDao.restoreHistory();
    }
  }

  // Methods
  public void addHistory(History history) {
    listHistory.add(history);

  }

  public History searchByUserName(String userName) {
    for (int i = 0; i < listHistory.size(); i++) {
      History temp = listHistory.get(i);
      if (temp.getPatientName().equals(userName)) {
        return temp;
      }
    }
    return null;
  }

  // Getter and setter methods
  public ArrayList<History> getlistHistory() {
    return listHistory;
  }

  public void setlistHistory(ArrayList<History> listHistory) {
    this.listHistory = listHistory;
  }

  public void setListPatient(ArrayList<History> history) {
    this.listHistory = history;

  }

}
