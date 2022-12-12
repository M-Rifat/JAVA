
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Stack;

public class ClearUndo extends Frame implements ActionListener {

    TextField tx1;
    Button b1, b2;
    Label l;
    String val = new String();
    Stack<String> s = new Stack<String>();

    public ClearUndo() {
        l=new Label("TextField : ");
        l.setBounds(100, 80, 200, 20);
        tx1 = new TextField();
        tx1.setBounds(100, 100, 200, 40);

        b1 = new Button("Clear");
        b1.setBounds(100, 150, 80, 50);
        b1.addActionListener(this);

        b2 = new Button("Undo");
        b2.setBounds(200, 150, 80, 50);
        b2.addActionListener(this);

        add(l);
        add(tx1);
        add(b1);
        add(b2);

        setTitle("Editor");
        setLayout(null);
        setSize(500, 400);
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
            val = tx1.getText();
            if (val != "") {
                s.push(val);
            }
            tx1.setText("");
        } else if (e.getSource().equals(b2)) {
            String sss = new String("");
            if (!s.isEmpty()) {
                sss = s.peek();
                s.pop();
            }
            tx1.setText(sss);
        }

    }

    public static void main(String[] args) {
        ClearUndo clearUndo = new ClearUndo();
    }
}
