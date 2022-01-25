package StringHandling;
import java.util.*;
public class ContainA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 name ");
        String s[]=new String[5];
       for(int i=0;i<5;i++){
             s[i]=input.next();
    }
       for(int i=0;i<5;i++){
           if(s[i].contains("a"))
               System.out.println(s[i]);
       }
    
}
}
