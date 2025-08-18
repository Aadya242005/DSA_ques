package lec3;

public class Reverse_num {
    public static void main(String[] args) {
        int n =1234;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum*10 + rem;
            n = n/10;

        }
        System.out.println("Reversed number: " + sum);
    }
    
}
