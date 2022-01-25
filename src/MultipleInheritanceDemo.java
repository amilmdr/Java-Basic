/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
interface College{
    String cname="orchid";
    String addresh="Sinamangal";
    void showDetail();
    
}
class StudentOIC{
    String name;
    int age;
    String faculty;
    StudentOIC(String n,int a,String f){
        name=n;
        age=a;
        faculty=f;
    }
}
class OrchidStudent extends StudentOIC implements College{
    OrchidStudent(String n,int a,String f){ 
    super(n,a,f);
  
    }
      public void showDetail(){
          System.out.println("College name "+cname);
          System.out.println("College addresh "+addresh);
          System.out.println("Student name "+name);
          System.out.println("Student age "+ age);
          System.out.println("Student faculty "+ faculty);
      }
    
    
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        OrchidStudent oj=new OrchidStudent("amil",19,"management");
        oj.showDetail();
        
    }
    
}
