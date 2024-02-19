//Task :- Categorise person into different age groups 
import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("ENter Your Age: ");
            int age = input.nextInt();

            if(age <= 13){
                System.out.println("You are Child");
            }
            else if(age <= 20){
                System.out.println("You are Teen");
            }
            else if(age <= 60){
                System.out.println("You are Adult");
            }
            else if(age >= 60){
                System.out.println("You are Senior");
            }
        }
    }
}
