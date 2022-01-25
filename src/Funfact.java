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
public class Funfact {
    static int fact(int n)
      {
        int fact = 1;
        int i;
        for(i=1;i<=n;i++)
        {
        fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n= input.nextInt();
        System.out.println("factorial= " + fact(n));
    }
    
}
