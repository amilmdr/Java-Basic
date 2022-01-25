/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
import java.util.*;
public class MinuDrivent {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("enter the valu of a and b");
               double a=input.nextInt();
               double b=input.nextInt();
        System.out.println("enter the choice 1 for add 2 for sub 3 for mul 4 for div");
        int c=input.nextInt();
         
        switch(c){
            case 1: 
               double d=a+b;
                System.out.println("Add"+d);
               break;
            case 2:
               double d1=a-b;
                System.out.println("sub "+d1);
               break;
                case 3: 
               double d2=a*b;
                System.out.println("Add"+d2);
               break;
            case 4:
               double d3=a/b;
                System.out.println("sub "+d3);
               break;
               default:
               System.out.println("wrong choice");
               break;
               
               
        }
    }
    
}
