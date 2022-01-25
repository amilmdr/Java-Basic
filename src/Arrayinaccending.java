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
public class Arrayinaccending {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the 10 integer number");
        int a[]=new int[10];
        int i,j,temp;
        for(i=0;i<10;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
            System.out.print(a[i]+ "\t");
        }
        
    }
    
}
