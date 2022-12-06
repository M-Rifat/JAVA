
import java.util.Scanner;

public class IdentityMatrix {

    public static boolean isIdentity(int n, int A[][]) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] != 1 && A[j][i] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = input.nextInt();
            }
        }
        if (isIdentity(n, A)) {
            System.out.println("Identity");
        } else {
            System.out.println("NO");
        }
    }

}
