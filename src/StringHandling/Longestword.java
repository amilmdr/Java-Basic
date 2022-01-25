/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;
import java.util.*;
public class Longestword {
    public static void main(String[] args) {
        
  
 Scanner input=new Scanner(System.in);
        System.out.println("enter 3 string words");
 String a=input.next();
 String b=input.next();
 String c=input.next();
 
 
 
 int s=a.length();
 int s1=b.length();
 int s2=c.length();
if(s>s1&&s>s2){
            System.out.println("s is greater:" + a);
}
else if(s1>s&&s1>s2){
   System.out.println("s1 is greater:" + b);
   
}
else{
    System.out.println("s2 is greater:" + c);
}                       
   }
}
