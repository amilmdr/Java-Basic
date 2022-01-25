/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class Calculate{
    static void sum(int a,int b){
        System.out.println("Sum ="+a+b);  
    }
}
public class StaticmethordDemo {
    public static void main(String[] args) {
        Calculate.sum(20, 40);
    }
}
