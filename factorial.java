
import java.util.Scanner;

public class W7q5 {
    public static int fact(int n){
           if(n==0)
               return 1;
           else
               return n*fact(n-1);
       }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

}
