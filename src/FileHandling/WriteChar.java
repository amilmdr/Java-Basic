package FileHandling;
import java.io.*;
public class WriteChar {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("e:/abcd.txt");
            String s="hello my name is amil manandhar";
            fw.write(s);
             fw.close();
            
        }
        catch(Exception ex){
                System.out.println(ex);
                }
    }
}
