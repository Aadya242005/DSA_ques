package lec36;
import java.util.Stack;
public class Stack_span {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        Cal_Span(arr);
    }
    public static void Cal_Span(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty()&& arr[i]>arr[st.peek()]){
                st.pop();
                //ans[st.pop()] = arr[i];
            }if(st.isEmpty()){
                ans[i] = i+1;

            }else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        for(int i=0; i<ans.length; i++){
            System.out.println(arr[i] + ","+ ans[i]);
        }
    }
    
}
