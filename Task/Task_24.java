// Print Patterns Using Loop 
// *
// * *
// * * *
// * * * *
// * * * * * 

public class Task_24 {
    public static void main(String[] args) {
        PrintPattern();
    }

    public static void PrintPattern() {
        int rows = 0;
        while (rows < 10) {
            System.out.print("*");

            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println("");
            rows++;
        }
    }
}
