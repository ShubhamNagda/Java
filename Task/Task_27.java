//Task:- Create a Function to Cacukate Factorial of a given number

import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        long Fac = ReadValue();
        PrintFactorial(Fac);
    }
    public static long ReadValue(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        int Num = input.nextInt();
        return Num;
    }
    public static void PrintFactorial(long X){
        int i = 1;
        long Temp = 1;
        while (i<=X) {
            Temp *= i;
            i++;
        }
        System.out.println("Factorial of "+ X + " is: "+ Temp);
    }
}
