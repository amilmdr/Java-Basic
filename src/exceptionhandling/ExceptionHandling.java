/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int a = input.nextInt();

        try {
            int b = 10 / (a - 2);
            System.out.println("b=" + b);
            try {
                int c = 10 / (a - 5);
                System.out.println("C= " + c);
                int m[] = {1, 2, 3, 4, 5};
                System.out.println(m[a]);
                try {
                    Object d[] = new Double[2];
                    d[0] = a;
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }

}
