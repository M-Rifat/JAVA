
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.plaf.basic.DefaultMenuLayout;

/**
 *
 * @author user
 */
public class Layout extends Frame{
    
    Label l;
    TextField tf;
    Button bt;

    public Layout() {
        l=new Label("Label");
        tf=new TextField();
        bt=new Button("Send");
        
       // tf.setColumns(20);
        
        add(l);
        add(tf);
        add(bt);
                
       // setLayout(new FlowLayout());
        setLayout(new GridLayout());
        
        setSize(400, 400);
        setVisible(true);
        
                addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        Layout test =new Layout();
    }
    
}
