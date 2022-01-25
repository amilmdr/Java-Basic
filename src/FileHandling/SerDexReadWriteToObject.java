
package FileHandling;
import java.io.*;
class employee implements Serializable{
     transient int id;
     /// use of transient is to not stored the member of any object to file++
    String name,post;
    double salary;
    void SetInfo(int i,String n,String p,double s){
    id=i;
    name=n;
    post=p;
    salary=s;
}
    void ShowInfo(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("post="+post);
        System.out.println("Salary="+salary);
    }
    
}
public class SerDexReadWriteToObject {
    public static void main(String[] args) {
        employee e=new employee();
        e.SetInfo(101,"ram","manager",560003);
        try{
           FileOutputStream fout=new FileOutputStream("e:/aaaa.txt");
           ObjectOutputStream Oout=new ObjectOutputStream(fout);
           Oout.writeObject(e);
           fout.close();
           Oout.close();
           //reading  file from 
            FileInputStream fin=new FileInputStream("e:/aaaa.txt");
           ObjectInputStream Oin=new ObjectInputStream(fin);
           employee e1=(employee)Oin.readObject();
           e1.ShowInfo();
           Oin.close();
           fin.close();
           
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        
        
    }
}
