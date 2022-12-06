
import java.util.Scanner;

public class Triangular {

    public void displayUpperTriangle(int[][] matrix) {

        System.out.println("Upper triangular matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void displayLowerTriangle(int[][] matrix) {

        System.out.println("Lower triangular matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j > i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        Triangular t = new Triangular();
        t.displayUpperTriangle(matrix);
        t.displayLowerTriangle(matrix);
    }

}
