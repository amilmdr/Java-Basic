/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class Vehicle{
    int numSeats;
    int numWheels;
    String engineType;
    double price;
    Vehicle(int n,int w,String e,double p){
        numSeats=n;
        numWheels=w;
        engineType=e;
        price=p;   
    }
    void showDetail(){
        System.out.println("numSeats "+numSeats);
        System.out.println("numWheels "+numWheels);
        System.out.println("engineType "+engineType);
        System.out.println("price "+price);
    }
    
}
interface TaxtInfo{
    double getTax();
    double priceIncludingTax();
}
class Car2 extends Vehicle implements TaxtInfo{
    Car2(int n,int w,String e,double p){
    super(n,w,e,p);
    }
    public double getTax(){
        double c;
        c=0.15*price;
      return c;  
    }
    public double priceIncludingTax(){
        double d;
        d=0.15*price+price;
      return d;  
    }
}
class Bike extends Vehicle implements TaxtInfo{
    Bike(int n,int w,String e,double p){
    super(n,w,e,p);
    }
    public double getTax(){
        double c;
        c=0.12*price;
      return c;  
    }
    public double priceIncludingTax(){
        double d;
        d=0.12*price+price;
      return d;  
    }
}

public class MultipleInheritanceGgDemo {
    public static void main(String[] args) {
        Car2 oj=new Car2(6, 4, "petrol", 800000.00);
        System.out.println("car price"+oj.getTax());
        System.out.println("prine include tas"+oj.priceIncludingTax());
        oj.showDetail();
        Bike oj1=new Bike(2, 2, "petrole", 800000.00);
        System.out.println("car price"+oj1.getTax());
        System.out.println("prine include tas"+oj1.priceIncludingTax());
        oj.showDetail();
        
        
    }
    
}
