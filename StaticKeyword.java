public class StaticKeyword {
    // int num = 0; -> Not Valid for use in Static Method. non static without object
    // creation it is not initialized
    static int num = 10; // Valid Because Variable is Static. Varible is initialized without object
                         // creation.

    public static boolean NegativeOrNot() {
        if (num < 0) {
            return true;
        }
        return false;
    }

    // =====================================
    public static class DemoStatic {
        DemoStatic() { // 3
            System.out.println("Constructor: ");
        }

        static { // 1
            System.out.println("Static Block: ");
        }

        { // 1
            System.out.println("Block: ");
        }

        public void sayHello(String name) {
            System.out.println("Hello " + name + " Welcome ");
        }
    }

    public static void main(String[] args) {
        System.out.println(NegativeOrNot());
        DemoStatic s = new DemoStatic();

        s.sayHello("Shubham ");
    }

}
