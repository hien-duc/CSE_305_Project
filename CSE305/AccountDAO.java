
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AccountDAO {
    private String rootPath = System.getProperty("user.dir");
    private String folderPath = rootPath + "\\CSE305_Lab";
    private String filePath = folderPath + "\\" + "Account.txt";
    private ArrayList<Authentication> list = new ArrayList<Authentication>();

    public AccountDAO() {
        File folder = new File(folderPath);
        File file = new File(filePath);

        if (!folder.exists()) {
            folder.mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
            }
        }
    }

    public ArrayList<Authentication> restoreContractList() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Authentication> accountData = null;

        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            accountData = (ArrayList<Authentication>) ois.readObject();

        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        } finally {

            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
            }
        }

        return accountData;
    }

    public void saveAccountAsByte(ArrayList<Authentication> list) {
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
            } catch (IOException ex) {
            }
        }
    }

    public ArrayList<Authentication> getAllContract() {
        return list;
    }
}
