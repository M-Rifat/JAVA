
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Client {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 22222);
            while (true) {
                DataOutputStream douts = new DataOutputStream(s.getOutputStream());
                Scanner input = new Scanner(System.in);
                String data = input.next();
                douts.writeUTF(data);
                //2 way
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String str = (String) dis.readUTF();
                System.out.println("Message = " + (String) str);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
