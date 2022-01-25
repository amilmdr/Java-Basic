
package Multithreading;

import static java.lang.Thread.sleep;

class Factorial extends Thread{
        public void run(){
        for(int i=1;i<500;i++){
            if(500%i==0){
                System.out.println(i);
            }
            try{
              sleep(100);
            }
            catch(InterruptedException ex){
                System.out.println(ex);
                
            }
        
    }
    }
        
    }
public class EgOfThreadPriority {
    public static void main(String[] args) {
        Factorial f=new Factorial();
        f.start();
    }
    
    
}
