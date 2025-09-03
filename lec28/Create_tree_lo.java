package lec28;
import java.util.*;

public class Create_tree_lo {
    class Node {
        int val;
        Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    // Constructor
    public Create_tree_lo() {
        createTree();
    }

    // Build Tree Using Level Order Input
    private void createTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root value:");
        int e = sc.nextInt();
        root = new Node(e);

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node rv = q.poll();
            System.out.println("Enter left and right child of " + rv.val + " (-1 for no child):");
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            if (c1 != -1) {
                Node nn = new Node(c1);
                rv.left = nn;
                q.add(nn);
            }
            if (c2 != -1) {
                Node nn = new Node(c2);
                rv.right = nn;
                q.add(nn);
            }
        }
    }

    // Display the tree
    public void display() {
        display(root);
    }

    private void display(Node nn) {
        if (nn == null) return;

        String s = "";
        s += (nn.left != null ? nn.left.val : ".") + " <--" + nn.val + "--> " + (nn.right != null ? nn.right.val : ".");
        System.out.println(s);

        display(nn.left);
        display(nn.right);
    }

    public static void main(String[] args) {
        Create_tree_lo tree = new Create_tree_lo();
        tree.display();
    }
}
