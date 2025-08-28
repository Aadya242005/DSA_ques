package lec13;
public class CB_num {
    public static void main(String[] args){
        String str = "82819";
        Substring(str);
    }
    public static void Substring (String str){
        int count=0;
        boolean[] visited = new boolean[str.length()];
        for(int i=1;i<=str.length();i++){
            for(int j=i; j<=str.length(); j++){
                int len = j-i;
                String s = str.substring(len,j);
                if(IsCB(Long.parseLong(s))==true && Isvisited(visited,len,j-1)==true){
                    count++; 
                    for(int k=1;k<j;k++){
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static boolean Isvisited(boolean[] visited , int len , int j){
        for(int k=1; k<=j;k++){
            if(visited[k]==true){
                return false;
            }
        }
        return true;
    }
    public static boolean IsCB(long num){
        if(num==0 || num==1){
            return false;
        }
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        for(int i=0; i<arr.length;i++){
            if(num == arr[i]){
                return true;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(num%arr[i] ==0){
                return false;
            }
        }
        return true;
    }   
}
