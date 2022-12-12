

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
public class NumIncrement extends  Frame implements ActionListener{
    Button bt;
    TextField tf;
    int i=3;

    public NumIncrement() {
        
        bt=new Button("Ok");
        tf=new TextField("Hello Java Click 2");
        
        bt.setBounds(20, 40, 50, 40);
        tf.setBounds(100, 40, 150, 40);
        
        add(bt);
        add(tf);
        
        bt.addActionListener(this);
         setLayout(null);
        setSize(400, 400);
        setVisible(true);
       
        
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bt)) {
            tf.setText("Hello Java Click "+i++);
        }
    }
    
    public static void main(String[] args) {
        NumIncrement test =new NumIncrement();
    }
}
