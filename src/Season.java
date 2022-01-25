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
public class Season {
    public static void main(String[] args) {
        System.out.println("enter any number to get season");   
       Scanner input=new Scanner(System.in);
       int a=input.nextInt();
       switch(a)
       {
           case 1:
           case 11:
           case 12:
               System.out.println("it is spring");
               break;
           case 2:
           case 3:
           case 4:
               System.out.println("it is summer");
               break;
           case 5:
           case 6:
           case 7:
               System.out.println("it is autum");
               break;
           case 8:
           case 9:
           case 10:
               
               System.out.println("it is winter");
               break;
           default :
               System.out.println("invalid option");
               break;
               
               
               
       
           
       }
    }
    
}
