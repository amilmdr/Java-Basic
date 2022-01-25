/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
public class Pattern3 {
    public static void main(String[] args) {
    
        
        
        for(int i=1;i<=7;i=i+2) 
        {
            for(int k=7;k>i;k-=2)
            {
                System.out.print(" ");
            }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
            System.out.println("");
        }
            
    }
}
   
        