
package exceptionhandling;
import java.util.*;
public class Exc2 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int a=input.nextInt();
        try{
            int b=10/(a-2);
            System.out.println("b="+b);
            int m[]={1,2,3,4,5};
            
            
            System.out.println(m[a]);       
        }
       catch(ArithmeticException ex){
           System.out.println("divide by 0");
       }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("invalit arrey index");
        }
    }
    
}
