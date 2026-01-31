public class LinkedListLastP {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;
            return;
        }
        Node i;
        i = head;
        while (i != null) {
            if (i.next == null) {
                i.next = newNode;
                return;
            }
            i = i.next;
        }
    }

    public void printList() {
        Node i;
        i = head;
        while (i != null) {
            System.out.print(i.data);
            if (i.next != null) {
                System.out.print(" -> ");
            }
            i = i.next;
        }
    }

    public static void main(String[] args) {
        LinkedListLastP ll = new LinkedListLastP();
        ll.addAtLast(0);
        // ll.printList();
        ll.addAtLast(1);
        // ll.printList();
        ll.addAtLast(2);
        ll.printList();
    }
}
