// Task : Product of two floating point Numbers

import java.util.Scanner;
public class Task_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First Number");
            double first = sc.nextDouble();
            System.out.print("Enter Second Number");
            double second = sc.nextDouble();

            System.out.println((first*second));
        }
    }
}
