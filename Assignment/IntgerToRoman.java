
import java.util.Scanner;

public class IntgerToRoman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] values = {10000,5000,1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanL = {"H","G","M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String showRoman = new String();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                showRoman = showRoman + romanL[i];
            }
        }
        System.out.println("Roman : " + showRoman);
    }

}
