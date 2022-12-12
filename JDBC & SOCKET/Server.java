
import java.io.DataInputStream;
import java.io.DataOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(22222);

            while (true) {
                Socket s = ss.accept();

                DataInputStream dis = new DataInputStream(s.getInputStream());
                String str = (String) dis.readUTF();
                System.out.println("Message = " + (String) str);

                //2 way
                DataOutputStream douts = new DataOutputStream(s.getOutputStream());
                Scanner input = new Scanner(System.in);
                String data = input.next();
                douts.writeUTF(data);

                // ss.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
