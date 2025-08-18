/*package lec8;
import java.util.Scanner;
public class demo31 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMajority(arr,n));
    }
    public static int findMajority(int[] arr,int n){
        for(int i=0; i<n; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }
}*/

/*package lec8;
import java.util.Scanner;
public class demo31 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Bubble_Sort(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr+ " ");
        }
    }
    public static void Bubble_Sort(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1] = temp;
            }
        }    
    }
}*/
/*package lec8;
import java.util.Scanner;
public class demo31 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int idx = min_idx(arr,i);
            int temp = arr[i];
            arr[i]=arr[idx];
            arr[idx] = temp;
        }
    
    }
    public static int min_idx(int[] arr,int i){
        int min = i;
        for(int j=i+1; i<arr.length; i++){
            if(arr[j]<min){
                min =j;
            }
        }
        return min;  
    }
}*/

/*package lec8;
public class demo31{
    public static void main(String[] args){
        int[] arr = {1,8,3,4,5,6,2};
        Product(arr);
        //InsertLastElement(arr , arr.length-1);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int[] Product(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0] =1;
        for(int i=1;i<n; i++){
            left[i] = left[i-1]*arr[i-1];
        }
        int[] right = new int[n];
        right[n-1] =1;
        for(int i=n-1; i>=n; i--){
            right[i] = right[i+1]*arr[i+1];
        }
        for(int i=0; i<right.length; i++){
            left[i] = left[i]*right[i];

        }
        return left;

     
    }
    
}*/
