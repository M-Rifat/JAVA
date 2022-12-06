
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
class CharCheck {

    public String check(char ch) {
        if (ch == ' ') {
            return "space";
        } else if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "vowel";
            }
            return "consonant";

        } else if (ch >= '0' && ch <= '9') {
            return "numeric";
        }
        return "special";

    }
}

public class CharacterCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = 0, c = 0, n = 0, sp = 0;
        String s = input.nextLine();
        String sl = s.toLowerCase();
        CharCheck ck = new CharCheck();

        for (int i = 0; i < sl.length(); i++) {
            switch (ck.check(sl.charAt(i))) {
                case "vowel":
                    v++;
                    break;
                case "consonant":
                    c++;
                    break;
                case "numeric":
                    n++;
                    break;
                case "special":
                    sp++;
                    break;
                default:
                    break;
            }

        }
        System.out.println("Vowel : " + v);
        System.out.println("Consonant : " + c);
        System.out.println("Numeric : " + n);
        System.out.println("Special : " + sp);
    }

}
