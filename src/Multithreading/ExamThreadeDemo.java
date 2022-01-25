
package Multithreading;
class Even extends Thread{
    public void run(){
     
    for(int i=1;i<=100;i++){
    if(i%2==0){
        System.out.println("even number="+i);
    }
}
    }  
}
class Odd extends Thread{
    public void run(){
     
    for(int j=500;j<=600;j++){
    if(j%2!=0){
        System.out.println("odd number="+j);
    }
}
    }  
}

public class ExamThreadeDemo {
    public static void main(String[] args) {
        Even t1=new Even();
        Odd t2=new Odd();
        t1.start();
        t2.start();
    }
    
    
}
