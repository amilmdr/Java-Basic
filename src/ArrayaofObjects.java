/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class Student99{
    String name,faculty;
    int age;
    public void setinfo(String n,String f,int a){
        name=n;
        faculty=f;
        age=a;
    }
    void showinfo(){
        System.out.println("name="+name);
        System.out.println("Faculty="+faculty);
        System.out.println("age="+age);
    }
}
public class ArrayaofObjects {
    public static void main(String[] args) {
      Student99 s[]=new Student99[5];
     for(int i=0;i<5;i++){
         s[i]=new Student99();
     }
      s[0].setinfo("amil", "management", 10);
      s[1].setinfo("ram", "management", 15);
      s[2].setinfo("hari", "management", 16);
      s[3].setinfo("sita", "management", 1);
      s[4].setinfo("rita", "management", 19);
     int minage=s[0].age;
     for(int i=0;i<5;i++){
         if(minage>s[i].age){
             minage=s[i].age;
         
     }
            }
         for(int i=0;i<5;i++){
             if(minage==s[i].age){
                 s[i].showinfo();
             }
             
         }
  
    
      /*
      if(s[0].age<s[1].age&&s[0].age<s[2].age&&s[0].age<s[3].age&&s[0].age<s[4].age){
          s[0].showinfo();
      }
      else if(s[1].age<s[0].age&&s[1].age<s[2].age&&s[1].age<s[3].age&&s[1].age<s[4].age){
          s[1].showinfo();
      }
      else if(s[2].age<s[0].age&&s[2].age<s[1].age&&s[2].age<s[3].age&&s[2].age<s[4].age){
          s[2].showinfo();
      }
      else if(s[3].age<s[0].age&&s[3].age<s[1].age&&s[3].age<s[2].age&&s[3].age<s[4].age){
          s[3].showinfo();
      }
      else{
        s[4].showinfo();  
      }*/
    
} 
}
 
    

