// Task :- Persentage to Grade 

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter Your Percentage: ");
            float Percentage = input.nextFloat();

            if (Percentage >= 90){
                System.out.println("Your Grade is \"A\"");
            }
            else if (Percentage >= 75){
                System.out.println("Your Grade is \"B\"");
            }
            else if (Percentage >= 60){
                System.out.println("Your Grade is \"c\"");
            }
            else if (Percentage >= 30){
                System.out.println("Your Grade is \"D\"");
            }
            else {
                System.out.println("Your Grade is \"F\"");
            }
        }
    }
}
