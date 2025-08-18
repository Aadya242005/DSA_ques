/*package lec6;
public class Swap {
    public static void main(String[] args){
        int[] arr = {3,5,1,7,8};
        System.out.println(arr[0] + " "+ arr[1]);
        Swap(arr[0], arr[1]);
        System.out.println(arr[0] + " "+ arr[1]);
    }
    public static void Swap( int a, int b){
        int temp =a;
        a = b;
        b= temp; // here it will swap but not in main method 
    }  
}*/
/* 
package lec6;
public class Swap {
    public static void main(String[] args){
        int[] arr = {3,5,1,7,8};
        System.out.println(arr[0] + " "+ arr[1]);
        Swap(arr,0,1);

        System.out.println(arr[0] + " "+ arr[1]);
    }
    public static void Swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];  
        arr[j]= temp;
    }  
}*/

package lec6;
public class Swap {
    public static void main(String[] args){
        int[] arr = {3,5,1,7,8};
        int[] other = {31, 51, 11, 71, 81};
        System.out.println(arr[0] + " "+ other[0]);
        Swap(arr, other);
        System.out.println(arr[0] + " "+ other[0]);
    }
    public static void Swap(int[] arr, int[] other){
        int[] temp =arr;
        arr = other;
        other= temp;
    }  
}