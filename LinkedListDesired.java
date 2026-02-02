public class LinkedListDesired {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addAtDesired(int data, int position) {
        Node newNode = new Node(data);
        Node i = head;
        if (head == null) {
            head = newNode;
            return;
        }
        if (head.data == position) {
            newNode.next = head;
            head = newNode;
            return;
        }
        while (i != null) {
            if (i.next != null && i.next.data == position) {
                newNode.next = i.next;
                i.next = newNode;
                return;
            }
            i = i.next;
        }
    }

    public void printList() {
        Node i = head;
        while (i != null) {
            System.out.print(i.data);
            if (i.next != null) {
                System.out.print(" -> ");
            }
            i = i.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListDesired lld = new LinkedListDesired();
        lld.addAtDesired(1, 0);
        lld.printList();
        lld.addAtDesired(2, 1);
        lld.printList();
        lld.addAtDesired(3, 2);
        lld.printList();
        lld.addAtDesired(4, 1);
        lld.printList();
    }
}
