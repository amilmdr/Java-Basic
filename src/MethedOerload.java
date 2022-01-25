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
public class MethedOerload {
    static void test()
    {
        System.out.println("hello");
    }
    static void test(String m)
    {
        System.out.println(m); 
    }
    static int test (int a)
    {
        return a*a;
    }
    public static void main(String[] args) {
        
        test();
        test("hi");
        System.out.println(test(5));
        
    }
    
}
