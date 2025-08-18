package lec4;

/*public class Dec_to_Bin {
    public static void main(String[] args) {
        int n = 23; 
        int sum =0;
        int mul =1;
        while(n>0){
            int rem = n%2;
            sum = sum + rem*mul;
            n = n/2;
            mul = mul*10; 
        }
        System.out.println(sum);
    }    
    
}
*/

public class Dec_to_Bin{
    public static void main(String[] args) {
        int n = 10101; 
        int sum =0;
        int mul =1;
        while(n>0){
            int rem = n%10;
            sum = sum + rem*mul;
            n = n/10;
            mul = mul*2; 
        }
        System.out.println(sum);
    }    
    
}