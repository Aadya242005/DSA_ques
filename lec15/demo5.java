/*package lec15;
import java.util.*;
public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder word = new StringBuilder();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                if(word.length()>0){
                    System.out.println(word.toString());
                    word.setLength(0);
                }
            } 
            word.append(ch);
        }
        if(word.length()>0){
            System.out.println(word.toString());
        }
    }  
}*/

/*package lec15;
public class demo5 {
    public static void main(String[] args){
        String str = "82819";
        Substring(str);
    }
    public static void Substring (String str){
        int count=0;
        boolean[] visited = new boolean[str.length()];
        for(int i=1;i<=str.length();i++){
            for(int j=i; j<=str.length(); j++){
                int len = j-i;
                String s = str.substring(len,j);
                if(IsCB(Long.parseLong(s))==true && Isvisited(visited,len,j-1)==true){
                    count++; 
                    for(int k=1;k<j;k++){
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static boolean Isvisited(boolean[] visited , int len , int j){
        for(int k=1; k<=j;k++){
            if(visited[k]==true){
                return false;
            }
        }
        return true;
    }
    public static boolean IsCB(long num){
        if(num==0 || num==1){
            return false;
        }
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        for(int i=0; i<arr.length;i++){
            if(num == arr[i]){
                return true;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(num%arr[i] ==0){
                return false;
            }
        }
        return true;
    }   
}*/

/*package lec15;
import java.util.*;
public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        
    }
    public static void ReturnString(String str){
        int[] freq =new int [26];
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0; i<str.length();i++){
            System.out.println(freq[i]+" ");
        }
    }
}*/

/*package lec15;
import java.util.*;
public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        
    }
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    } 
}*/

/*package lec15;
import java.util.*;
public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Odd_even_char(str));
        sc.close();  
    }
    public static String Odd_even_char(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(i%2==0){
                sb.append((char)(ch+1));
            }else{
                sb.append((char)(ch-1));
            }

        }
        return sb.toString();
       
    } 
}*/

/*package lec15;
import java.util.*;
public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(String_diff(str));
        sc.close();  
    }
    public static String String_diff(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            sb.append(ch1);
            sb.append(ch2-ch1);

        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
       
    } 
}*/


/*package lec15;
import java.util.*;
public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(good_str(str));
        sc.close();  
    }
    public static int  good_str(String str){
        int count=0;
        int ans=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((isVowel(ch))==true){
                count++;
            }else{
                ans = Math.max(count,ans);
                count=0;
            }  
        }
        ans = Math.max(count,ans);
        return ans;   
    } 
    public static boolean isVowel(char ch){
        if(ch =='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            return true;
        }else{
            return false;
        }
    }
}*/


/*package lec15;
import java.util.*;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr, new Comparator<String>(){
                public int compare(String a , String b){
                    String ab = a+b;
                    String ba = b+a;
                    return ba.compareTo(ab);
                }
            });
            String result = "";
            for(int i=0; i<n;i++){
                result+=arr[i];

            }
            if(result.charAt(0)=='0'){
                System.out.println("0");
            }else{
                System.out.println(result);
            }

        }
        sc.close();
    }
}*/

/*package lec15;
import java.util.*;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(remove_duplicates(str));
        sc.close();
        
       
    }
    public static String remove_duplicates(String str){
        StringBuilder s = new StringBuilder();
        s.append(str.charAt(0));
        for(int i=1; i<str.length();i++){
            if(str.charAt(i)!= str.charAt(i-1)){
                s.append(str.charAt(i));

            }
        }
        return s.toString();

    }
}*/

/*package lec15;
import java.util.*;
public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(IsPalindrome(s));
        sc.close();  
    }
    public static boolean IsPalindrome(String s){
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }
            i++;
            j--;

        }
        return true;
    }
}*/
/*package lec15;
import java.util.*;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Max_freq(s));
        sc.close();  
    }

    public static char Max_freq(String s) {
        int[] freq = new int[128]; // cover ASCII (A-Z, a-z, etc.)

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        // Find character with maximum frequency
        int maxFreq = 0;
        char maxChar = ' ';
        for (int i = 0; i < 128; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }
}*/

package lec15;
import java.util.*;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countPalindromicSubstrings(s));
        sc.close();
    }

    public static int countPalindromicSubstrings(String s) {
        int n = s.length();
        int count = 0;

        // Check all possible centers
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}
