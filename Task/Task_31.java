// Task :- Check NUmber is Prime NUmber Or Not
import java.util.Scanner;

public class Task_31 {
    public static void main(String[] args) {
        int Num = ReadNum();
        boolean Prime = PrintPrimeNumber(Num);
        if (Prime == true) {
            System.out.println("The Number is a Prime Number");
        }
        else{
            System.out.println("The Number is Not a Prime Number");
        }
    }
    public static int ReadNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number");
        int Value = input.nextInt();
        return Value;
    }
    public static boolean PrintPrimeNumber(int X){
        int i = 2;
        while (i < X) {
            if (X % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
