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
        scan.close();
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i < num; i = i + 2) {
                if (num % i == 0) {
                    return false;
                }
            }

        }
        return true;
    }
}
