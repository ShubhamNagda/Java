// Task : Calculate Compound Interest 

import java.util.Scanner;
public class Task_09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Please Enter Principle amount");
            double Principle = sc.nextDouble();
            System.out.print("Please Enter Interest rate");
            double Interest = sc.nextDouble();
            System.out.print("Please Enter Time in Years");
            double Time = sc.nextDouble();

            double Final_Amount = Principle * Math.pow((1+Interest/100),Time);

            System.out.println("amount is " + Final_Amount);
        }
    }
}
