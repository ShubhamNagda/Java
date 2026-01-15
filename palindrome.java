import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0, digit = 0;
        while (num >= 0) {
            digit = num % 10;
            rev += digit;
            num /= 10;
            if (num <= 0) {
                break;
            }
            rev *= 10;
        }
        System.out.println(rev);
        if (rev == temp) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }
        sc.close();
    }
}
