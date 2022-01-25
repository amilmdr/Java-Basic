package Multithreading;
class Bank{
    double balanceamount;
    public  synchronized void deposit(double amount){
        double newbalance=balanceamount+amount;
        balanceamount=newbalance;
        System.out.println("balace amount is"+balanceamount);
    }
}
class TA extends Thread{
    Bank ob;
    TA(Bank ba){
        ob=ba;
    }
    public void run(){
        synchronized(ob){
            ob.deposit(45000);//synchronized block statement
        }
        //ob.deposit(4500);//synchronized method
    }
}
class TB extends Thread{
    Bank ob;
    TB(Bank ba){
        ob=ba;
    }
    public void run(){
        synchronized(ob){
            ob.deposit(45000);//synchronized block statement
        }
      //  ob.deposit(5000);
    }
}
public class synchronizedDemo {
    public static void main(String[] args) {
        Bank ob=new Bank();
        TA t1=new TA(ob);
        TB t2=new TB(ob);
        t1.start();
        t2.start();
    }
    
}
