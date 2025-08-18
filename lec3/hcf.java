package lec3;
// factor
/*public class hcf {
    public static void main(String[] args) {
        int a = 10;
        for(int i=1; i<a; i++){
            if(a%i==0){
                System.out.println(i);
            }
        }   
    }  
}*/
public class hcf {
    public static void main(String[] args) {
        int dividend = 60;
        int divisor = 36;
        while(dividend % divisor !=0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
      
    }
}