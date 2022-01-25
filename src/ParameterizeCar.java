/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class Car1{
    private String model,color;
    private double price;
    Car1(String m,String n, double p) //constructor
    {
        model=m;
        color=n;
        price=p;
        
    }
        
void showinfo()
{
    System.out.println("model:" +model);
    System.out.println("color:" +color);
    System.out.println("price:"+price);
}
}
public class ParameterizeCar {
    public static void main(String[] args) {
        Car1 myCar=new Car1("bmw","blue",7000000);
         myCar.showinfo();
        Car1 myCar1=new Car1("a","b",500000);
        myCar1.showinfo();
        
    
}}
