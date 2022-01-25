/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack1;

/**
 *
 * @author amil
 */
public class Customer {
    int currentUnits,previousUnit;
    
    
 public Customer(int cU,int pU){
    currentUnits=cU;
            previousUnit=pU;
    
}
   public double getTotal(){
      return(currentUnits-previousUnit)*12;
  }
    
}
