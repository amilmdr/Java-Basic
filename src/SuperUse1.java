/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class LL{
    int length;
    LL(int l){
        length=l;
    }
}
class BB extends LL{
    int breadth;
    BB(int l,int b)
    {
        super(l);//super must be call first 
        breadth=b;
    }
    void area(){
        System.out.println("area:"+length*breadth);
    }
}
public class SuperUse1 {
    public static void main(String[] args) {
        BB obj=new BB(5,4);
        obj.area();
    }
    
}
