// importan qs 

package exceptionhandling;
class MyException extends Exception{
    //if we make runtimeException  then try and catch are not required............
    MyException(String msg){
        super(msg);  
    }
}
public class Test {
    public static void main(String[] args) {
        double a=5,b=100000000;
        double c=a/b;
        if(c<0.00010){
            try{
                
                
                MyException ob=new MyException("Number is too small");
                throw ob;
            }
            catch(MyException ex){
                System.out.println(ex);
            }
        }
        
    }
}
