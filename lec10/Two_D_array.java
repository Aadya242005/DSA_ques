package lec10;
import java.util.*;
public class Two_D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Display(arr);
       // int[][] arr = new int[3][4];
      //  System.out.println(arr);
      //  int[] [] other = arr;
      //  System.out.println(arr.length); //row ki length
      //  System.out.println(arr[0].length); //col ki length
      //  System.out.println(arr[1][2]);
    } 
    public static void Display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
