package lec5;
import java.util.*;
public class Evenodd {
    public static void main(String[] args){
        int n = 12134;
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t>0){
        int carno = sc.nextInt();
        if(Sum_check(carno) == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        t--;
       }
        System.out.println(Sum_check(n));

    }

    public static boolean Sum_check(int n){
        int sum_even =0;
        int sum_odd =0;
        while(n>0){
            int rem = n%10;
            if(rem % 2 ==0 ){
                sum_even+=rem;
            }else{
                sum_odd+=rem;
            }
            n = n/10;
        }
        if(sum_even % 4 ==0 || sum_odd % 3==0){
            return true;
        }else{
            return false;
        }
    }
    
}
