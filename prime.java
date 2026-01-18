import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean is_prime = true;

        if (num == 1) {
            System.out.println(num + " is not prime number");
            is_prime = false;
        }
        if (num == 2) {
            System.out.println(num + " is prime number");
            is_prime = true;
        } else {
            for (int i = 3; i < num; i = i + 2) {
                System.out.println(i);
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                System.out.println(num + " is prime number");

            }
        }

        sc.close();
    }
}
