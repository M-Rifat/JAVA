
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
 * @author Mobinul Islam
 */
public class Calculator extends Frame implements ActionListener {
    
    TextField tf1, tf2, tf3;
    Button b1, b2, b3, b4;
    Label l1, l2, l3;
    
    Calculator() {
        l1 = new Label("Enter First Number :");
        l1.setBounds(50, 60, 200, 20);
        tf1 = new TextField();
        tf1.setBounds(50, 80, 200, 30);
        l2 = new Label("Enter Second Number :");
        l2.setBounds(50, 120, 200, 20);
        tf2 = new TextField();
        tf2.setBounds(50, 140, 200, 30);
        b1 = new Button(" + ");
        b1.setBounds(60, 190, 80, 40);
        b2 = new Button(" - ");
        b2.setBounds(150, 190, 80, 40);
        b3 = new Button(" x ");
        b3.setBounds(60, 250, 80, 40);
        b4 = new Button(" / ");
        b4.setBounds(150, 250, 80, 40);
        l3 = new Label("Result :");
        l3.setBounds(280, 75, 50, 20);
        tf3 = new TextField("");
        tf3.setBounds(280, 95, 100, 50);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        add(tf3);
        
        b4.addActionListener((ActionEvent e) -> {
            double a = Integer.parseInt(tf1.getText());
            double b = Integer.parseInt(tf2.getText());
            double r = a / b;
            tf3.setText(String.valueOf(String.format("%4f", r)));
        });
        
        setTitle("Calculator");
        setSize(500, 400);
        setLayout(null);
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
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        } else if (e.getSource() == b3) {
            c = a * b;
        }
        
        tf3.setText(String.valueOf(c));
        
    }
    
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
    }
    
}
