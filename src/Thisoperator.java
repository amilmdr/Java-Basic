/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
 class PersonI{
    private int id;
    private String  name;
    private double salary;
     public void setinfo( int id,String name,double salary)
     {
       this.id=id;
       this.name=name;
       this.salary=salary;
         
     }
     public void showinfo()
     {
       System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
     }
    
}
public class Thisoperator {
    public static void main(String[] args) {
        
       PersonI p=new PersonI();
       p.setinfo(101,"ram",25000);
       p.showinfo();
       PersonI p1=new PersonI();
       p1.setinfo(102,"amil",26000);
       p1.showinfo();
               
       
    }
    
}