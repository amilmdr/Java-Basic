
package exceptionhandling;

public class Exc1 {
     public static void main(String[] args) {
        int a=10,b=5;
        try{
        int c=a/(b-5);
        System.out.println(c);
        }
        catch(ArithmeticException ex){
            System.out.println("divide by zero");
            //or 
        }
        
        System.out.println("thank u");
     }
}
//program with exception handling