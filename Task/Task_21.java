// Tassk:- Create a program that shows bitwise "Left Swift" of an Operator 

import java.util.Scanner;
public class Task_21 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter The NUmber Number: ");
            int Num = input.nextInt();
            int Result =  Num << 2;

            System.out.print("Result is: "+ Result);
        }
    }
}


