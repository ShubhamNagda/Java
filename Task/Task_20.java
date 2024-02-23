// Tassk:- Create a program that shows bitwise "COMPLIMENT/NOT" of Operators 

import java.util.Scanner;
public class Task_20 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter The NUmber Number: ");
            int compliment = input.nextInt();
            int Result = ~ compliment;

            System.out.print("Result is: "+ Result);
        }
    }
}

// COmpliment change bit into 1 -> 0 and 0->1 
