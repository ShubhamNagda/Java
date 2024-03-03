// Task :- Create a program to find last common Multiple (LCM)
import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        int first = ReadNum();
        int second = ReadNum();
        LCM(first, second);
    }
    public static int ReadNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number");
        int Value = input.nextInt();
        return Value;
    }
    public static void LCM(int X, int Y){
        int i = 2;
        while (i<=(X*Y)) {
            if (i % X == 0 && i % Y == 0){
                System.out.println("Number is " + i);
                i = X*Y;
            }
            i++;
        }
    }
}
