// Tassk:- Check NUmber Is Even or odd using bitwise operator

import java.util.Scanner;
public class Task_23 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter The NUmber Number: ");
            int Num = input.nextInt();
            if ((Num & 1) == 1){
                System.out.print("The Number is odd");
            }
            else{
                System.out.print("The Number is Even");
            }
        }
    }
}


