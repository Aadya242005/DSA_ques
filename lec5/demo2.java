/*package lec5;
import java.util.*;
public class demo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n);
    }
    public static void Sum(int n){
        int sum_even =0;
        int sum_odd =0;
        while(n>0){
            int rem = n%10;
            if(rem %2==0){
                sum_even = sum_even + rem;
            }else{
                sum_odd = sum_odd +rem;

            }
            n= n/10;
        }
        System.out.println(sum_even);
        System.out.println(sum_odd);
    } 
}*/

/*package lec5;
import java.util.*;
public class demo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));  
    }
    public static int Sum(int n){
        int sum_even =0;
        int sum_odd =0;
        while(n>0){
            int rem = n%10;
            if(rem %2==0){
                sum_even = sum_even + rem;
            }else{
                sum_odd = sum_odd +rem;

            }
            n= n/10;
        }
        return sum_even;

       // return sum_even; // only return even sum
        

    } 
}*/

/*package lec5;
import java.util.*;

public class demo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = Sum(n);
        System.out.println("Sum of even digits: " + result[0]);
        System.out.println("Sum of odd digits: " + result[1]);
    }

    public static int[] Sum(int n){
        int sum_even = 0;
        int sum_odd = 0;

        while(n > 0){
            int rem = n % 10;
            if(rem % 2 == 0){
                sum_even += rem;
            } else {
                sum_odd += rem;
            }
            n = n / 10;
        }

        return new int[]{sum_even, sum_odd};
    } 
}
*/
/*package lec5;

public class demo2 {
    public static void main(String[] args){
        int n = 12343563;
        int target = 3;
        System.out.print(Count_digits(n, target));
    }

    public static  int Count_digits(int n, int target){
        int count =0;
        while(n > 0){
            int rem = n % 10;
            if(rem == target){
                count++;
            }
            n = n / 10;
        }
        return count;
    } 
}*/

/*package lec5;

public class demo2 {
    public static void main(String[] args){
        int n = 12343563;
        System.out.print(reverse(n));
    }

    public static  int reverse(int n){
        int sum=0;
        while(n > 0){
            int rem = n % 10;
            sum=sum*10+rem;
          
            n = n / 10;
        }
        return sum ;
    } 
}*/

/*package lec5;
public class demo2 {
    public static void main(String[] args){
        int n = 12343563;
        System.out.print(reverse(n));
    }

    public static  int reverse(int n){
        int sum=0;
        while(n > 0){
            int rem = n % 10;
            sum=sum*10+rem;
          
            n = n / 10;
        }
        return sum ;
    } 
}*/

/*package lec5;
public class demo2 {
    public static void main(String[] args){
        int n = 101;
        System.out.print(Bin_to_dec(n));
    }

    public static int Bin_to_dec(int n){
        int sum=0;
        int mul =1;
        while(n > 0){
            int rem = n % 10;
            sum = sum+ rem* mul;
            n = n / 10;
            mul = mul*2;
        }
        return sum ;
    } 
}*/

/*package lec5;
public class demo2{
    public static void main(String[] args) {
        int n1 = 30;
        int n2 = 20; 
        int a = n1;
        int b =n2;
        while(n1 % n2 !=0){
            int rem = n1 % n2;
            n1 = n2; 
            n2= rem;
           
        }
        System.out.println(n2);
        int gcd = n2;
        int lcm = (a*b)/gcd;
        System.out.println(lcm);
    }        
}*/
/*package lec5;
public class demo2{
    public static void main(String[] args) {
        int n = 32145;
        reverse_num(n);
            
        
    }   
    public static void reverse_num(int n){
        int pos =1;
        int sum =0;
        while(n>0){
            int rem = n % 10;
            sum = (int)(sum + pos*Math.pow(10,rem-1));
            n = n/10;
            pos++;
        }
        System.out.println(sum);
    }
    
}*/

/*package lec5;

public class demo2 {
    public static void main(String[] args) {
        long n = 4545;
        invert_num(n);
    }

    public static void invert_num(long n) {
        long pos = 1;
        long sum = 0;

        while (n > 0) {
            long rem = n % 10;
            n = n / 10;

            long inverted = 9 - rem;

            // Special case: first digit can't be 0
            if (inverted == 0 && n == 0) {
                // keep rem as is
            } else if (inverted < rem) {
                rem = inverted;
            }

            sum = rem * pos + sum;
            pos *= 10;
        }

        System.out.println(sum);
    }
}*/

/*package lec5;

public class demo2 {
    public static void main(String[] args) {
        long n = 102;
        replace_num(n);        
    }

    public static void replace_num(long n) {
        long result =0;
        long pos =1;

        while (n > 0) {
            long rem = n % 10;
            n = n / 10;

           if(rem == 0){
            rem =5;
           } 
           result = rem*pos + result;
           pos=pos*10;

        }

        System.out.println(result);
    }
}*/

