package DoctorModel;

//import javafx.scene.control.TitledPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DoctorModel_Menu {
    //Data members
    protected String icon;
    protected String name;
    protected MenuType type;
    
    //Constructors
    public DoctorModel_Menu(){
        
    }
    public DoctorModel_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }
    
    
    //Methods
    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
    
    public Icon toIcon(){
        return new ImageIcon(("src\\main\\java\\PateintIcon\\" + icon + ".png"));
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }
    
}
