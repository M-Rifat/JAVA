
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
public class Temperature extends Frame implements ActionListener{

    Label l1, l2;
    TextField tf1, tf2;
    Button bt;

    public Temperature() {
        l1 = new Label("Enter Fahrenheit Temperature: ");
        l1.setBounds(30, 60, 200, 20);
        l2 = new Label("Temperature in Celcius: ");
        l2.setBounds(30, 120, 200, 20);
        add(l1);
        add(l2);

        tf1 = new TextField();
        tf1.setBounds(230, 60, 100, 20);
        tf2 = new TextField();
        tf2.setBounds(230, 120, 100, 20);
        add(tf1);
        add(tf2);

        bt = new Button("Convert");
        bt.setBounds(170, 200, 50, 20);
        add(bt);
        bt.addActionListener(this);

        setLayout(null);
        setTitle("Fahrenheit to Celcius Converter ");
        setSize(500, 500);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float v=Integer.parseInt(tf1.getText());
        float r=((v-32)/9)*5;
        tf2.setText(String.valueOf(r));
    }
    
        public static void main(String[] args) {
        Temperature test = new Temperature();
    }

}
