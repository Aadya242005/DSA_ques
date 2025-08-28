package lec13;

public class SubString {
    public static void main(String[] args){
        String str = "hello";
        Substring(str);
    }
    public static void Substring(String str){
        for(int i=1; i<=str.length();i++){
            for(int j=i; j<=str.length();j++){
                int len=j-i;
                System.out.println(str.substring(len,j));
            }
        }
    }  
}
