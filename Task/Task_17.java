// Task:- Create a program that shows bitwise "AND" of Two Operators 

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter First Number: ");
            int first = input.nextInt();
            System.out.print("Enter Second Number: ");
            int second = input.nextInt();

            int Result = (first & second);
            System.out.println("Result is: " + Result);
        }
    }
}
