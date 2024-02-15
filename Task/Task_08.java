// Task : Caculate Simple Interest

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        try ( Scanner sc = new Scanner(System.in)){
            System.out.print("Please Enter Principle balance: ");
            double P = sc.nextDouble();
            System.out.print("Please Enter Rate: ");
            double Rate = sc.nextDouble();
            System.out.print("Please Enter Time in Years: ");
            double Time = sc.nextDouble();
            
            double SI = (P*Rate*Time)/100;

            System.out.println("Interest Amount is " + SI);
        }
    }
}
