/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class CitizenBank1
{    private String custname,accno,custid;

    private double balanceamt;
    public void setcustomerdetail( String a,String b,String c,double d)
    {
        custid=a;
        custname= b;
        accno=c;
        balanceamt=d;   
    }
    public void showcustomerdetail()
    {
        System.out.println("custid;"+custid);
        System.out.println("custname;"+custname);
        System.out.println(" accno;" +accno);
        System.out.println("balanceamt;"+balanceamt);
    }
     public void deposit(double amount){
        balanceamt+=amount;
        System.out.println("Rs " + amount + " deposited");
        System.out.println("New balance= " + balanceamt);
    }
    public void withdraw(double amount)
    {
        if(balanceamt>=amount){
            balanceamt-=amount;
            System.out.println("Rs " + amount + " withdrawn");
            System.out.println("New balance = " + balanceamt);
        }
        else{
            System.out.println("Not enough balance");
        }
}
}
public class CitizensBank {
    public static void main(String[] args) {
        CitizenBank1 e=new CitizenBank1();
        e.setcustomerdetail("axm", "amil","2500ax",500000);
        e.showcustomerdetail();
        e.deposit(500000);
        e.withdraw(5000);
    }
}
