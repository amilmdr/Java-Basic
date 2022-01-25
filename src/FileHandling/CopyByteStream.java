package FileHandling;
import java.io.*;
public class CopyByteStream {
    public static void main(String[] args) {
        try{
        FileInputStream fin=new FileInputStream("e:/abc.txt");
        FileOutputStream fout=new FileOutputStream("e:/aaa.txt");
        int ch;
        while((ch=fin.read())!=-1)
        {
            fout.write(ch);
        }
         fout.close();
        fin.close();
        }
        catch(Exception ex){
            System.out.println(ex);
       
        }
        ///for image copy
         try{
        FileInputStream fin=new FileInputStream("e:/1.jpg");
        FileOutputStream fout=new FileOutputStream("e:/2.jpg");
        int ch1;
        while((ch1=fin.read())!=-1)
        {
            fout.write(ch1);
        }
         fout.close();
        fin.close();
        }
        catch(Exception ex){
            System.out.println(ex);
       
        }
    }
}
