/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class Shape{
double dim1,dim2;
Shape(double d1,double d2){
    dim1=d1;
    dim2=d2;
}
void area(){
    System.out.println("Area of shape undefined");
}
}
class Rectangle extends Shape{
    Rectangle(double d1,double d2)
    {
        super(d1,d2);
    }
    void area(){
        double a=dim1*dim2;
        System.out.println("Area of triangle:"+a);
    }
}
class Triangle extends Shape{
    Triangle(double d1,double d2)
    {
        super(d1,d2);
    }
    void area(){
        double b=0.5*dim1*dim2;
        System.out.println("Area of triangle:"+b);
    }
}
public class MethodOverridingImp {
    public static void main(String[] args) {
        Rectangle oj=new Rectangle(4.5,2.1);
        oj.area();
      Triangle ob=new Triangle(4.5,5.5);
        ob.area();
    }
}
