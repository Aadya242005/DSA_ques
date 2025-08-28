package lec14;
public class Slid_win {
    public static void main(String[] args){
        int[] arr ={2,1,3,4,5,6,7,8,9,4,5};
        int k =3;
        System.out.println(MaxSum(arr,k));
        
    }
    public static int MaxSum(int[] arr, int k){
        int sum=0;
        int ans =0; 
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        ans = sum;
        for(int i=k ; i<arr.length; i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ans =  Math.max(sum, ans);

        }
        return ans;
    }
    
}
