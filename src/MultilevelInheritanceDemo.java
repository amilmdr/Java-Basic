/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class L1{
   int length;
   void setLength(int l){
       length=l;
   }
}
   class B2 extends L1{
       int breadth;
       void setbreadth(int b){
           breadth=b;
       }
   }
       class H1 extends B2{
           int height;
           void setHeight(int h){
               height=h;
           }
          void volum(){
              System.out.println("volum:"+(length*breadth*height));
          } 
       }
 
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        H1 ob=new H1();
        ob.setLength(2);
        ob.setbreadth(3);
        ob.setHeight(3);
        ob.volum();
        
    }
    
}
