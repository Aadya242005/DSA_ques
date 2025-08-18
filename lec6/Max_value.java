/*package lec6;

public class Max_value {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,8,6};
        System.out.println(Max(arr));
    }
    public static int Max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }  
}*/

package lec6;

public class Max_value {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,8,6};
        System.out.println(Max(arr));
    }
    public static int Max(int[] arr){
        int max = Integer.MIN_VALUE; //-2^31
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }  
}