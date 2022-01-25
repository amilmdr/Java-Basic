/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */

class Person{
    
    private int id;
    private String  name;
    private double salary;
     public void setinfo()
     {
       id=101;
       name="ram";
       salary=3500;
         
     }
     public void showinfo()
     {
       System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
     }
    
}
public class Classandobj {
    public static void main(String[] args) {
        
       Person p=new Person();
       p.setinfo();
       p.showinfo();
    }
    
}
