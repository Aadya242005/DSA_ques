// package lec19;

// public class Permutation {
//     public static void main(String[] args){
//         String ques = "abc";
//         PrintPermutation(ques, "");
//     }
//     public static void PrintPermutation(String ques, String ans){
//         if(ques.length()==0){
//             System.out.println(ans+"");
//             return;
//         }
//         for(int i=0; i<ques.length();i++){
//             char ch = ques.charAt(i);
//             String s1 = ques.substring(0, i);
//             String s2 = ques.substring(i+1);
//             PrintPermutation(s1+s2, ans+ch);   
//         }
//     }
    
//  }


 package lec19;

public class Permutation {
    public static void main(String[] args){
        String ques = "abca";
        //PrintPermutation(ques, "");
        System.out.println(CountPermutation(ques,""));
    }
    public static int CountPermutation(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans+"");
            return 1;
        }
        int count=0;
        for(int i=0; i<ques.length();i++){
            char ch = ques.charAt(i);
            boolean val = true;
            for(int j=i+1; j<ques.length();j++){
                if(ques.charAt(j)==ch){
                val = false;
                break;
                }
            }
            if(val ==true){
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i+1);
                count+=CountPermutation(s1+s2, ans+ch); 
            }   
        } 
        return count;
    }
}
