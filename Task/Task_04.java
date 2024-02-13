// Create a program to swap two numbers

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Eanter the value of a ");
            int a = sc.nextInt();
            System.out.print("Eanter the value of a ");

            int b = sc.nextInt();

            System.out.println("before swap a = " + a + " and b = " + b);
            int temp = a;
            a = b;
            b = temp;

            System.out.println("after swap a = " + a + " and b = " + b);
        }
    }
}
