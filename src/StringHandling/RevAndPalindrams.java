/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;
import java.util.*;
public class RevAndPalindrams {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String w=input.next();
String rev="";



for(int i=w.length()-1;i>=0;i--){
char ch=w.charAt(i);
rev=rev+ch;
}
        System.out.println("the reverse is :"+rev);
        
        if(rev.equalsIgnoreCase(w)){
            System.out.println("the given word is palindram");
        }
        else{
            System.out.println("not a palindram");
        }
        

    }
    
    
}
