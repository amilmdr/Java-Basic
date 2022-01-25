
package Multithreading;
class Reverse extends Thread{
    public void run(){
        for(int n=1000;n<=2000;n++){
            int s=0,a=n;
            while(a!=0){
                int r=a%10;
                s=s*10+r;
                a=a/10;
            }
            if(s==n){
                System.out.println(n);
                try{
                    sleep(1000);
                }
                catch(InterruptedException ex){
                    System.out.println(ex);
                }
            }
        }
    }
}

public class Eg2Thread {
    public static void main(String[] args) {
        Reverse p=new Reverse();
        p.start();
    }
    
}
