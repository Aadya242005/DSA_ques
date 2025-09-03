/*package lec27;
import java.util.*;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt(); 
        
        int count = Subset(arr, target, 0, "");
        //System.out.println();   // move to next line after printing subsets
        System.out.println(count);  // print total count
    }

    public static int Subset(int[] arr, int target, int idx, String ans){
        if(idx == arr.length){
            if(target == 0){
                System.out.print(ans.trim() + "  "); // print subset with 2 spaces
                return 1;
            }
            return 0;
        }

        // ✅ recursive calls only if idx < arr.length
        // include current element
        int a1 = Subset(arr, target - arr[idx], idx + 1, ans + arr[idx] + " ");

        // exclude current element
        int a2 = Subset(arr, target, idx + 1, ans);

        return a1 + a2;
    }
}*/
/*package lec27;
import java.util.*;

public class demo6 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();  // currently unused, but can be used for obstacles later
            }   
        }
        Mazepath(0, 0, n-1, n-1, "");
        System.out.println(count);
    }

    public static void Mazepath(int cc, int cr, int ec, int er, String ans){
        if(cc == ec && cr == er){
            System.out.print(ans + " ");  
            count++;
            return;
        }
        if(cc > ec || cr > er){
            return;
        }
        Mazepath(cc + 1, cr, ec, er, ans + "H");
        Mazepath(cc, cr + 1, ec, er, ans + "V");
        Mazepath(cc + 1, cr + 1, ec, er, ans + "D");
    }
}*/
/*package lec27;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countTwins(str));
    }
    public static int countTwins(String str){
        if(str.length()<3){
            return 0;
        }
        int count=0;
        if(str.charAt(0)==str.charAt(2)){
            count=1;
        }
        return count+ countTwins(str.substring(1));
    }
*/
/*package lec27;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.next();

        char[] arr = original.toCharArray(); // "cab" → ['c','a','b']
        Arrays.sort(arr);                    // ['a','b','c']
        String sorted = new String(arr);

        DictOrder(sorted, "", original); // pass original as argument
    }

    public static void DictOrder(String str, String ans, String original) {
        if (str.length() == 0) {
            if (ans.compareTo(original) > 0) {
                System.out.println(ans);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            DictOrder(ros, ans + ch, original);
        }
    }
}
*/
/*package lec27;
import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        int n =3;
        List<String> ll = new ArrayList<>();
        GenerateParenthesis(n,0, 0,"",ll);
        System.out.println(ll);
        
    }

    public static void GenerateParenthesis(int n , int open, int close, String ans, List<String> ll){
        if(open ==n && close ==n){
            ll.add(ans);
            return;
    //        System.out.println(ans + " ");

        }
        if(open>n || close>open){
            return;
        }
        GenerateParenthesis(n, open+1,close,ans+"(",ll);
        GenerateParenthesis(n, open,close+1,ans+")",ll);
    }
}*/

/*package lec27;
import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        int n =3;
        TOH(3,"A","B","C");   
    }

    public static void TOH(int n , String src, String hlp,String des){
        if(n==0){
            return;
        }
        TOH(n-1, src, des, hlp);
        System.out.println("Move" + n + "th disk from"+ src+"to"+des);
        TOH(n-1,hlp, src, des);
      
    }
}*/
/*package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m = sc.nextInt();
        int totalPaths = boardPaths(0,n,m,"");
        System.out.println();
        System.out.println(totalPaths);
    }
    public static int boardPaths(int curr, int end, int m, String ans){
        if(curr==end){
            System.out.println(ans+" ");
            return 1;
        }
        if(curr>end){
            return 0;
        }
        int count=0;
        for(int dice=1;dice<=m;dice++){
            count=count+boardPaths(curr+dice,end,m,ans+dice);
        }
        return count;
    }
}*/
/*package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = solve(arr, 0, n-1);
            System.out.println(ans);
        }
    }
    public static int solve(int[] arr, int l, int r){
        if(l>=r){
            return 0;
        }
        int leftSum=0;
        int rightSum =0;
        for(int i=1; i<r;i++){
            leftSum+=arr[i];
        }
        rightSum+=arr[r];

        int prefix =0;
        for(int i=l;i<r;i++){
            prefix+=arr[i];
            int suffix=0;
            for(int j=i+1; j<=r;j++){
                suffix+=arr[j];
            }
            if(prefix==suffix){
                int leftAns= solve(arr,l,i);
                int rightAns = solve(arr,i+1,r);
                return 1+Math.max(leftAns,rightAns);
            }
        }
        return 0;

    }
}*/
/*package lec27;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        char[] arr = original.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        DictOrder(sorted, "",original);
    }
    public static void DictOrder(String str , String original , String ans){
         if (str.length() == 0) {
            if (ans.compareTo(original) < 0) {   // change here
                System.out.println(ans);
            }
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            DictOrder(ros, ans + ch, original);
        }
    }
}*/
/*package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ways = splitArray(arr,0,new ArrayList<Integer>(), new ArrayList<Integer>(),0,0);
        System.out.print(ways);

    }
    public static int splitArray(int[] arr,int i, List<Integer> ll1, List<Integer> ll2,int sum1, int sum2){
        if(i==arr.length){
            if(sum1==sum2){
                printLists(ll1,ll2);
                return 1;
            }
            return 0;
        }
        ll1.add(arr[i]);
        int c1 = splitArray(arr,i+1,ll1,ll2,sum1+arr[i],sum2);
        ll1.remove(ll1.size()-1);

        ll2.add(arr[i]);
        int c2 = splitArray(arr,i+1, ll1, ll2,sum1,sum2+arr[i]);
        ll2.remove(ll2.size()-1); //backtrack

        return c1+c2;
    }
    private static void printLists(List<Integer> ll1, List<Integer> ll2){
        for(int i=0; i<ll1.size();i++){
            System.out.print(ll1.get(i)+" ");
        }
        System.out.print("and");
        for(int i=0; i<ll2.size();i++){
            System.out.print(ll2.get(i)+" ");
        }
        System.out.println();
    }
}*/

