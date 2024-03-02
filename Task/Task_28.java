//Task :- Create a Program To Calculate Sum of Digits of a Number

import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        int Value = ReadNum();
        PrintSum(Value);
    }
    public static int ReadNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number");
        int Value = input.nextInt();
        return Value;
    }
    public static void PrintSum(int X){
        int Solution = 0;
        while (X > 0) {
            Solution = Solution +(X % 10);
            X = X / 10;
        }
        System.out.println("Solution is: "+ Solution);
    }
}
