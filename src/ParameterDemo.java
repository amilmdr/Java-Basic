
 class Personi{
    private int id;
    private String  name;
    private double salary;
     public void setinfo( int i,String n,double a)
     {
       id=i;
       name=n;
       salary=a;
         
     }
     public void showinfo()
     {
       System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
     }
    
}
public class ParameterDemo {
    public static void main(String[] args) {
        
       Personi p=new Personi();
       p.setinfo(101,"ram",25000);
       p.showinfo();
       Personi p1=new Personi();
       p1.setinfo(102,"amil",26000);
       p1.showinfo();
               
       
    }
    
}
