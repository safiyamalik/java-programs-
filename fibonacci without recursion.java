
import java.util.Scanner;

public class W7q6_without_recursion {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term in fabonacci series : ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        
        for(int i=1;i<=n;i++){
            if(i==1)
            {
            System.out.println(first+" ");    
            }
            else if(i==2){
            System.out.println(second+" ");    
            }
            else{
            int next = first+second;
            first = second;
            second = next;
        System.out.println(next+" ");
            }
        }
    }

}
