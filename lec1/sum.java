package lec1;

public class sum {
    public static void main(String[] args) {
        int n = 5;
        int i=1;
        int sum =0; 
        while(i<=n){
            sum+=i;
            i=i+1;
            System.out.println("Current sum is: " + sum);
        }
        System.out.println("Total sum is: " + sum);
    }  
}
