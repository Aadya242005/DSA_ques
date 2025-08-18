/*
package lec5;

public class Fun_Demo {
    public static void main(String[] args) {
        System.out.println("Hello");
        Add();
        // int ans = Add();
       // Sysout.println(Add()); // This line is not needed as Add() does not return a value

    }
    public static int Add(){
        int a =8;
        int b = 7;
        int c = a+b;
        return c;

    }
    
}*/

package lec5;

public class Fun_Demo {
    public static void main(String[] args) {
        System.out.println("Hello");
        Add(); // Just calls the method — no result to return
    }

    public static void Add() {
        int a = 8;
        int b = 7;
        int c = a + b;
        System.out.println(c); // Directly prints 15
    }
}