/*package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int ans = Search_index(arr,0,m);
        System.out.println(ans);
    }
    public static int Search_index(int[]arr,int idx,int m){
       if(idx==arr.length){
        return -1;
       }
       int index= Search_index(arr,idx+1,m);
       if(index!=-1){
        return index;
       }
       if(arr[idx] == m){
        return idx;
       }

       return -1;

    }
}*/

/* 
package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int ans = first_index(arr,0,m);
        System.out.println(ans);
    }
    public static int first_index(int[]arr,int idx, int m){
        if(idx==arr.length)
        return -1;

        if(arr[idx]==m){
            return idx;
        }
        return first_index(arr,idx+1,m);
    }
}*/


/*package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Lexico_count(n,0);
    }

    public static void Lexico_count(int n ,int curr){
        if(curr==n){
            return;
        }
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            Lexico_count(n,curr*10+i);
        }
    }
}*/
/*package lec27;
import java.util.*;
public class demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String s = sc.next();
            generate(s.toCharArray(),0);
            System.out.println();
        }
    }
    public static void generate(char[] arr, int i){
        if(i==arr.length){
            System.out.print(new String(arr)+" ");
            return;
        }
        if(arr[i]=='?'){
            arr[i]='0';
            generate(arr, i+1);  
            
            arr[i]='1';
            generate(arr,i+1);

            arr[i]='?';
        }else{
            generate(arr, i+1);
        }
    }
}*/

/*package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] ans = FindIndex(arr,0,m,0);
        if(ans.length==0){
            System.out.println(-1);
        }else{
            for(int i=0; i<ans.length;i++){
                System.out.println(ans[i]+" ");
            }
        }   
    }
    public static int[] FindIndex(int[]arr,int idx, int m, int fsf){
        if (idx == arr.length) {
            return new int[fsf]; // make result array of size = matches
        }

        if (arr[idx] == m) {
            int[] res = FindIndex(arr, idx + 1, m, fsf + 1);
            res[fsf] = idx; // place current index at correct position
            return res;
        } else {
            return FindIndex(arr, idx + 1, m, fsf);
        }
    }
}*/
/*package lec27;
import java.util.*;
public class demo3{
    static String[] map =  {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String ques = "abc";
        Combination(ques,"");
        
    }
    public static void Combination(String ques, String ans ){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        int num = ch-'0';
        String press= map[num];
        for(int i=0; i<press.length();i++){
            Combination(ques.substring(1),ans+press.charAt(0));

        }
    }
}*/

/*package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args) {
        String ques = "abcd";
       System.out.print(Subsequence(ques, ""));
    }
    static int count =0;
    public static int Subsequence(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }
        char ch = ques.charAt(0);
        int a1 =Subsequence(ques.substring(1),ans);
        int a2 = Subsequence(ques.substring(1),ans+ch);
        return a1 + a2;
    }
}*/
  
