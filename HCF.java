import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, s;
        System.out.print("Enter the first num: ");
        f = sc.nextInt();
        System.out.print("Enter the second num: ");
        s = sc.nextInt();
        int min = (f > s) ? s : f;
        System.out.println(min);
        for (int i = min; i >= 2; i--) {
            System.out.println(i);
            if (f % i == 0 && s % i == 0) {
                System.out.println("HCF or GCD of " + f + " " + s + " is " + i);
                break;
            }
        }

        sc.close();
    }
}
