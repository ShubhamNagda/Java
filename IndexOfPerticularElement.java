import java.util.Scanner;

public class IndexOfPerticularElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.print("Enter number to find: ");
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Element " + num + " is on index " + i);
                break;
            }
            if (i == arr.length - 1 && num != arr[i]) {
                System.out.println("Element " + num + " is not available on array ");
            }
        }
        sc.close();
    }
}
