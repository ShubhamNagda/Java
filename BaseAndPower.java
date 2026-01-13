import java.util.Scanner;

public class BaseAndPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int x = sc.nextInt();

        System.out.print("Enter Power: ");
        int y = sc.nextInt();

        int base = x;

        for (int i = y; i > 1; i--) {
            x *= base;
        }

        System.out.println(x);
        sc.close();
    }
}
