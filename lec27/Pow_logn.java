package lec27;

public class Pow_logn {
    public static void main(String[] args) {
        int a =3;
        int n =5;
        System.out.println();
    }
    public static int pow(int a, int n){
        if(n==0){
            return 1;
        }
        int ans = pow(a,n-1);
        ans= ans*ans;
        if(n%2!=0){
            ans +=a;
        }
        return ans;
    }
    
}
