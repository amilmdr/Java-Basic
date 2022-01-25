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
public class Greatestnumber 
{
    static int number(int a[])
    {
           int g=a[0];
        for(int m:a)
        {
            if(m>g)
            {
                g=m;
            }
        }
        return g;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of n");
        int a[]= new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            a[i]=input.nextInt();
        }
    System.out.println("the greatest number is " + number(a));
    }
}