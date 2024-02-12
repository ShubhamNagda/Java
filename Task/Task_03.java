// Task:- Create a program to add two numbers

import java.util.Scanner;

public class Task_03 {
    public static void main(String [] args) {
       try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter First Number ");
        int first = sc.nextInt();
        System.out.print("Enter Second Number ");
        int second = sc.nextInt();
        System.out.println(first+second);
       }
    }
}
