import java.util.Scanner;

public class swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter First Number: ");
        a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        b = sc.nextInt();
        System.out.println("before swap" + " a: " + a + " b: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("after swap " + " a: " + a + " b: " + b);

        sc.close();
    }
}
