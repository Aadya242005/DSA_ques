/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =5;
        int star =5;
        int row =1;
        int space =-1;
        while(row<=(n/2) +1){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;

            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            

            if(row<=(n/2)+1){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            System.out.println();
            row++;
           
        }

    }
    
}*/
/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =4;
        int star =1;
        int row =1;
        int space =n-1;
        int val =1;
        
        while(row<=n){
             
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
              
            }
            
            int i=1;
            while(i<=star){
                System.out.print(val +" ");
                i++;
                val++;

            }
           
            System.out.println();
            row++;
            star+=2;
            space--;  
        }
    } 
}*/

/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =5;
        int star =1;
        int row =1;
        int space =n/2;      //2
        while(row<=n){
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
              
            }
            int i=0;
            while(i<star){
                System.out.print("* ");
                i++;
            
            }
            if(row< n/2+1 ){
                star+=2;
                space--;
            }else{
                star-=2;
                space++;
            }
            System.out.println();
            row++;
        
        }
    } 
}*/

/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =4;
        int star =1;
        int row =1;
        int val =1;
        
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print(val +" ");
                i++;
                val++;

            }
           
            System.out.println();
            row++;
            star++;
            
        }
    } 
}*/
/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =5;
        int star =5;
        int row =1;
        int space =n-1;
        
        while(row<=n){  
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
              
            }
            
            int i=1;
            while(i<=star){
                if(i==1 || i==n || row==1 || row==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
                i++;

            }
           
            System.out.println();
            row++;
            
            space--;  
        }
    } 
}*/


/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =3;
        int star =1;
        int row =1;
        int space =n-1;
        int val =1;
        while(row<=2*n-1){  
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int i=1;
            while(i<=star){
                System.out.print(val+" ");   
                val++;
                i++;
            }
            if(row<n){
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }
           
            System.out.println();
            row++; 
        }
    } 
}*/

/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =5;
        int star =1;
        int row =1;
        int val =1;
        while(row<=n){  
            int i=1;
            while(i<=star){
                System.out.print(val+" ");   
                val++;
                i++;
            }
            System.out.println();
            row++; 
            star++;
        }
    } 
}*/

/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =4;
        int star =1;
        int row =1;
        int val =1;
        while(row<=n){  
            int i=1;
            while(i<=star){
                System.out.print(val+" ");   
                val++;
                i++;
            }
            System.out.println();
            row++; 
            star++;
        }
    } 
}*/

/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =4;
        int star =1;
        int row =1;
        int space = n+1;
       
        while(row<=n){  
            int val1 =1;
            int i=1;
            while(i<=star){
                System.out.print(val1+" ");   
                val1++;
                i++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int val2 =star;
            int k =1;
            if(row==n){
                k=2;
            }
            while(k<=star){
                System.out.print(val2+" ");
                k++;
                val2--;
                
            }
            System.out.println();
            row++; 
            star++;
            space-=2;
        }
    } 
}*/


/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =5;
        int star =5;
        int row =1;
        int space = -1;
       
        while(row<=2*n-1){  
            int i=1;
            while(i<=star){
                System.out.print("*");   
                i++;
            }
            int j =1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k =1;
            if(row==2*n-1 || row==1){
                k=2;
            }
            while(k<=star){
                System.out.print("*");
                k++;
            }
            if(row<n){
                space+=2;
                star--;
            }else{
                space-=2;
                star++;
            }
    
            System.out.println();
            row++; 
        }
    } 
}*/

/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =7;
        int star =1;
        int row =1;
        int space = -1;
        int space1 = n-1;
        
       
        while(row<=n){ 
            int z=1;
            while(z<=space1){
                System.out.print("  ");
                z++;
            }
            int val =1;
            int i=1;
            
            while(i<=star){
                System.out.print(val+" ");   
                i++;
                val++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;
            int val2 =1;
            if(row==1 || row == n){
                k=2;
            }
            while(k<=star){
                System.out.print(val2+ " ");
                k++;
                val2++;
            }
            if(row<=n/2){
                space+=2;
                star++;
                space1-=2;
            }else{
                space-=2;
                star--;
                space1+=2;
            }
            System.out.println();
            row++; 
        }
    } 
}*/

/*package lec5;

public class demo {
    public static void main(String[] args) {
        int n =6;
        int star =1;
        int row =0;
       
        while(row<n){
            int val=1;
            int i=0;
            while(i<star){
                System.out.print(val+ " "); 
                val = ((row -i)*val)/(i+1);
                i++;
            }
    
            System.out.println();
            row++; 
            star++;
        }
    } 
}*/

/*package lec5;

public class Pascal_tri {
    
    public static void main(String[] args) {
        int n = 5; 
        int row =1;
        int star = 1;
       
        int space = 2*n-1;

        while(row<=2*n+1){
            int i=1;
            int val =1;
            while(i<=star){
                System.out.print(val+ " ");
                i++;
                val++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;

            }
            int k =1;
             int val1 =1;
            while(k<=star){
                System.out.print(val1+ " ");
                k++;
                val1++;
            }
            if(row<n){
                space-=2;
                star++;
            }
            else{
                space+=2;
                star--;
            }
            
            row++;
            
            System.out.println();

        } 
    }
}*/


package lec5;

public class demo {
    
    public static void main(String[] args) {
        int n = 5; 
        int row =1;
        int star = 11;
        int space = 2*n-1;

        while(row<=2*n+1){
            int i=1;
            int val =1;
            while(i<=star){
                System.out.print(val+ " ");
                i++;
                val++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;

            }
            int k =1;
             int val1 =1;
            while(k<=star){
                System.out.print(val1+ " ");
                k++;
                val1++;
            }
            if(row<n){
                space-=2;
                star++;
            }
            else{
                space+=2;
                star--;
            }
            
            row++;
            
            System.out.println();

        } 
    }
}
