public class Task_34 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.print("* ");
            int j = 0;

            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;

        }
        System.out.println();
        
        int k = 0;
        while (k < 5) {
            System.out.print("* ");
            k++;
            int l = 5;
            while (l > k) {
                System.out.print("* ");
                l--;
            }
            System.out.println();
        }

        System.out.println();

        int m = 0;
        while (m < 5) {
            System.out.print("* ");
            int n = 0;
            while (n < m) {
                System.out.print("* ");
                n++;
            }
            System.out.println();
            m++;
        }
    }
}
