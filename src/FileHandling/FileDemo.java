package FileHandling;
import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        //to make a directory
     /*   File f=new File("d:/test");
        if(!f.exists()){
            f.mkdir();
        }
        //to make empty file
        File f1=new File("d:/test/abc.txt");
        if(!f1.exists()){
            try{
           
            f1.createNewFile();
            }
            catch(IOException ex){
                System.out.println(ex);
            }
        }
        //rename to
        File f2=new File("d:/test/xyz.txt");
        f1.renameTo(f2);*/
     //to delete a file
     File f3=new File("d:/test/xyz.txt");
     if(f3.exists()){
         f3.delete();
     }
    }
}
