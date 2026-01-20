public class reverseDigit {
    public static void main(String[] args) {
        int digit = 1234;
        int temp;
        int rd = 0;

        while (digit >= 0) {
            temp = digit % 10;
            rd += temp;
            digit /= 10;
            if (digit <= 0) {
                break;
            }
            rd *= 10;
        }
        System.out.println(rd);
    }
}
