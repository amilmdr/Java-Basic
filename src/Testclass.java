/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class Student
{
   private int roll,eng,nep,comp;
   private String name;
   
   public void setinfo( int a, int b, int c,int d,String e)
   {
       roll=a;
       eng=b;
       nep=c;
       comp=d;
       name=e;

   }
  public void showinfo()
  {
      
      System.out.println("roll"+roll);
      System.out.println("english"+eng);
      System.out.println("nepali"+nep);
      System.out.println("computer"+comp);
      System.out.println("name"+name);
      
  }
  int total()
  {
      return eng+nep+comp;
  }
  String Ispass()
  {
     if(eng>=45&&nep>=45&&comp>=45)
     {
       return "pass";
     }
       else
       {
                       return "fail"; 
               }
    
      
      
  }
}  
public class Testclass {
    public static void main(String[] args) {
        Student s=new Student();
        s.setinfo(1,45,70,75,"ram");
        s.showinfo();
        System.out.println("total" +s.total());
         System.out.println("Pass or fail" +s.Ispass());
        
    }
    
    
    
}
