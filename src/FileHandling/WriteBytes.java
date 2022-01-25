package FileHandling;
import java.io.*;
public class WriteBytes {
    public static void main(String[] args) {
        try{
        FileOutputStream fout=new FileOutputStream("e:/abc.txt",true);
        //true for not removing previous string 
        String s=" is file handling test";
        byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
       
        }
        
        
        
    }
   
