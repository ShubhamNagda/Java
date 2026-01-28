import java.util.Scanner;

public class MaxHeap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers of elements: ");
        int n = scan.nextInt();
        int[] MaxHeap = new int[n];

        for (int i = 0; i < MaxHeap.length; i++) {
            System.out.print("Enter the element: ");
            MaxHeap[i] = scan.nextInt();

            int child = i;
            while (child > 0) {
                int parent = (child - 1) / 2;

                if (MaxHeap[child] > MaxHeap[parent]) {
                    int temp = MaxHeap[parent];
                    MaxHeap[parent] = MaxHeap[child];
                    MaxHeap[child] = temp;

                    child = parent;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < MaxHeap.length; i++) {
            System.out.print(MaxHeap[i] + ", ");
        }
        scan.close();
    }
}
