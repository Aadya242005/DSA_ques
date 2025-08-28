/*package lec17;

public class Subsequence {
    public static void main(String[] args){
        String ques = "abc";
        PrintSubSeq(ques, " ");
        System.out.println(count);

    }
    static int count=0; 
    public static void PrintSubSeq(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            count++;
            return;
        }

        char ch = ques.charAt(0);
        PrintSubSeq(ques.substring(1), ans);
        PrintSubSeq(ques.substring(1), ans+ch);
    } 
}*/


package lec17;

public class Subsequence {
    public static void main(String[] args){
        String ques = "abc";
        //CountSubSequence(ques, " ");
        System.out.println(CountSubSequence(ques, ""));

    }
    static int count=0; 
    public static int CountSubSequence(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        int a1 = CountSubSequence(ques.substring(1), ans);
        int a2 = CountSubSequence(ques.substring(1), ans+ch);
        return a1 + a2;
    } 
}