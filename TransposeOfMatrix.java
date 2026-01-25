import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;

        System.out.print("Enter the number of Rows: ");
        m = scan.nextInt();
        System.out.print("Enter the number of Columns: ");
        n = scan.nextInt();
        int arr[][] = new int[m][n];
        int transpose[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter Element for row " + i + " and column " + j + ": ");
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Normal Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
