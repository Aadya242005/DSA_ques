package lec2;

/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        
        int row =1;
        int star = 5;
        while(row <=n){
            int i =1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            row++;
            System.out.println();
        }
      
    }    
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        while(row <=n){
            int i =1;
            while(i<=row){
                System.out.print("*");
                i++;
                
            }
            row++;
            System.out.println();
        }
    }
} */  
/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star = 5;
        while(row <=n){
            int i =1;
            while(i<=star){
                System.out.print("*");
                i++;
                
            }
            row++;
            star--;
            System.out.println();
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star=1;
        int space = n-1; 
        while(row <=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;   
            }
            int j =1;
            while(j<= star){
                System.out.print("*");
                j++;
            }
            row++;
            space--;
            star++;
            System.out.println();
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star=5;
        int space =0;
        while(row <=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;   
            }
            int j =1;
            while(j<= star){
                System.out.print("*");
                j++;
            }
            row++;
            star--;
            space++;
            System.out.println();
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star=5;
        int space =0;
        while(row <=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;   
            }
            int j =1;
            while(j<= star){
                System.out.print("*");
                j++;
            }
            row++;
            star--;
            space+=2;
            System.out.println();
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star=5;
        while(row <=n){
            int j =1;
            while(j<= star){
                if(j==1 || j==star || row ==n || row == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            row++;
        
           
            System.out.println();
        }
    }
}*/
/*  8// public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star=2;
        int space = 2*n-3;
        while(row <=n){
            int j =1;
            while(j<= star){
                if(j==1 || j==star || row ==n || row == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            row++;
        
           
            System.out.println();
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star=1;
        int space = n-1;
        while(row <=n){
            int i =1 ;
            while(i<=space){
                System.out.print(" ");
                i++;

            }
            int j =1;
            while(j<= star){
                System.out.print("*"); 
                j++;
            }
            int k = 1;
            while(k<=space){
                System.out.print(" ");
                k++;
            }
            row++;
            System.out.println();
            star+=2;
            space--;    
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star=9;
        int space = 0;
        while(row <=n){
            int i =1 ;
            while(i<=space){
                System.out.print(" ");
                i++;

            }
            int j =1;
            while(j<= star){
                System.out.print("*"); 
                j++;
            }
            int k = 1;
            while(k<=space){
                System.out.print(" ");
                k++;
            }
            row++;
            System.out.println();
            star-=2;
            space++;    
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int m=5;
        int n =4;
        int row1 =1;
        int star1=1;
        while(row1 <=m){
            int i =1 ;
            while(i<=star1){
                System.out.print("*");
                i++;

            }
            row1++;
            System.out.println();
            star1++;
        }
        int row2 =1;
        int star = 4;
        while(row2 <=n){
            int j =1;
            while(j<= star){
                System.out.print("*"); 
                j++;
                
            
            }
            row2++;
            System.out.println();
            star--;
        }
      
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = 2*n-3;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j<=space ){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(row == n){
                k=2;
            }
            while(k<= star){
                System.out.print("* ");
                k++;
            }

            row++;
            System.out.println();
            star += 1; // Incrementing stars for the next row
            space -=2;
        }
    }
}*/

/*public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 5;
        int space = -1; // willot take zero (-1+2=1 , 3, 5,7 ...)
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j<=space ){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(row == 1){
                k=2;
            }
            while(k<= star){
                System.out.print("* ");
                k++;
            }

            row++;
            System.out.println();
            star -= 1; // Incrementing stars for the next row
            space +=2;
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        while (row <= 2*n-1) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            if(row<n){
                star++;
            }else{
                star--;
            }
            row++;
            System.out.println();             
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;
        while (row <= 2*n-1) {
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
           
            if(row<n){
                star++;
                space--;
            }else{
                star--;
                space++;
            }
            row++;
            System.out.println();             
        }
    }
}*/

/*public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 5;
        int space = n-1;
        while (row <= 2*n-1) {
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            if(row<n){
                star--;
                space--;
            }else{
                star++;
                space++;
            }
           
            
            row++;
            System.out.println(); 
                      
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int star = n/2;
        int space = 1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(row<=n/2){
                star--;
                space+=2;
            
            }else{
                star++;
                space-=2;

            }
            row++;
            System.out.println(); 
                      
        }
    }
}*/

/*public class Pattern {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int star = n/2 + 1;
        int space = -1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;
            if(row==1 || row==n){
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(row<=n/2){
                star--;
                space+=2;
            
            }else{
                star++;
                space-=2;

            }
            row++;
            System.out.println(); 
                      
        }
    }
}
*/
/*  public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;
        int val= 1;
        
        while (row <= n) {
             int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            
            int i = 1;
            while (i <= star) {
                System.out.print(val +" ");
                val++;
                i++;
               
            }
            row++;
            star+=2;
            space--;
            System.out.println(); 
                      
        }
    }
}*/

/*public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;
       
        
        while (row <= n) {
             int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            
            int i = 1;
            while (i <= star) {
                System.out.print(i +" ");
              
                i++;
               
            }
            row++;
            star+=2;
            space--;
            System.out.println(); 
                      
        }
    }
}*/
/*public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;
        while (row <= n) {
             int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int val= 1;
            int i = 1;
            while (i <= star) {
                System.out.print(val +" ");
                if(i<=star/2){
                    val++;
                }else{
                    val--;
                }
                i++;
               
            }
            row++;
            star+=2;
            space--;
            System.out.println(); 
                      
        }
    }
}*/

public class Pattern {
    public static void main(String[] args) {
        int n = 3;
        int row = 1;
        int star = 1;
        int space = n-1;
        int val= 1;
        while (row <= 2*n -1) {
             int j =1;
            while(j<=space){
                System.out.print(" \t");
                j++;
            }
            
            int i = 1;
            int p = val;
            while (i <= star) {
                System.out.print(p + "\t");
                if(i<=star/2){
                    p++;
                }else{
                    p--;
                }
                i++;
            }
            if(row< n){
                star+=2;
                space--;
                val++;
            }else{
                star-=2;
                space++;
                val--;
            } 
            row++;
            System.out.println();                   
        }
    
    }
}