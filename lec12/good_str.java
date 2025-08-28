package lec12;

public class good_str {
    public static void main(String[] args) {
        String str = "asscvdhvwhfqvdsweoia"; 
        System.out.println(Longest_substr(str));      
    }
    public static int Longest_substr(String str ){
        int ans =0; 
        int count =0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(isVowel(ch)==true){
                count++;
            }else{
                ans = Math.max(ans , count);
                count=0;
            }
        }
        ans = Math.max(ans , count);
        return ans;
         

    }
    public static boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
            return true;
        }else{
            return false;
        }
    }
    
}
