package exceptionhandling;
import java.util.*;
public class Exc3 {
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int a=input.nextInt();
          int num[] ={10,20,30,40,50,60};  
    System.out.println(num[7]); 
        try{
            int b=10/(a-2);
            System.out.println("b=" +b);
            try{
                int c=10/(a-5);
                System.out.println("C= "+c);
            int m[]={1,2,3,4,5};
            System.out.println(m[a]); 
            }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("invalit arrey index");
        }
        }//clear outer try
        catch(ArithmeticException ex){
           System.out.println("divide by 0");
    }   
}
}