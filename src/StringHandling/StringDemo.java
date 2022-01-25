/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

/**
 *
 * @author amil
 */
public class StringDemo {
    public static void main(String[] args) {
        
        
        String s=new String();
        System.out.println("value of s :"+s);
        char str[]={'a','b','c','d'};
        String s1=new String(str);
        System.out.println("value of s1:"+s1);
        char str1[]={'a','b','c','d'};
        String s2=new String(str1);
        System.out.println("value of s2:"+s2);
        char str2[]={'a','b','c','d'};
        String s3=new String(str2,2,2);
        System.out.println("value of s3:"+s3);
        char str3[]={'a','b','c','d'};
        String s4=new String(str3);
        String s5=new String(s4);
        System.out.println("value of s5:"+s5);  
        byte str4[]={65,66,67,68,69,70};
        String s6=new String(str4);
        System.out.println("value of s6:"+s6);
        byte str5[]={65,66,67,68,69,70};
        String s7=new String(str5,2,3);
        System.out.println("value of s7:"+s7);
        String s8="abc";
        System.out.println("value of s8"+s8);
        
        
        
        
        
    }
    
}
