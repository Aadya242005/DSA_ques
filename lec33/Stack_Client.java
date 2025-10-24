package lec33;
public class Stack_Client{
    public static void main(String[] args) throws Exception { 
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        
        System.out.println(s.peek());
        s.Display();
        System.out.println(s.pop());
        s.push(50);
        s.Display();
        s.push(60);
       // s.push(70);

    }

}