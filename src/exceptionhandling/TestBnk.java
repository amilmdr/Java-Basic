package exceptionhandling;
class CitizensBank{
    private String custID, custName, accNo;
    private double balanceAmt;
    public void setCustomerDetails(String custID,String custName,String accNo,double balanceAmt){
        this.custID=custID;
        this.custName=custName;
        this.accNo=accNo;
        this.balanceAmt=balanceAmt;
    }
    public void showCustomerDetails()
    {
        System.out.println("Name= " + custName);
        System.out.println("Customer Id= " + custID);
        System.out.println("Account no= " + accNo);
        System.out.println("Balance= " + balanceAmt);
    }
    public void deposit(double amount){
        balanceAmt+=amount;
        System.out.println("Rs " + amount + " deposited");
        System.out.println("New balance= " + balanceAmt);
    }
    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(balanceAmt>=amount){
            balanceAmt-=amount;
            System.out.println("Rs " + amount + " withdrawn");
            System.out.println("New balance = " + balanceAmt);
        }
        else{
            throw new InsufficientBalanceException ("Not enough balance");
        }
    }
}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
public class TestBnk {
    public static void main(String[] args) {
    CitizensBank b = new CitizensBank();
    b.setCustomerDetails("101","Ram","11",5000);
    b.showCustomerDetails();
    b.deposit(12000);
    try{
    b.withdraw(300);
    }
    catch (InsufficientBalanceException ee){
        System.out.println(ee);
    }
}
}
