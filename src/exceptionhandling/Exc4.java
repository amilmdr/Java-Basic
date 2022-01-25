
package exceptionhandling;
import java.util.*;

class MyException1 extends Exception
{
    MyException1(String msg)
    {
        super(msg);
    }
}
class A
{
    void abc() throws MyException1
    {
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=a/b;
        if(c<0.005)
        {
            MyException1 ob=new MyException1("number is to small");
            throw ob;
            //throw new myMyException1("number is small");
        }
        else
        {
            System.out.println("c="+c);
        }
    }
}
public class Exc4 
{
    public static void main(String[] args)
    {
        A ob=new A();
       // should be put into try  ob.abc();
        try
        {
            ob.abc();
        }
        catch(MyException1 ex)
        {
            System.out.println(ex);
        }
    }
 
}
