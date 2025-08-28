// package lec18;

// public class Generate_parenthesis {
//     public static void main(String[] args) {
//         int n =3;
//         GenerateParenthesis(n,0, 0,"");
        
//     }

//     public static void GenerateParenthesis(int n , int open, int close, String ans){
//         if(open ==n && close ==n){
//             System.out.println(ans + " ");
//         }
//         if(open>n || close>open){
//             return;
//         }
//         GenerateParenthesis(n, open+1,close,ans+"(");
//         GenerateParenthesis(n, open,close+1,ans+")");
//     }
// }

    
package lec18;
import java.util.*;
public class Generate_parenthesis {
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
}

