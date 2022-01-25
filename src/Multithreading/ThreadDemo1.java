package Multithreading;
class AA implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
        } }}
class BB implements Runnable{
 public void run(){
     for(int j=1;j<=10;j++){
         System.out.println("j="+j);  
 }
 }   
}
class CC implements Runnable{
 public void run(){
     for(int k=1;k<=10;k++){
         System.out.println("k="+k);  
 }
 }   
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        AA ob1=new AA();
        BB ob2=new BB();
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
        new Thread (new CC()).start();
        //new Thread (new AA()).start);
        //new Thread (new BB()).start();
    }
}
 
