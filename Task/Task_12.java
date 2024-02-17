// Task :- check Number is even or odd

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.println("enter the Number");
            int num = input.nextInt();

            if (num%2==0){
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }
        }
    }
}
