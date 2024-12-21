
public class W7q4 {
    public static void main(String[] args) {
        String s = "EYE";
         int len = s.length();
          boolean IsPalindrome = true ;
          
           for(int i= 0;i<=len-1;i++){
               if(s.charAt(i)!=s.charAt(len-i-1))
                   IsPalindrome = false;
                     break; }
                 
            if(IsPalindrome)
                System.out.println("Palindrome ");
            else 
        System.out.println("Not a Plindrome ");
    }

}
