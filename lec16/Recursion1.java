/*package lec16;
public class Recursion1 {
    public static void main(String[] args){
        int n =5;
        System.out.println(fac(n));
        
    }
    public static int fac(int n){
        //base case
        if(n==1 || n==0){
            return 1;
        }
        int fn = fac(n-1);  //sp
        return fn*n;
        
    }
    
}*/

package lec16;
public class Recursion1 {
    public static void main(String[] args){
        int n =5;
        System.out.println(fac(n,1));
        
    }
    public static int fac(int n, int ans){
        //base case
        if(n==0){
            return ans;
        }
          //sp
        return fac(n-1 ,ans*n);
        
    }
    
}