
public class W7q1 {
    public static void main(String[] args) {
      
        int a[] = {2, 3, 4, 10, 40};  
        int x = 4;  
      
        int lb = 0;
        int ub = a.length - 1;
        boolean IsFound = false ;
        
        while (lb<= ub) {
            int m =  (ub - lb) / 2; 

            if (a[m] == x) {
                IsFound = true;
                System.out.println("Element found at index: " +m);
                break;
            }
            
           if (a[m] < x) {
                lb = m + 1;
            } 
            else{
                ub = m - 1;
            }
        }
        if (IsFound==false) {
            System.out.println("Element not found in the array");
        } 
      }
    }



