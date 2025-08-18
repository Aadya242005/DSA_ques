package lec3;

public class Fibo {
    public static void main(String[] args) {
        int n =5;
        int a =0;
        int b =1;
        for(int i=0; i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c + " ");
        }
       // System.out.print(a);
       // System.out.print(b);

        

      
    }

}
