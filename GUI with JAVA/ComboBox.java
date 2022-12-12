
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;

public class ComboBox extends Frame {

    ComboBox() {
        Panel p1 = new Panel();
        Panel p2 = new Panel();

        Label l1 = new Label("RadioButton");
        p1.add(l1);
        CheckboxGroup cg1 = new CheckboxGroup();
        p1.add(new Checkbox("4 Slices", cg1, true));
        p1.add(new Checkbox("8 Slices", cg1, true));
        
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        add(p1);

        Label l2 = new Label("CheckBoxes");
        p2.add(l2);
        Checkbox c1 = new Checkbox("Anchovies");
        Checkbox c2 = new Checkbox("GArlic");
        Choice cm =new Choice();
        cm.add("Bird");
        cm.add("Cat");
        cm.add("Dog");
        cm.add("Rabbit");
        cm.add("Cow");
        p2.add(c1);
        p2.add(c2);
        p2.add(cm);
        
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        add(p2);

        setLayout(new GridLayout(1, 1));
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
        ComboBox test = new ComboBox();
    }

}
