/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class L{
    int length;
    void setLength(int l){
        length=l;
    }
    
}
class B extends L{
    int breadth;
    void setBreadth(int b){
        breadth=b;
    }
    void area(){
        System.out.println("area:"+length*breadth);
    }
}
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        B obj=new B();
        obj.setLength(5);
        obj.setBreadth(6);
        obj.area();
        
    }
    
}
