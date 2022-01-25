/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
interface Product{
    String name="fan";
    double price=2500;
    void showProductInfo();
}
class ProductDemo implements Product{
     public void showProductInfo(){
         System.out.println("Product Name:"+name);
         System.out.println("price:"+price);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        ProductDemo oj=new ProductDemo();
        oj.showProductInfo();
    }
    
}
