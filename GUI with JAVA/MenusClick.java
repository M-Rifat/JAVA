

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
public class MenusClick extends Frame implements ActionListener{

    MenuBar mb;
    Menu m1, m2;
    MenuItem mt1, mt2;
    Label l;

    MenusClick() {

        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("Indian States");
        Menu m2 = new Menu("Indian Cities");
        MenuItem mt1 = new MenuItem("Himachal Pradesh");
        MenuItem mt2 = new MenuItem("Rajasthan");
        MenuItem mt3 = new MenuItem("West Bengal");
        MenuItem mt4 = new MenuItem("Andhra Pradesh");
        MenuItem mt5 = new MenuItem("Tamilnadu");
        MenuItem mt6 = new MenuItem("Karnatak");

        mb.add(m1);
        mb.add(m2);

        m1.add(mt1);
        m1.add(mt2);
        m1.add(mt3);
        m1.addSeparator();
        m1.add(mt4);
        m1.add(mt5);
        m1.add(mt6);
        m1.addActionListener(this);
        
        l=new Label();
        l.setBounds(150, 200, 200, 30);
        l.setForeground(Color.red);
        add(l);

        setMenuBar(mb);
        setLayout(null);
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        MenusClick test = new MenusClick();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText("Clicked "+e.getActionCommand());
    }

}
