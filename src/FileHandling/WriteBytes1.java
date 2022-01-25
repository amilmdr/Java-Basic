package FileHandling;
import java.io.*;
import java.util.*;
public class WriteBytes1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
          try{
        FileOutputStream fout=new FileOutputStream("e:/abd.txt");
        
              System.out.println("enter the ");
        String s=input.nextLine();
        byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
        }
        catch(Exception ex){
            System.out.println(ex);
    }
    
}
}

