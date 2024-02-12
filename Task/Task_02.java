// Task:- take input name of the person and respond with "Welcome Name  to my code"

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your Name ");
            String Name = sc.nextLine();
            System.out.print("Welcome " + Name + " to My Code");
        }
    }
}
