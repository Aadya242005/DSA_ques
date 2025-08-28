package lec19;

public class letter_comb {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String ques="23";
        Combinations(ques, "");

        
    }
    public static void Combinations(String ques, String ans ){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        int num = ch-'0';
        String press = map[num];
        for(int i=0; i<press.length();i++){
            Combinations(ques.substring(1),ans+press.charAt(i));
        }

    }   
}
