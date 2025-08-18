package lec4;

/*public class Typecasting {
    public static void main(String[] args) {

        int a = 043;
        System.out.println(a);
        byte b = (byte) (140);
        int i =17;
    }
    
}*/
/*public class Typecasting{
    public static void main(String[] args) {
        int F = 35;
        int num = (int)((5/9.0)*(F-32)); 
        System.out.println(num);   
    }
}*/

public class Typecasting{
    public static void main(String[] args) {
        int minf = 10;
        int maxf = 150;
        int steps = 20;
        for(int i=minf; i<=maxf; i=i+steps){
            int c = (int)((5/9.0)*(i-32));
            System.out.println(i + " F = " + c + " C");
        }

        
    }
 

}