package FileHandling;
import java.io.*;
import java.util.*;
public class ReadWriteMixed {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int id=input.nextInt();
        String name=input.next();
        double salary=input.nextDouble();
        try{
            FileOutputStream fout=new FileOutputStream("e:/abcde.txt");
            DataOutputStream dout=new DataOutputStream(fout);
            dout.writeInt(id);
            dout.writeUTF(name);
            dout.writeDouble(salary);
            fout.close();
            dout.close();
            //read document 
            
            FileInputStream fin=new FileInputStream("e:/abcde.txt");
            DataInputStream din=new DataInputStream(fin);
            System.out.println("id="+din.readInt());
            System.out.println("name="+din.readUTF());
            System.out.println("salary="+din.readDouble());
            din.close();
            fin.close();
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
