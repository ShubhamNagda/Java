public class swap2 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("before swap a: " + a + " b: " + b);
        a += b;
        b = a - b;
        a = a - b;

        System.out.println("after swap a: " + a + " b: " + b);

    }
}
