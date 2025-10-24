package lec32;

public class Person_Client {
    public static void main(String[] args) {
        Person p = new Person("Raj", 22);
        //System.out.println(p.name);
        //System.out.println(p.age);
        Person p1= new Person("Erica", 21);
       // p.name = "aadu";  // esse kpi vhange nhi kr skte
        p1.setAge(19);
        System.out.println(p1.getAge()); // encapsulation use for edit private method

    
    }  
}
