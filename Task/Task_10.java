// Task : Fahrenheit to celsius c = (f-32)*5/9

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        try ( Scanner input = new Scanner(System.in)){
            System.out.print("Enter Value In Fahrenheit: ");
            float Fahrenheit = input.nextFloat();
            float celsius = (Fahrenheit-32)*5/9;
            System.out.print("Celsius is : "+celsius);
        }
    }
}
