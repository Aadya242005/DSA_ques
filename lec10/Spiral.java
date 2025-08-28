package lec10;
public class Spiral {
    public static void main(String[] args){
        int[][]arr = {{1,4,7,11},{2,5,8,12},
        {3,6,9,16}};
        Print(arr);
    }  
    public static void Print(int[][] arr){
        int minr =0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int te = arr.length*arr[0].length;
        int c =0;
        while(c<te){
            for(int i=minc;i<=maxc  && c<te;i++){
                System.out.println(arr[minr][i]+" ");
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr&& c<te;i++ ){
                System.out.println(arr[i][maxc]+" ");
                c++;
            }
            maxc--;
            for(int i=maxc; i>=minc&& c<te;i--){
                System.out.println(arr[maxr][i]+" ");
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr&& c<te;i--){
               System.out.println(arr[i][minc]);
               c++;
            }
            minc++;   
        } 
    }  
}
