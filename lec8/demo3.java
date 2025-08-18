/*package lec8;
import java.util.*;
public class demo3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] inv = Inverse(arr);
        for(int i=0; i<n; i++){
            System.out.println(inv[i]+" ");
        }
    }
    public static int[] Inverse(int[] arr){
        int inv[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            inv[arr[i]] = i;

        }
        return inv;
    }
}*/

/*package lec8;
import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Target_sum(arr, target);
    }

    public static void Target_sum(int[] arr, int target) {
        Arrays.sort(arr); // sort for A <= B <= C

        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    }
                }
            }
        }
    }
}*/

/*package lec8;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        System.out.print(arr_search(arr, m));
    }

    public static int arr_search(int[] arr, int m) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]== m){
                return i;
            }

        }
        return -1;
    }
}*/

/*package lec8;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Target_sum(arr, target);
    }

    public static void Target_sum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]== target){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}*/

/*package lec8;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Max(arr));
    }

    public static int Max(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}*/

/*package lec8;
import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // no of test case
        while(T-- >0){
            int n = sc.nextInt(); // no of roses 
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            int m = sc.nextInt(); // no of money
            Arrays.sort(arr);

            int left = 0;
            int right =n-1;
            int price1 = 0 ;
            int price2 =0;
            while(left<right){
                int sum = arr[left] + arr[right];
                if(sum == m){
                    price1= arr[left];
                    price2 = arr[right];
                    left++;
                    right--;

                }else if(sum<m){
                    left++;
                }else{
                    right++;
                }
            }
            
            System.out.println("Deepak should buy roses whose prices are " 
                               + price1 + " and " + price2 + ".");
            System.out.println(); // blank line after each test case
        }   
    }   
}*/

/*package lec8;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int c1= sc.nextInt();
            int c2= sc.nextInt();
            int c3= sc.nextInt();
            int c4= sc.nextInt();
            int n= sc.nextInt();
            int m= sc.nextInt();

            int[] rickshaw = new int[n];
            for(int i=0; i<n; i++){
                rickshaw[i] = sc.nextInt();
            }
            int[] cab = new int[n];
            for(int i=0; i<n; i++){
                cab[i] = sc.nextInt();
            }
            int rickshawcost =0;
            for(int rides: rickshaw){
                rickshawcost +=Math.min(rides*c1, c2);
            }
            rickshawcost = Math.min(rickshawcost , c3);
            int cabcost = 0;
            for(int rides: cab){
                cabcost+=Math.min(rides*c1, c2);
            }
            cabcost = Math.min(cabcost , c3);

            int totalcost = Math.min(rickshawcost + cabcost,c4);
            System.out.println(totalcost);
        }
    }
}*/
/*package lec8;
public class demo3{
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
    
/*package lec8;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Squares_arr(arr);
    }

    public static void Squares_arr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");

        }
    }
}*/

/*package lec8;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }
}*/
/*package lec8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            System.out.print(sum + " ");
        }
    }
}*/


