// Task :- Create a program to Print Fibonacci Series up to cirten number

import java.util.Scanner;

public class Task_33 {
    public static void main(String[] args) {
        int Num = ReadNum();
        PrintFibonacci(Num);
    }
    public static int ReadNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number");
        int Value = input.nextInt();
        return Value;
    }
    public static void PrintFibonacci(int Get){
        if (Get < 0) return;
        System.out.println("0 ");
        if (Get == 0) return;
        System.out.println("1 ");
        int first = 0 , second = 1;
        while(first + second < Get){
            int temp = first + second;
            System.out.println(temp);
            first = second;
            second = temp;
        }

    }
}
