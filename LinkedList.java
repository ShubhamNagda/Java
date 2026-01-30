public class LinkedList {
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    // add at first
    private Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node s = head;
        if (s == null) {
            System.out.println("No Elements: ");
            return;
        }

        while (s != null) {
            System.out.print(s.data);
            if (s.next != null) {
                System.out.print(" -> ");
            }
            s = s.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.printList();
        list.addFirst("A");
        list.printList();
        list.addFirst("B");
        list.printList();
        list.addFirst("C");
        list.printList();

    }
}
