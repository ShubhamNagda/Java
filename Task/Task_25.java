//Task :- Create Program to Print Table of a Specific Number
import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        int Num = ReadNum();
        PrintTable(Num);
    }
    public static int ReadNum (){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int Value = input.nextInt();
            return Value;
    }
    public static void PrintTable(int Table){
        int i = 1;
        int X = Table;
        while (i <= 10) {
            System.out.println(X + " X " + i + " = " + Table);
            Table = Table+X;
            i++;
        }
    }
}
