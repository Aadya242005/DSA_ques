// package lec37;

// public class Stack_Using_Queue {
//     private Dynamic_Queue Q;

//     public Stack_Using_Queue() {
//         Q = new Dynamic_Queue();
//     }

//     public int size() {
//         return Q.size();
//     }

//     public boolean Isempty() {   // keep your original method name
//         return Q.Isempty();      // matches your Dynamic_Queue
//     }

//     public void push(int item) throws Exception { // keep throws Exception
//         Q.enqueue(item);                          // lowercase enqueue
//     }

//     public int pop() {
//         Dynamic_Queue hlpQ = new Dynamic_Queue();
//         while (Q.size() > 1) {
//             hlpQ.enqueue(Q.dequeue());           // lowercase enqueue/dequeue
//         }
//         int rv = Q.dequeue();
//         while (hlpQ.size() > 0) {
//             Q.enqueue(hlpQ.dequeue());
//         }
//         return rv;
//     }

//     public int peek() {
//         Dynamic_Queue hlpQ = new Dynamic_Queue();
//         while (Q.size() > 1) {
//             hlpQ.enqueue(Q.dequeue());
//         }
//         int rv = Q.dequeue();
//         hlpQ.enqueue(rv);
//         while (hlpQ.size() > 0) {
//             Q.enqueue(hlpQ.dequeue());
//         }
//         return rv;
//     }

//     public static void main(String[] args) throws Exception {
//         Stack_Using_Queue s = new Stack_Using_Queue();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.peek());
//         System.out.println(s.peek());
//         System.out.println(s.size());
//         System.out.println(s.Isempty());
//     }
// }
