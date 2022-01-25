/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
 abstract class Shape1{
double dim1,dim2;
 Shape1(double d1,double d2){
    dim1=d1;
    dim2=d2;
}
 abstract void area();
}
class Rectangle1 extends Shape1{
    Rectangle1(double d1,double d2)
    {
        super(d1,d2);
    }
    void area(){
        double a=dim1*dim2;
        System.out.println("Area of triangle:"+a);
    }
}
class Triangle1 extends Shape1{
    Triangle1(double d1,double d2)
    {
        super(d1,d2);
    }
    void area(){
        double b=0.5*dim1*dim2;
        System.out.println("Area of triangle:"+b);
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Rectangle oj=new Rectangle(4.5,2.1);
        oj.area();
      Triangle ob=new Triangle(4.5,5.5);
        ob.area();
    }
}

 myList.insertFirst(10);
        myList.insertFirst(20);
        myList.insertLast(30);
        myList.insertLast(40);
        myList.display();
        myList.deleteFirst();
        myList.display();