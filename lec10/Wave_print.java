package lec10;
public class Wave_print {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20}};
        WavePrint(arr);   
    }
    public static void WavePrint(int[][] arr){
        for(int col=0; col<arr[0].length;col++){
            if(col%2==0){  // 0 index
                for(int row=0; row<=arr.length-1;row++){
                    System.out.println(arr[row][col]+" ");
                }
            }else{
                for(int row = arr.length-1;row>=0;row--){
                    System.out.println(arr[row][col]+" ");
                }
            }

        }
    }
    
}


