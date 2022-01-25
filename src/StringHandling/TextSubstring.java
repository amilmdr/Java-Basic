package StringHandling;
import java.util.*;
public class TextSubstring {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enetr the String ");
        String s=input.nextLine();
        String t=input.nextLine();
        String s1=s.substring(3);
        System.out.println(s1);
        String s2=s.substring(3,8);
        System.out.println(s2);
        String t1=s+t;//for concat
        System.out.println(t1);
      String c=s2.concat(t1);
        
        
        
        
    }
}
