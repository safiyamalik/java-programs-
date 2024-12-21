

import java.util.Scanner;

public class W7q6_withrecursion {
    public static int fibo(int n) {
        if (n <= 0) 
        return n;
        else if(n <= 1)
        return n;
        else
        return fibo(n - 1) + fibo(n - 2); 
    }
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term in fabonacci series : ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
         System.out.print(fibo(i) + " ");
    }
    }
}
