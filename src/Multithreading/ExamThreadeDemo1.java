package Multithreading;
class Even1 extends Thread{
    public void run(){ 
    for(int i=1;i<=100;i++){
    if(i%2==0){
        System.out.println("even number="+i);
        try{
          Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            System.out.println(ex);            
        } }}}} 
class Odd2 extends Thread{
    public void run(){
     
    for(int j=500;j<=600;j++){
    if(j%2!=0){
        System.out.println("odd number="+j);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        } } }} }
public class ExamThreadeDemo1 {
    public static void main(String[] args) {
        Even1 t1=new Even1();
        Odd2 t2=new Odd2();
        t1.start();
        t2.start();
    }
    
    
}
