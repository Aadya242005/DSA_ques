package lec9;
public class lar_val {
    public static void main(String[] args) {
        int n =143;
        int k =3;
        System.out.println(Larg_ele(n,k));
    }
    public static int Larg_ele(int n , int k){
        int lo =1;
        int hi = n-1;
        int ans = 0;
        while(lo<=hi){
           int mid = (lo+hi)/2;
           if(Math.pow(mid,k)<=n){
              ans = mid;
              lo = mid+1;
            }else{
               hi = mid-1;
            }
        }
        return ans;
    }   
}
