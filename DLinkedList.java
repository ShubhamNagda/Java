public class DLinkedList {
    public class Node {
        Node pre;
        int data;
        Node next;

        Node(int data) {
            this.pre = null;
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void AddAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        head.pre = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void printListNext() {
        Node i = head;
        while (i != null) {
            System.out.print(i.data);
            if (i.next != null) {
                System.out.print(" <-> ");
            }
            i = i.next;
        }
    }

    public void printListPre() {
        System.out.println();
        Node i = head;
        while (i.next != null) {
            i = i.next;
        }
        while (i != null) {
            System.out.print(i.data);
            if (i.pre != null) {
                System.out.print(" <-> ");
            }
            i = i.pre;
        }
    }

    public static void main(String[] args) {
        DLinkedList ll = new DLinkedList();
        ll.AddAtFirst(10);
        ll.AddAtFirst(15);
        ll.AddAtFirst(20);
        ll.AddAtFirst(25);

        ll.printListNext();
        ll.printListPre();
    }
}
