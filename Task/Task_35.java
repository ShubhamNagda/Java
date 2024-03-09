//Task:- create a program to find the sum and average of all elements in an array

class Task_35 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average");
        int[] numArray = ArrayUtility.inputArray();
        long Add = sum(numArray);
        double average = avg(numArray);
        System.out.println("Sum of the numbers is: " + Add);
        System.out.println("Average of the numbers is: " + average);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double avg(int[] numArray) {
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}