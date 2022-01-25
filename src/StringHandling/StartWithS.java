/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;
import java.util.*;
public class StartWithS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name[]=new String[5];
        System.out.println("enter the 5 name");
        for(int i=0;i<5;i++){
            
            
            name[i]=input.next();
        }
        System.out.println("the name starts with s is ");
        for(int i=0;i<5;i++){
            
            if(name[i].startsWith("s")){
                System.out.println(name[i]);
                
            }
        }
    }
    
}
