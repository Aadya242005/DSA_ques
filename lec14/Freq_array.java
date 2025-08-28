package lec14;

public class Freq_array {
    public static void main(String[] args) {
        String s = "samdkehucewbmwecbuevwhcdwnmcb";
        int[] frq = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            frq[ch -'a' ]++;
        }
        for(int i=0; i<frq.length; i++){
            System.out.println(frq[i]+" ");
        }
        
    }
    
}
