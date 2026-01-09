import java.util.Scanner;

public class NPrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j = 1, i = 1;
        while (i <= 10) {
            if (isPrime(j)) {
                System.out.print(j + " ");
                i++;
            }
            j++;
        }
        System.out.println();
        scan.close();
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        return true;
    }
}
