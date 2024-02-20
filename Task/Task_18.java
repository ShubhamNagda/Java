// Tassk:- Create a program that shows bitwise "OR" of Two Operators 

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter First Number: ");
            int first = input.nextInt();
            System.out.print("Enter Second Number: ");
            int second = input.nextInt();

            int Result = first | second;

            System.out.print("Result is: "+Result);
        }
    }
}
