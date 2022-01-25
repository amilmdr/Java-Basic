//creating thread by extending thread class
package Multithreading;
class AAA extends Thread{
 @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
            if(i==5){
                stop();
            }
        }
    }
}
class BBB extends Thread{
 @Override
 public void run(){
     for(int j=1;j<=10;j++){
         System.out.println("j="+j);  
          if(j==5){
                stop();
          }
 }
 }   
}
 public class StopThread {
    public static void main(String[] args)
    {
        A t1=new A();
        B t2=new B();
        t1.start();
        t2.start();
        
    }
}

