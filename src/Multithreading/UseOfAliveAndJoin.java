package Multithreading;
class Even2 extends Thread{
    public void run(){ 
    for(int i=1;i<=100;i++){
    if(i%2==0){
        System.out.println("even number="+i);
    }}}}
class Odd1 extends Thread{
    public void run(){
     
    for(int j=500;j<=600;j++){
    if(j%2!=0){
        System.out.println("odd number="+j);
    }}}}
public class UseOfAliveAndJoin {
    public static void main(String[] args) {
        Even t1=new Even();
        Odd t2=new Odd(); 
        t1.start();
        t2.start();
        System.out.println("alive thread 1"+t1.isAlive());
        System.out.println("alive thread 2"+t2.isAlive());
                try{
        t1.join();
        t2.join();}
        catch(InterruptedException ex){
            System.out.println(ex);
        }
        System.out.println("alive thread 1"+t1.isAlive());
        System.out.println("alive thread 2"+t2.isAlive());
        System.out.println("thread ends...........");
    }
}
    