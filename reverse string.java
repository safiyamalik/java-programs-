
import java.util.Scanner;

        
public class w7q3 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        String r = " ";
        int l = s.length();
        
        for(int i =0;i<l;i++)
        {
             r = s.charAt(i)+ r;
        }                
            System.out.println("Reverse of string is : "+r); 
    }

}
