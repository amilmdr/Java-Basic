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
public class Greatestarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the 10 integer number");
        int i,max=0;
        int a[]= new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=input.nextInt();
      
        }
        for(i=0;i<10;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                
            }
            
        }
        System.out.println("the greatest number is "+max);
    }
    
}
