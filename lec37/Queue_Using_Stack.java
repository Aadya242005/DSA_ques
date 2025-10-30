// package lec37;
// import java.util.Stack;
// public class Queue_Using_Stack {
//     private Stack<Integer> st;
//     public Queue_Using_Stack(){ 
//         st = new Stack<>();  
//     }
//     public int size(){
//         return st.size();

//     }
//     public boolean Isempty(){
//         return st.isEmpty();
//     }
//     public void Enqueue(int item){
//         Stack<Integer> hlps = new Stack<>();
//         while(st.size()>0){
//             hlps.push(st.pop());
//         }   
//         st.push(item);
//         while(hlps.size()>0){
//             st.push(hlps.pop());
//         }
//     } 
//     public int Dequeue(){
//         return st.pop();
//     }
//     public int Getfront(){
//         return st.peek();
//     }
//     public static void main(String[] args) {
//         Queue_Using_Stack q = new Queue_Using_Stack();
//         q.Enqueue(10);
//         q.Enqueue(20);
//         q.Enqueue(30);
//         System.out.println(q.Getfront());
//         System.out.println(q.Dequeue());
//         System.out.println(q.Getfront());
//         System.out.println(q.size());
//     }
// }
