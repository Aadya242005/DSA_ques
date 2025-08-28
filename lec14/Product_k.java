package lec14;

public class Product_k {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 10;
        System.out.println(Product_less_than_k(arr,k));    
    }
    public static int Product_less_than_k(int[] arr, int k){
        int ei=0;
        int si=0;
        int ans =0;
        int p =1;
        //growing
        while(ei<arr.length){
            p=p*arr[ei];
            while(p>=k && si<=ei ){  //shrinking in case of zero & cond
                p=p/arr[si];
                si++;
            }
            ans = ans+(ei-si+1);
            ei++;
        }
        return ans;       
    }
    
}
