/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
public class Varargs {
    static void test(int...n)
    {
        for(int y:n)
        {
            System.out.print(y + " \t");
            
        }
       System.out.println();
        
    }
    public static void main(String[] args) {
        test(1,2,3,4);
        test(5,6,7,8,9,10);
    }
    
}
