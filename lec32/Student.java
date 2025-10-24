package lec32;

public class Student {
    String name;
    int age;           //non static method
    public void Intro_yourself(){
        System.out.println("My Name is"+ name +"and age is" + age);

    }
    public void SayHey(String name){
        System.out.println(this.name + "Say Hey" + name);
    }
    public static void SayMentor_Name(){
    //    Intro_yoursself();   non static can not be called inside static  but vice versa is true
        System.out.println("Mentor name is Monu Bhaiya");

        // static method --> class k through 
        // non static --> ref variable k through

    }
    static{
        System.out.println("I am static block");

    } 

    
}
