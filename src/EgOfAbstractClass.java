/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
abstract class Pperson{
    String firstName,lastName;
    int age;
    Pperson(String f,String l,int a){
        firstName=f;
                lastName=l;
                age=a;
    }
    abstract void showInfo();  
}
class Student1 extends Pperson{
   String faculty;
   Student1(String f,String l,int a,String fc){
       super(f,l,a);
       faculty=fc;
       
   }
   void showInfo(){
       System.out.println("name= "+firstName);
       System.out.println("lastnam= "+lastName);
       System.out.println("age= "+age);
       System.out.println("faculty="+faculty);
   }  
}
class Teacher extends Pperson{
   double salary;
   Teacher(String f,String l,int a,double s){
       super(f,l,a);
       salary=s;
   }
    void showInfo(){
        System.out.println("name= "+firstName);
       System.out.println("lastnam= "+lastName);
       System.out.println("age= "+age);
       System.out.println("salaey= "+salary);
        
    }
}
public class EgOfAbstractClass {
    public static void main(String[] args) {
        Pperson p1=new Student1("amil","manandhar",18,"management");
        p1.showInfo();
        Pperson p=new Teacher("amil","manandhae",18,6500);
        p.showInfo();
        
    }
    
}
