import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        int R[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element for row " + i + " and column " + j + " :");
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for row " + i + " and column " + j + " :");
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                R[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("B");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("Result");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(R[i][j] + "   ");
            }
            System.out.println();
        }

        sc.close();
    }
}
