
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
public class BGcolor extends Frame implements ActionListener {

    Button b1, b2;

    public BGcolor() {

        b1 = new Button("Red");
        b2 = new Button("Green");

        b1.setBounds(100, 50, 50, 30);
        b2.setBounds(200, 50, 50, 30);

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

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

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(b1)) {
            setBackground(Color.red);
        } else {
            setBackground(Color.green);
        }

    }

    public static void main(String[] args) {
        BGcolor test = new BGcolor();
    }

}
