// Task :- Create a program to reverse digit of an number

import java.util.Scanner;

public class Task_32 {
    public static void main(String[] args) {
        int Num = ReadNum();
        PrintReverceNum(Num);
    }
    public static int ReadNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number");
        int Value = input.nextInt();
        return Value;
    }
    public static void PrintReverceNum(int X){
        while (X > 0) {
            int Temp = X;
            Temp = Temp % 10;
            X = X / 10;
            System.out.print(Temp);
        }
    }
}
