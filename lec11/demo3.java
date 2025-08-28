/*package lec11;
import java.util.*;
public class demo4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //row
        int n = sc.nextInt(); // col
        int[][] arr = new int[m][n];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                arr[i][j] =sc.nextInt();
            }  
        }
        WavePrint(arr);
        
    }
    public static void WavePrint(int[][] arr){
        for(int row=0; row<arr.length;row++){
            if(row%2==0){
                for(int col=0; col<arr[0].length;col++){
                    System.out.println(arr[row][col]+" ");
                }
            }else{
                for(int col=arr[0].length-1;col>=0;col--){
                    System.out.println(arr[row][col]+" ");
                }
            }
        }
    }
}*/

/*package lec11;
import java.util.*;
public class demo4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //row
        int n = sc.nextInt(); // col
        int[][] arr = new int[m][n];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j] =sc.nextInt();
            }  
        }
        Spiral(arr);
    }
    public static void Spiral(int[][] arr){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int te = arr.length*arr[0].length;
        int c=0;
        while(c<te){
            for(int i=minr; i<=maxr && c<te;i++){
                System.out.println(arr[i][minc]+" ");
                c++;
            }
            minc++;
            for(int i=minc;i<=maxc && c<te ; i++){
                System.out.println(arr[maxr][i]+" ");
                c++;
            }
            maxr--;
            for(int i=maxr;i<=minr && c<te ; i++){
                System.out.println(arr[i][maxc]+" ");
                c++;
            }
            maxc--;
            for(int i=maxc;i<=minc && c<te ; i++){
                System.out.println(arr[minr][i]+" ");
                c++;
            }
            minr++;
        }   
    }
}*/

/*package lec11;
import java.util.*;
public class demo4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //row
        int n = sc.nextInt(); // col
        int[][] arr = new int[m][n];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                arr[i][j] =sc.nextInt();
            }  
        }
        System.out.println(Matrix(arr, 60));
    }
    public static boolean Matrix(int[][] arr, int item){
        int r = 0; 
        int c = arr[0].length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==item){
                return true;
            }else if(arr[r][c]>item){
                c--;
            }else{
                r++;
            }
        }
        return false;   
    }
}*/


/*package lec11;
import java.util.*;
public class demo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // size of NxN matrix
        int[][] arr = new int[N][N];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] rotated = rotate(arr, N);
        printMatrix(rotated, N);
    }

    public static int[][] rotate(int[][] arr, int N){
        int[][] res = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                res[N-1-j][i] = arr[i][j];
            }
        }
        return res;
    }

    public static void printMatrix(int[][] arr, int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j] + " "); // <-- use print, not println
            }
            System.out.println(); // move to next row after printing all columns
        }
    }
}*/
/*package lec11;
import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int K = sc.nextInt(); 
        int S = sc.nextInt();

        char[][] park = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                park[i][j] = sc.next().charAt(0);
            }
        }
          boolean escaped = true;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){

                char cell = park[i][j];

                // If it's a blockade, break row immediately
                if(cell == '#'){
                    break;
                }

                // Check if it's the last column (special case)
                boolean lastCol = (j == M-1);

                if(cell == '.'){
                    if(lastCol) S -= 2; // no step to next
                    else S -= 3;       // -2 for dot, -1 for step
                }
                else if(cell == '*'){
                    if(lastCol) S += 5; // only +5, no step
                    else S += 4;       // +5 - 1 step
                }

                // If strength drops below K anytime → fail
                if(S < K){
                    escaped = false;
                    break;
                }
            }
            if(!escaped) break;
        }
        if(escaped){
            System.out.println("Yes");
            System.out.println(S);
        } else {
            System.out.println("No");
        }
    }
}*/

/*package lec11;
import java.util.*;

public class demo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        // input
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<r;i++){
            Arrays.sort(arr);
        }
        for(int i=0; i<r;i++){
            for(int j=0; j<c;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/

/*import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Call function
        if (isLowerTriangular(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //  Function to check lower triangular
    public static boolean isLowerTriangular(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) { // check above diagonal
                if (arr[i][j] != 0) {
                    return false;   // directly return
                }
            }
        }
        return true;
    }
}*/
/*package lec11;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();  //  paranthas
        int L = sc.nextInt();  //  cooks
        int[] rank = new int[L];
        for (int i = 0; i < L; i++) {
            rank[i] = sc.nextInt();
        }
        System.out.println(miniTime(P, rank));
    }

    public static int miniTime(int P, int[] rank) {
        int lo = 0;
        int hi = 10000000; 
        int ans = 0;

        while (lo <= hi) {
            int mid = lo+(hi - lo)/2;

            if (isitPossible(P, rank, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isitPossible(int P, int[] rank, int mid) {
        int count = 0; 

        for (int i = 0; i < rank.length; i++) {
            int r = rank[i]; 
            int time = 0;
            int j = 1;
            while (true) {
                time += r * j; 
                if (time > mid) break;  
                count++;
                j++;
                if (count >= P) return true; // already cooked enough
            }
        }

        return count >= P;
    }
}*/

/*package lec11;
import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();   // input number
        System.out.println(sqrt(x));
    }
    public static long sqrt(long x){
        if(x==0 || x==1){
            return x;
        }
        long lo =1;
        long hi = x;
        long ans = 0;
        while(lo<=hi){
            long mid = (lo+hi)/2;
            if(mid <= x/mid){
                ans = mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
}*/
/*package lec11;
import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Call function
        if (isUpperTriangular(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //  Function to check lower triangular
    public static boolean isUpperTriangular(int[][] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) { // check above diagonal
                if (arr[i][j] != 0) {
                    return false;   // directly return
                }
            }
        }
        return true;
    }
}*/
/*package lec11;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        // Read matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int colindex = -1;
        for(int j=0; j<N; j++){
            int sum =0;
            for(int i=0; i<N; i++){
                sum+=mat[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
                colindex = j+1;
            }
        }
        System.out.println(colindex + " " + maxSum);
    }
}*/

/*package lec11;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();  // rows
        int n = sc.nextInt();  //cols
        int[][] mat = new int[m][n];

        // Read input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Step 1: Mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Modify matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }
        }

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

package lec11;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int index = search(arr, target);
        System.out.println(index);
    }

    static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;

            // Check if left half is sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Otherwise right half is sorted
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}






































// import java.util.*;

// public class PainterPartitionEasy {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int K = sc.nextInt();   // number of painters
//         int N = sc.nextInt();   // number of boards
//         int[] boards = new int[N];

//         int maxBoard = 0;
//         long sum = 0;
//         for (int i = 0; i < N; i++) {
//             boards[i] = sc.nextInt();
//             maxBoard = Math.max(maxBoard, boards[i]);
//             sum += boards[i];
//         }

//         long low = maxBoard;   // at least the largest board
//         long high = sum;       // at most all boards by one painter
//         long ans = high;

//         // Binary search loop
//         while (low <= high) {
//             long mid = (low + high) / 2;

//             if (canPaint(boards, K, mid)) {
//                 ans = mid;         // feasible, try smaller time
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;     // not feasible, need more time
//             }
//         }

//         System.out.println(ans);
//     }

//     // Greedy check if we can paint all boards with maxTime = limit
//     static boolean canPaint(int[] boards, int k, long limit) {
//         long curr = 0;
//         int painters = 1;

//         for (int b : boards) {
//             if (curr + b <= limit) {
//                 curr += b;
//             } else {
//                 painters++;
//                 curr = b;
//                 if (painters > k) return false; // too many painters needed
//             }
//         }
//         return true;
//     }
// }


