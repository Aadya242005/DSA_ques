package lec30;

public interface StackI {
    public void push();
    public int pop();
    public int peek();
    int x =90;
    //java 8
    static void f1(){
// static and default method ko body de skte h
    }
    default void f2(){

    }
    //java 9 
    private void name(){
// allowed private method body
    }
}




// package lec30;
// //khush
// public class Stack_Client {
//     public static void main(String[] args) {
//         Stack_Class s = new Stack_Class();
//     }
    
// }



// package lec30;

// public class Stack_Class implements StackI {
//     //vishal
//     @Override
//     public void push(int item){
//         //
//     }
    
//     @Override
//     public int pop(){ 
//       StackI.x+=3;
//      System.out.println(StackI.x);
//         return 0;
//     }

//     @Override
//     public final int peek(){
//         return 0;
//     }

// }