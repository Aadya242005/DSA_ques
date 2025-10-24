// package lec34;
// import java.util.Stack;
// public class Queue_Reverse {
//     public static void main(String[] args) {
//         Queue  q = new Queue();
//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.enqueue(40);
//         q.enqueue(50);
//         q.Display();
//         Reverse(q);
//         q.Display();
//         System.out.println(q);
//         Reverse(q);
//         System.out.println(q);        
//     }
//     public static void Reverse(Queue q) throws Exception{
//         if(q.isEmpty()){
//             return;
//         }
//         int x = q.dequeue();
//         Reverse(q);
//         q.enqueue(x);

//     }
    
// }


package lec34;
import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int data) {
        list.addLast(data);
    }

    public int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void Display() {
        System.out.println(list);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class Queue_Reverse {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.print("Original Queue: ");
        q.Display();

        Reverse(q);
        System.out.print("Reversed Queue: ");
        q.Display();

        System.out.println("Using toString(): " + q);

        Reverse(q);
        System.out.println("Reversed again (original order): " + q);
    }

    public static void Reverse(Queue q) throws Exception {
        if (q.isEmpty()) {
            return;
        }
        int x = q.dequeue();
        Reverse(q);
        q.enqueue(x);
    }
}
