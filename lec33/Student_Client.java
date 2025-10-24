package lec33;

public class Student_Client {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Raj", 19);
        System.out.println(s.getAge());
        s.setAge(-9);
        System.out.println(s.getAge());   
    }  
}
