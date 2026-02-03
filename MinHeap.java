import java.util.Scanner;

public class MinHeap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers of elements: ");
        int n = scan.nextInt();
        int[] minHeap = new int[n];

        for (int i = 0; i < minHeap.length; i++) {
            System.out.print("Enter the element: ");
            minHeap[i] = scan.nextInt();

            int child = i;
            while (child > 0) {
                int parent = (child - 1) / 2;

                if (minHeap[child] < minHeap[parent]) {
                    int temp = minHeap[parent];
                    minHeap[parent] = minHeap[child];
                    minHeap[child] = temp;

                    child = parent;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < minHeap.length; i++) {
            System.out.print(minHeap[i] + ", ");
        }
        scan.close();
    }
}
