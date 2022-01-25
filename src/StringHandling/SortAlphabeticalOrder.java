package StringHandling;
import java.util.*;
public class SortAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s[]=new String[5];
        System.out.println("enter the 5 name");
        for(int i=0;i<5;i++){
            s[i]=input.next();
        }
        System.out.println("The alphabetical orde is:");
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++)
            {
                if(s[i].compareTo(s[j])>0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;                   
                } }              
            System.out.println(s[i]);
        }        
        System.out.println("The alphabetical orde is:");
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++)
            {
                if(s[i].compareToIgnoreCase(s[j])>0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;                   
                } }               
            System.out.println(s[i]);
        }
    }
}
  