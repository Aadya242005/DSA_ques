package lec35;
public class Client{
    public static void main(String[] args) {
        // case 1
        // P obj = new P();   //child access not bcz it is parent class 
        // System.out.println(obj.d);
        // System.out.println(obj.d2);
        // obj.fun();
        // obj.fun2();
        // case 2
       // ...................................................................................
        // P obj = new C();
        // System.out.println(obj.d); // P kans 
        // System.out.println(obj.d2); // 20
        // System.out.println(((C)(obj)).d1);  // suit voot phn kr  
        // obj.fun(); //C k ans  isme pehle obj jisKA H USKA =chlega 
        // obj.fun2();
        // ((C)(obj)).fun1(); // C k ans
        //........................................................................
        // case 3   
        // C obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d2);
        // System.out.println(obj.d1);
        // NOt allowed case in java
        //...................................................................

        // case 4
        C obj = new C();
        System.out.println(obj.d); // 1
        System.out.println(obj.d2); // 20
        System.out.println(obj.d1); // 20
        System.out.println(((P)(obj)).d); // 10
        obj.fun(); // C
        obj.fun2(); // P
        obj.fun1(); // C 
        ((P)(obj)).fun(); // C
        
    }
}