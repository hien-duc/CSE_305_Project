package Duc.History;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class HistoryDAO {
  private String rootPath = System.getProperty("user.dir");
  private String folderPath = rootPath + "\\Backup";
  private String filePath = folderPath + "\\" + "History.csv";
  private ArrayList<History> list = new ArrayList<History>();

  // Constructors
  public HistoryDAO() {
    File folder = new File(folderPath);
    File file = new File(filePath);
    if (!folder.exists()) {
      folder.mkdirs();
    }

    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }

  // Methods
  public void saveHistory(ArrayList<History> list) {
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    try {
      fos = new FileOutputStream(filePath);
      oos = new ObjectOutputStream(fos);
      oos.writeObject(list);
      oos.flush();

    } catch (IOException ex) {

    } finally {
      try {
        fos.close();
        oos.close();
      } catch (Exception ex) {

      }
    }
  }

  public ArrayList<History> restoreHistory() {
    FileInputStream fis = null;
    ObjectInputStream ois = null;
    ArrayList<History> historyData = null;
    try {
      fis = new FileInputStream(filePath);
      ois = new ObjectInputStream(fis);
      historyData = (ArrayList<History>) ois.readObject();

    } catch (IOException ex) {

    } catch (ClassNotFoundException ex) {

    } finally {
      if (ois != null) {
        try {
          ois.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return historyData;
  }

  public ArrayList<History> getAllHistory() {
    return list;
  }
}
