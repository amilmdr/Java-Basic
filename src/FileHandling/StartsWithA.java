package FileHandling;
import java.io.*;
public class  StartsWithA {
    public static void main(String[] args) {
        File f=new File("d:/New Folder");
        if(f.isDirectory()){
            String fn[]=f.list();
            for(String m:fn){
                if(m.startsWith("a")){
                System.out.println(m);
                }
            }
        }
    }
    
}
