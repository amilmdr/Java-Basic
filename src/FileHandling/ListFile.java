package FileHandling;
import java.io.*;
public class    ListFile {
    public static void main(String[] args) {
        File f=new File("d:/New Folder");
        if(f.isDirectory()){
            File fn[]=f.listFiles();
            for(File m:fn){
                if(!m.canWrite()&&m.canRead()){
                System.out.println(m);
                }
            }
        }
    }
    
}


    
