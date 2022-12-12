
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Close{
    
    Close(){
        Frame main=new JFrame("Master");
        Frame sub=new JFrame("Temporary");
        
                main.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
                        sub.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                sub.dispose();
            }
        });
        
        main.setSize(400, 400);
        sub.setSize(400, 400);
        main.setVisible(true);
        sub.setVisible(true);
        
//        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        sub.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
       Close test=new Close();
    }
    
}
