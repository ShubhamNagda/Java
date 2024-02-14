// area of triangle = 1/2*B*H
import java.util.Scanner;
public class Task_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Please Enter The Base Of Traiagle in cm ");
            double Base = sc.nextDouble();
            System.out.print("Please Enter The Height Of Traiagle cm");
            double Height = sc.nextDouble();

            double Area = (Base*Height)/2;
            System.out.println(Area + "cms");
        }
    }
}
