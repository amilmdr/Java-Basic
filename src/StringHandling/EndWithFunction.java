package StringHandling;
import java.util.*;
public class EndWithFunction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 name");
        String s[]=new String[5];
        for(int i=0;i<5;i++){
           s[i]=input.next();
          
        }
         System.out.println("ends with vowel");
        for(int i=0;i<5;i++){
           
            if(s[i].endsWith("a")||s[i].endsWith("e")|| s[i].endsWith("i")||s[i].endsWith("0") ||s[i].endsWith("u")){
                System.out.println(s[i]);
    }
    
}
    }
}
