package lec38;

public class LinkedList_Client {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30); 
        ll.AddLast(40);
        //ll.AddIndex(-20,2);
        ll.AddLast(42);
        ll.AddLast(43);
        ll.AddLast(44);
        ll.AddLast(45);
        //System.out.println(ll.removeLast());
        ll.Display();
        System.out.println(ll.getfirst());
        ll.Display();

    }
}
