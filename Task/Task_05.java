// Task :- Calculator
import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First Number");
            float first = sc.nextInt();
            System.out.print("Enter Second Number");
            float second = sc.nextInt();
            System.out.println("Subtraction is = " + (first-second));
            System.out.println("Addition is = " + (first+second));
            System.out.println("Multiplecation is = " + first*second);
            System.out.println("Division is = " + first/second);
            System.out.println("Modulues is = " + first%second);
        }
    }
}
