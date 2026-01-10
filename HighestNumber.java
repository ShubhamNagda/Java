import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        if (f > s && f > t) {
            System.out.println("First is highest number");
        } else if (s > f && s > t) {
            System.out.println("Second is highest number");
        } else if (t > f && t > s) {
            System.out.println("Third is highest number");
        }
        sc.close();
    }

}
