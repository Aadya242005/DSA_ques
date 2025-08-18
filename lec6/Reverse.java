/*package lec6;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,8,6};
        Reverse_arr(arr);
        for(int i=0; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void Reverse_arr(int[]arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }  
    }
    
}*/


package lec6;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,8,6,9,11,15,17,18,16,23,27};
        Reverse_arr(arr,3,12); 
        for(int i=0; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
    
    }
    public static void Reverse_arr(int[]arr, int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }  
    }
    
}