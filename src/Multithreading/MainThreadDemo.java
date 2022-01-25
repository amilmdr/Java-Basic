package Multithreading;
public class MainThreadDemo {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("main thread name" +t.getName());
        System.out.println("priority of main  thread"+t.getClass());
        t.setName("my new thread");
        t.setPriority(10);
        System.out.println("main  thread name "+t.getName());
        System.out.println("priority of main  thread"+t.getPriority());
        for(int i=1;i<=10;i++){
            System.out.println("i"+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                System.out.println(ex);
                
            }
        }
    }
       
    
}
