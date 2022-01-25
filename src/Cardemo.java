/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class Car{
    private String model,color;
    private double price;
    Car() //constructor
    {
        model="Scorpio";
        color="white";
        price=5000000;
        
    }
        
void showinfo()
{
    System.out.println("model:" +model);
    System.out.println("color:" +color);
    System.out.println("price:"+price);
}
    
    
    
}
public class Cardemo {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.showinfo();
        
        
        
        
        
        
        
        
    }
    
}
