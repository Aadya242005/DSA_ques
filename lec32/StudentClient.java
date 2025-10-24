package lec32;

public class StudentClient {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        s.name = " Kaju ";
        s.age = 18;
        s.Intro_yourself();
        Student s1 = new Student();
        s1.name = " Doggy ";
        s1.age = 17;
        s1.Intro_yourself();
        s1.SayHey("Ramesh");
        Student.SayMentor_Name();
    }  
    static{
        System.out.println("I am in static block");
    }  
    // prog m sabse pehle run hota h
    // pehle main method k fhir non static k
}
