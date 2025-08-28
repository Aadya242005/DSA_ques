package lec16;

public class reverse {
    public static void main(String[] args){
        int n =5;
        PD(n);
        
    }
    public static void PD(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        PD(n-1);
    }
    
}
