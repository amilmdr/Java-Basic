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
public class Switchcheck {
    public static void main(String[]args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int r=n%2;
      switch(r)
      {
          case 0:
          {
              System.out.println("the given number is even");
              break; 
          }
          case 1:
          {
              System.out.println("the given number is odd");
              break;
          }
   
              
          
      }
    }
    
}
