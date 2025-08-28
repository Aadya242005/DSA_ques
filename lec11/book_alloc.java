package lec11;

public class book_alloc {
    public static void main(String[] args){
        int[] page ={10,20,30,40}; 
        int n = 2; // no of students 
        System.out.print(Minpages(page,n));
    }
    public static int Minpages(int[]page, int n){
        int lo = 0; 
        int hi=0;
        for(int i=0; i<page.length-1; i++){
            hi = hi+page[i];
        }
        //System.out.println(hi);
        int ans =0;
        while(lo<=hi){
            int mid = (lo+hi)/2; 
            if(isitpossible(page , n, mid)==true){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }   
    public static boolean isitpossible(int[] page , int n , int mid){
        int student =1 ;
        int readpage =0;
        for(int i=0; i<page.length;){
            if(readpage+page[i]<=mid){
                readpage+=page[i];
                i++;
            }else{
                readpage =0; 
                student++;
            }
            if(student>n){
                return false;
            }
        }
        return true;

    }
}
