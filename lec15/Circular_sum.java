package lec15;

public class Circular_sum {
    public static void main(String[] args) {
        int[] arr = {8,-8,9,-9,10,-11,12};
        System.out.println(MaxmumSum(arr));
    }
    public static int MaxmumSum(int[] arr){
        int linear_sum = Kadens_Algo(arr);
        int sum =0;
        for(int i=0; i<arr.length;i++){
            sum = sum +arr[i];
            arr[i] = arr[i]*-1;
        }
        int mid = Kadens_Algo(arr);
        int Cir_sum = sum + mid;
        if(Cir_sum ==0){
            return linear_sum;
        }
        return Math.max(linear_sum ,Cir_sum);
    }

    public static int Kadens_Algo(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<arr.length ; i++){
            sum = sum+arr[i];
            ans = Math.max(ans , sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
