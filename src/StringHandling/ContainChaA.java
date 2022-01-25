package StringHandling;
import java.util.*;
public class ContainChaA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 name ");
        String s[]=new String[5];
       for(int i=0;i<5;i++){
             s[i]=input.next();
       }
        System.out.println("the person name that contain a is:");
        for(String m:s){
            for(int i=0;i<m.length();i++){
                char c=m.charAt(i);
                if(c=='a'){
                    System.out.println(m);
                    break;
                    
                }
               
                
            }
        }
    }
    
}
