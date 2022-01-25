package FileHandling;
import java.io.*;
public class    IsHiddenFile {
    public static void main(String[] args) {
        File f=new File("c:/");
        if(f.isDirectory()){
            File fn[]=f.listFiles();
            for(File m:fn){
                if(m.isHidden()){
                System.out.println(m);
                }
            }
        }
    }
    
}
