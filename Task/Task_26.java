// Task:- Create a program to add all odd number from 1 to given number

import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        int Add = ReadNum();
        PrintAddittion(Add);
    }
    public static int ReadNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number: ");
        int Value = input.nextInt();
        return Value;
    }
    public static void PrintAddittion(int X){
        int Sum = 0;
        int i = 1;
        while (i<=X) {
            Sum = Sum + i;
            i=i+2;
        }
        System.out.println("Number is: " + Sum);
    }
}
