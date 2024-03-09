import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Input The Length of Array: ");
        int size = input.nextInt();
        int [] nums = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("please Enter element no " + (i+1) +": ");
            nums [i] = input.nextInt(); 
            i++;
        }
        return nums;

    }

    public static void displayArray(int [] tempArr){
        int i = 0;
        while (i < tempArr.length) {
            System.out.print(tempArr[i] + " ");
        i++;
        }
    }

        public static int[][] input2dArray(){
            Scanner input = new Scanner(System.in);
            System.out.print("Please Input The number of rows: ");
            int rows = input.nextInt();
            System.out.print("Please Input The number of columns: ");
            int col = input.nextInt();
            int [][] nums = new int[rows][col];
    
            int i = 0;
            while (i < rows) {
                int j = 0;
                while (j < col) {
                    System.out.print("please Enter element row: " + (i) +", column:"+ (j)+ ": ");
                    nums [i][j] = input.nextInt(); 
                    j++;
                }
                i++;
            }
            return nums;
    
        }
}
