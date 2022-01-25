//creating thread by extending thread class
package Multithreading;
class A1 extends Thread{
    //run  method is the place where the tasks of thread should
    //be provided
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
        }
    }
}
class B1 extends Thread{
 public void run(){
     for(int j=1;j<=10;j++){
         System.out.println("j="+j);  
 }}}
public class ThreadPriority {
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        t1.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("thread one priority:" +t1.getPriority());
        System.out.println("thread two priority:" +t2.getPriority());
        t1.start();
        t2.start();
        
    }
}
