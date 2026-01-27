public class A5 {
    public static class Obj {
        static int count = 0;
        {
            System.out.println("Object is created....");
            count++;
        }
        int id;
        String name;

        Obj(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "id: " + this.id + " name: " + this.name + " count: " + count;
        }

    }

    public static void main(String[] args) {
        Obj shubham = new Obj(1, "shubham");
        System.out.println(shubham);
        Obj umesh = new Obj(2, "umesh");
        System.out.println(umesh);
        Obj reetik = new Obj(3, "reetik");
        System.out.println(reetik);
        Obj krishna = new Obj(4, "krishna");
        System.out.println(krishna);
        Obj dipesh = new Obj(5, "dipesh");
        System.out.println(dipesh);

    }
}
