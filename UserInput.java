import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name ");
        String Name = input.nextLine();
        System.out.println("Good Morning " + Name);


        System.out.print("Please Enter Your Age ");
        int age = input.nextInt();
        System.out.println("You are " + age + " Years old");
    }
}