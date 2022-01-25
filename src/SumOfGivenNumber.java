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
public class SumOfGivenNumber {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
        int r,s=0;
        while(n!=0)
        {
            r=n%10;
            System.out.println("the r is "+r);
            s=s+r;
            n=n/10;
        }
        System.out.println("the some of the given number is "+s);
    }
    
}

