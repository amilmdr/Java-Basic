/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class AAA{
    void test(){
        System.out.println("Inside AAA");
    }
}
    class BBB extends AAA{
        void test(){
            System.out.println("Inside BBB");
            super.test();
        }
    }
public class MethodOvrridingDemo {
    public static void main(String[] args) {
        BBB oj=new BBB();
        oj.test();
    }
 
}
