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
public class Multidimentional {

    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the valur in [2][3]matrix");
        int a[][]=new int[2][3];
        int i,j,sum=0;
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
                
        for(int[] m:a)
        {
            for(int p:m)
            {
                sum=sum+p;
            }
        }
        System.out.println("the sum is "+sum);
        
    }
    
    
}

