package lec1;
public class Max{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if(a>=b && a>=c){
            System.out.println("Max is "+a);
        }
        else if(b>=a && b>=c ){
            System.out.println("Max is "+b);
        }else{
            System.out.println("Max is " + c);
        }
      

    }
   


}