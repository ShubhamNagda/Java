// Task :- check year is leap year or not

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please Enter Year: ");
            int Year = input.nextInt();

            if (Year % 400 == 0) {
                System.out.println("Year is Leap Year");
            } else if (Year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            } else if (Year % 4 == 0) {
                System.out.println("Year is Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
    }
}
