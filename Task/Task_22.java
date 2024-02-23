// Tassk:- Create a program that shows bitwise "Right Swift" of Operators 

import java.util.Scanner;
public class Task_22 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter The NUmber Number: ");
            int Num = input.nextInt();
            int Result =  Num >> 1;

            System.out.print("Result is: "+ Result);
        }
    }
}


