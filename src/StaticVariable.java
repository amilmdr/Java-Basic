/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class AB{
      static int x=0;//in no static result is 111
     AB(){
        x++;
        System.out.println("no of objects:"+x);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        AB one=new AB();
        AB two=new AB();
        AB three=new AB();
        
        
    }
    
}
