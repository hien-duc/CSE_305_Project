package DoctorSwing;

import DoctorModel.DoctorModel_Menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import DoctorEvent.DoctorEventMenuSelected;

public class DoctorList_Menu<E extends Object> extends JList<E> {

    //Data members
    protected final DefaultListModel model;
    protected int selectedIndex = -1;
    protected int overIndex = -1;
    private DoctorEventMenuSelected event;

    //Constructors
    public void addEventMenuSelected(DoctorEventMenuSelected event) {
        this.event = event;
        
    }

    public DoctorList_Menu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof DoctorModel_Menu) {
                        DoctorModel_Menu menu = (DoctorModel_Menu) o;
                        if (menu.getType() == DoctorModel_Menu.MenuType.MENU) {
                            selectedIndex = index;
                            if(event!=null){
                                event.selected(index);
                            }

                        }
                    } else {
                        selectedIndex = index;

                    }
                    repaint();
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                overIndex = -1;
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                int index = locationToIndex(me.getPoint());
                if (index != overIndex) {
                    Object o = model.getElementAt(index);
                    if (o instanceof DoctorModel_Menu) {
                        DoctorModel_Menu menu = (DoctorModel_Menu) o;
                        if (menu.getType() == DoctorModel_Menu.MenuType.MENU) {
                            overIndex = index;
                        } else {
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }
        });

    }

    //Methods
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                DoctorModel_Menu data;
                if (o instanceof DoctorModel_Menu) {
                    data = (DoctorModel_Menu) o;
                } else {
                    data = new DoctorModel_Menu("", o + "", DoctorModel_Menu.MenuType.EMPTY);
                }
                DoctorMenuItem item = new DoctorMenuItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }

        };
    }

    public void addItem(DoctorModel_Menu data) {
        model.addElement(data);
    }

}
