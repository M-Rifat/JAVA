
import java.util.Scanner;



/**
 *
 * @author GIGABYTE
 */
class CheckClass{
     boolean CheckPalindrome(int n){
         int temp=n,result=0;
         while (temp>0){
             result=result*10+temp%10;
             temp=temp/10;
         }
         return result==n;
     }
}

public class Palindrome {
    
    public static void main(String[] args) {
        CheckClass ck=new CheckClass();
        for (int i = 1; i < 9999999; i++) {
            if (ck.CheckPalindrome(i)) {              
            System.out.println(i);
            }
        }
    }
}
