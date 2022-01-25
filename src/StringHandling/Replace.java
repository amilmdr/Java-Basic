
package StringHandling;
import java.util.*;
public class Replace {
    public static void main(String[] args) {
        
  
    Scanner input=new Scanner(System.in);
        System.out.println("enter the string");
        
        
    String a=input.nextLine();
    String b=a.replace("o", "a");
        System.out.println("replace ment is:"+b);
        
        //for 10 input
        String c[]=new String [10];
        String d[]=new String [10];
        System.out.println("enter 10 string");
        for(int j=0;j<10;j++){
             c[j]=input.next();
        }
        System.out.println("replacement is ");
        for(int j=0;j<10;j++){
          d[j]=c[j].replace("i","!");
            System.out.println(d[j]);
        }
    }
}
