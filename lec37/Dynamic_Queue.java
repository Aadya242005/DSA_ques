// package lec37;
// import lec33.Queue;

// public class Dynamic_Queue {
//     @Override
//     public void enqueue(int item){
//         if(isfull()){
//             int[] ar = new int[2* arr.length];
//             for(int i=0; i<arr.length; i++){
//                 int idx = (front + i) % arr.length;
//                 ar[i] = arr[idx];
//             }
//             arr=ar;
//             front=0;
//         }
//         super.enqueue(item);

//     }
//     public static void main(String[] args) {
//         Dynamic_Queue dq = new Dynamic_Queue();
//         dq.enqueue(10);
//         dq.enqueue(20);
//         dq.enqueue(30);                                
//         dq.enqueue(40);
//         System.out.println(dq.Dequeue());
//         System.out.println(dq.Dequeue());
//         dq.enqueue(50);
//         dq.enqueue(60);
//         dq.enqueue(70);
//         dq.enqueue(80);
//         dq.Display();
        
//     }
    
// }