/*package lec27;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        sc.nextLine();

        for(int i=0; i<n;i++){
            String str = sc.nextLine();
            //System.out.println(replacePi(str));
        }
    }
    public static String replacePi(String str){
        if(str.length()<=1){
            return str;
            
        }
        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            return "3.14" + replacePi(str.substring(2));
        }else{
            return str.charAt(0) + replacePi(str.substring(1));
        }
    }
}*/
/*package lec27;
import java.util.*;
public class demo3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Replace(n);
        System.out.println(ans);

    }
    public static int Replace(int n){
        if(n==0){
            return 5;
        }
        return convertRec(0);
    
    }
    public static int convertRec(int n){
        if(n==0){
            return 0;
        }
        int digit = n%10;
        if(digit==0){
            digit= 5;
        }
        return convertRec(n/10)*10+digit;
    }
}*/
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenOdd(n,1);
    }
    public static void EvenOdd(int n, int curr){
        if(curr>n){
            return;
        }
        if(curr%2!=0){
            System.out.println((n-curr+1));
        }
        EvenOdd(n, curr-1);
        if(curr%2==0){
            System.out.println(curr);
        }
    }
}*/
/*package lec27;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(countHi(str));
        System.out.println(removeHi(str));
        System.out.println(replaceHi(str));
    }
     public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("hi")) return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }

    public static String removeHi(String str) {
        if (str.length() < 2) return str;
        if (str.startsWith("hi")) return removeHi(str.substring(2));
        return str.charAt(0) + removeHi(str.substring(1));
    }

    public static String replaceHi(String str) {
        if (str.length() < 2) return str;
        if (str.startsWith("hi")) return "bye" + replaceHi(str.substring(2));
        return str.charAt(0) + replaceHi(str.substring(1));
    }
    
}*/
/*package lec27;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(triangle(N));
    }

    public static int triangle(int n) {
        if (n == 1) return 1;
        return n + triangle(n - 1);
    }
}*/
/*package lec27;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(countHi(str));
        System.out.println(removeHi(str));
        System.out.println(replaceHi(str));
    }

    // a) Count "hi" not followed by 't'
    public static int countHi(String str) {
        if (str.length() <= 1) return 0;

        if (str.startsWith("hi") && !(str.length() > 2 && str.charAt(2) == 't')) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    // b) Remove "hi" not followed by 't'
    public static String removeHi(String str) {
        if (str.length() <= 1) return str;

        if (str.startsWith("hi") && !(str.length() > 2 && str.charAt(2) == 't')) {
            return removeHi(str.substring(2)); // skip "hi"
        } else {
            return str.charAt(0) + removeHi(str.substring(1));
        }
    }

    // c) Replace "hi" with "bye" (not followed by 't')
    public static String replaceHi(String str) {
        if (str.length() <= 1) return str;

        if (str.startsWith("hi") && !(str.length() > 2 && str.charAt(2) == 't')) {
            return "bye" + replaceHi(str.substring(2));
        } else {
            return str.charAt(0) + replaceHi(str.substring(1));
        }
    }
}*/
/*package lec27;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();   // input number as string

        int result = convertToInt(str, str.length());
        System.out.println(result);
    }

    // Recursive function to convert string → integer
    public static int convertToInt(String str, int n) {
        // Base case: only one digit left
        if (n == 1) {
            return str.charAt(0) - '0'; // convert char digit → int
        }

        // Recursive call: convert prefix
        int smallAns = convertToInt(str, n - 1);

        // get last digit
        int lastDigit = str.charAt(n - 1) - '0';

        // combine: shift left (×10) + add last digit
        return smallAns * 10 + lastDigit;
    }
}*/
package lec27;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();   // input number as string
        decode(digits, 0, "");
    }

    // Recursive function
    public static void decode(String digits, int idx, String ans) {
        // Base case: reached end of string
        if (idx == digits.length()) {
            System.out.println(ans);
            return;
        }

        // Case 1: take one digit
        int oneDigit = digits.charAt(idx) - '0';
        if (oneDigit >= 1 && oneDigit <= 9) {
            char letter = (char) ('A' + oneDigit - 1);
            decode(digits, idx + 1, ans + letter);
        }

        // Case 2: take two digits (if possible)
        if (idx + 1 < digits.length()) {
            int twoDigits = (digits.charAt(idx) - '0') * 10 + (digits.charAt(idx + 1) - '0');
            if (twoDigits >= 10 && twoDigits <= 26) {
                char letter = (char) ('A' + twoDigits - 1);
                decode(digits, idx + 2, ans + letter);
            }
        }
    }
}
