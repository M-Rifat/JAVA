
import java.util.Scanner;

public class IntegerToWord {

  
    public static void main(String[] args) {
        
           String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
     String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String word = new String();

        if (n == 0) {
            System.out.println("zero");
        }
        while (n > 0) {
            if (n < 20) {
                word += units[n];
                break;
            } else if (n < 100) {
                word += tens[n / 10] + " "; 
              n%=10;
            } else if (n < 1000) {
                word += units[n / 100] + " hundred" + " ";
                n%=100;
            } else if (n < 10000) {
                word += units[n / 1000] + " thousand" + " ";
                n%=1000;
            }

        }
        System.out.println(word);

    }

}
