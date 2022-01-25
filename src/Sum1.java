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
public class Sum1 {
    static void sum(int a, int b){
      int c=a+b;
        System.out.println("sum "+c);
    }
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.println("enter the two number");
        int a=input.nextInt();
        int b=input.nextInt();
        sum(a,b);
      }
    }
