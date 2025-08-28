package lec12;

public class Reverse_words {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(Reverse_wrd(s));
        
    }
    public static String Reverse_wrd(String s){
        s = s.trim();
        String[] arr = s.split("\s+");
        String ans = "";
        for(int i=arr.length-1; i>=0; i--){
            ans = ans+arr[i]+" ";

        }
        return ans.trim();
    }  
}
