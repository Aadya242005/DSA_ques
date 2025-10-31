package lec40;

public class Cycle_removal {
    class Node {
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void AddFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void AddLast(int item) {
        if (size == 0) {
            AddFirst(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void Display() {
        Node temp = head;
        int count = 0; // safety counter to prevent infinite loops
        while (temp != null && count < size) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
            count++;
        }
        System.out.println(".");
    }

    private Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Invalid index: " + k);
        }
        Node temp = head;
        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void CreateCycle() throws Exception {
        Node nn = GetNode(2);
        tail.next = nn;
    }

    public void CycleRemove() {
        Node meet = hasCycle();
        if (meet == null) return;

        Node start = head;
        while (start != null) {
            Node temp = meet;
            while (temp.next != meet) {
                if (temp.next == start) {
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            }
            start = start.next;
        }
    }

    public void CycleRemove2() {
        Node meet = hasCycle();
        if (meet == null) return;

        int count = 1;
        Node temp = meet;
        while (temp.next != meet) {
            count++;
            temp = temp.next;
        }

        Node fast = head;
        for (int i = 0; i < count; i++) {
            fast = fast.next;
        }
        Node slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public Node hasCycle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return slow;
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        Cycle_removal cy = new Cycle_removal();
        cy.AddLast(1);
        cy.AddLast(2);
        cy.AddLast(3);
        cy.AddLast(4);
        cy.AddLast(5);
        cy.AddLast(6);
        cy.AddLast(7);
        cy.AddLast(8);
        cy.CreateCycle();

        // Remove cycle before display
        cy.CycleRemove2();
        cy.Display();
    }
}
