package lec35;

public class Sum_Of_Number {
    public static void main(String[] args) {
        System.out.println(Add(2,3));
        System.out.println(Add(2,3,4));
        System.out.println(Add(2,3,4.5));
        // triple dot agrument
        System.out.println(Add(2,3,4,5,6,7,8,9,10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5));

        // Methid Overloading
    }
    public static int Add(int a , int b){
        return a+b;
    }

    public static int  Add(int a, int b, int c){
        return a+b+c;

    }
    public static int Add(int a, int b, double c){
        return (int)(a+b+c);
    }
    public static int Add(int x, int...ar){
        int sum =x; 
        for(int i=0; i<ar.length; i++){
            sum+=ar[i];
        }
        return sum;
    }
    
}
