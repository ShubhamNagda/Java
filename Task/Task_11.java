// Task : Check number is positive or negative or zero

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Please Enter the number: ");
            float num = sc.nextFloat();

            if (num == 0){
                System.out.println("Zero");
            }
            else if (num < 0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Positive");
            }
        }
    }
}
