package lec3;
public class Sum_of_dig {
    public static void main(String[] args) {
        
    int n = 1234;
    int sum = 0;
    while(n>0){
        int rem = n%10;
        sum=sum + rem;
        n =n/10;
    }

    System.out.println("Sum of digits: " + sum);

    }
}
