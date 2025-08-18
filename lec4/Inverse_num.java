package lec4;

public class Inverse_num {
    public static void main(String[] args) {
        int n = 32145;
        int pos =1;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum + pos *(int)Math.pow(10, rem-1);
            n  = n/10;
            pos++;
        }
        System.out.println(sum);
    }        
}
