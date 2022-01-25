package FileHandling;
import java.io.*;
public class ReadChar {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("e:/abcd.txt");
            BufferedReader br=new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
            fr.close();
            br.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
   
}
