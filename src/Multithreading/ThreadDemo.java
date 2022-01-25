//creating thread by extending thread class
package Multithreading;
class A extends Thread{
    //run  method is the place where the tasks of thread should
    //be provided
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
        }
    }
}
class B extends Thread{
 public void run(){
     for(int j=1;j<=10;j++){
         System.out.println("j="+j);  
 }
 }   

}

public class ThreadDemo {
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        t1.start();
        t2.start();
        
    }
}
