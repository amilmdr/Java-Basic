/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class Circle{
    double r;
    void setRedius(double redius){
        r=redius;
    }
}
class Area extends Circle{
    void area(){
        System.out.println("area:"+(3.14*r*r));
    }

}
class Perimeter extends Circle{
    void perimeter(){
        System.out.println("perimeter:"+(2*3.14*r));
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Area obj=new Area();
      obj.setRedius(7);
      obj.area();
      Perimeter p=new Perimeter();
      p.setRedius(6);
      p.perimeter();
    }
    
}
