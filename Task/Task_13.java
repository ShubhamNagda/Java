//Task :- take three inputes and check which number is greatest

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number");
            int first = sc.nextInt();
            System.out.print("Enter Second Number");
            int second = sc.nextInt();
            System.out.print("Enter Third Number");
            int third = sc.nextInt();

            // if (first > second) {
            //     if (first > third) {
            //         System.out.println("Greatest Number is: " + first);
            //     } else if (second < third) {
            //         System.out.println("Greatest Number is: " + third);

            //     } else {
            //         System.out.println("Greatest Number is: " + third);
            //     }
            // } else if (second > third) {
            //     System.out.println("Greatest Number is: " + second);
            // } else {
            //     System.out.println("Greatest Number is: " + third);
            // }


            //----------------------------------------------------------------------

            if (first >= second && first >= third){
                System.out.println("Greatest Number is: "+ first);
            }
            else if(second >= first && second >= third){
                System.out.println("Greatest Number is: "+ second); 
            }
            else{
                System.out.println("Greatest Number is: "+ third);
            }
        }
    }
}