/*package lec5;

public class demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,88,-100,49};
        int result = replace_num(arr); 
        System.out.println(result);       
    }

    public static int replace_num(int[] arr) {
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        if(sum>0){
            return sum;
           // break;
        }else{
            return 0;
        }
    }
}*/
/*package lec5;

public class demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,88,-100,49};
        replace_num(arr);
       
    }
    public static void replace_num(int[] arr) {
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
            if(sum<0){
                break;
            }
            System.out.println(arr[i]);
        }
      
         
    }
}*/

/*package lec5;

public class demo2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;
        print_series(n1, n2);
       
    }
    public static void print_series(int n1 , int n2) {
        int sum =0;
        for(int i=1; i<=15; i++){
            sum = (3*(i) + 2);
            if(sum % n2 ==0){
                System.out.print("");
            }else{
                System.out.println(sum);

            }   
        }    
    }
}
.........................................................

package lec5;

public class demo2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;
        print_series(n1, n2);
       
    }
    public static void print_series(int n1 , int n2) {
        int count =0;
        int i=1;
        while(count<n1){
        int term = 3*n +2;
        if(term % n2 !=0){
           System,.out.println(term)}
           count++;
           }
           i++;
      
        }    
    }
}*/
/*package lec5;

public class demo2 {
    public static void main(String[] args) {
        //int n = 371;
        int n1 = 100;
        int n2 = 200;
        for(int i=n1; i<=n2 ; i++){
            if(is_Armstrong(i){
                System.out.println(i);
            }
        }

       // System.out.println(is_Armstrong(n));
 
       
    }
    public static boolean is_Armstrong(int n) {
        int c = countofdigits(n);
        int sum =0;
        int p =n;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            sum =  (int)(sum + (Math.pow(rem , c)));        
        }
        if(sum ==p){
           return true;
        }else{
            return false;
        }
    }   
    public static int countofdigits(int n){
        int count =0;
        while(n>0){
            int rem = n% 10;
            count++;
            n = n/10;
        }
        return count;
    } 
}*/


/*package lec5;

public class demo2 {
    public static void main(String[] args) {
        int n =378;
        boston_num(n);
        int target =0;
        

       // System.out.println(is_Armstrong(n));
 
       
    }
    public static boolean search_boston(int n , int target , int sum){
        if(target == sum){
            return true;
        }else{
            return false;
        }
    }
    public static void count_target(int n , int target){
        while(n>0){
            int rem = n%10;
            target= target+ rem;
            n = n/10;

        }

    }
    public static void boston_num(int n){
        int sum =0;
        for(int i=2; i<378;i++){
            if(n%i==0){
                System.out.println(i);
                for(int j=0; j<i; j++){
                    if(i%j!=0){
                        System.out.println(j);
                        sum = sum+j;
                    }
                }
            }   
        }
    }
}*/
/*package lec5;
public class demo2 {
    public static void main(String[] args) {
        int[][] testCases = {
            {9, 3},  // Test case 1
            {8, 11}  // Test case 2
        };
        int T = testCases.length;
        for (int t = 0; t < T; t++) {
            int m = testCases[t][0]; // Ayush's max
            int n = testCases[t][1]; // Harshit's max

            int turn = 1;
            int ayush_count = 0;
            int harsh_count = 0;

            while (true) {
                if (turn % 2 != 0) { // Ayush's turn
                    ayush_count += turn;
                    if (ayush_count > m) {
                        System.out.println("Harshit");
                        break;
                    }
                } else { // Harshit's turn
                    harsh_count += turn;
                    if (harsh_count > n) {
                        System.out.println("Ayush");
                        break;
                    }
                }
                turn++;
            }
        }
    }
}*/
/*package lec5;
public class demo2 {
    public static void main(String[] args) {
        int n = 12345;
        odd_even(n);
    }
    public static void odd_even(int n ){
        int count=0;
        int sum_even =0;
        int sum_odd =0;
        while(n>0){
            int rem = n%10;
            count++;
            n = n/10;
            if(count%2==0){
                sum_even +=rem;
            }else{
                sum_odd+=rem;
            }
           
        }
        if(sum_even %4==0 || sum_odd %3 ==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}*/
package lec5;
import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();  // source base
        int db = sc.nextInt();  // destination base
        int sn = sc.nextInt();  // number in source base

        int decimalValue = toDecimal(sn, sb);         // Step 1
        int result = fromDecimal(decimalValue, db);   // Step 2

        System.out.println(result);
        sc.close();
    }

    // Step 1: Convert from source base to decimal
    public static int toDecimal(int sn, int sb) {
        int decimal = 0, power = 1;
        while (sn > 0) {
            int digit = sn % 10; // get last digit
            decimal += digit * power;
            power *= sb;
            sn /= 10;
        }
        return decimal;
    }

    // Step 2: Convert from decimal to destination base
    public static int fromDecimal(int decimal, int db) {
        int result = 0, power = 1;
        while (decimal > 0) {
            int digit = decimal % db;
            result += digit * power;
            power *= 10;
            decimal /= db;
        }
        return result;
    }
}
