public class BinarySearchTree {
    public class Node {
        Node left;
        int data;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    Node root;

    public void addElements(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node i = root;
        while (true) {
            if (i.data > newNode.data) {
                if (i.left == null) {
                    i.left = newNode;
                    return;
                }
                i = i.left;
                continue;
            } else if (i.data <= newNode.data) {
                if (i.right == null) {
                    i.right = newNode;
                    return;
                }
                i = i.right;
            }
        }
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");

    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();

        BST.addElements(3);
        BST.addElements(4);
        BST.addElements(3);
        BST.addElements(1);
        BST.addElements(2);
        BST.inorder(BST.root);
        System.out.println();
        BST.postorder(BST.root);
        System.out.println();
        BST.preorder(BST.root);
    }
}
