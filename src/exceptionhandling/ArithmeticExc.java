/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;
import java.util.*;
public class ArithmeticExc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two  numbers");
        int a=input.nextInt();
        int b=input.nextInt();      
        int c;
        try{
            c=a/b;
            System.out.println("the difference is:"+c);
        }
        catch(ArithmeticException ex){
            System.out.println("the second number is 0");
        }
    }
    
}
