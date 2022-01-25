
package FileHandling;
import java.io.*;
public class RandomDemo {
    public static void main(String[] args) {
        try{
            RandomAccessFile rfile=new RandomAccessFile("hello.txt","rw");
            rfile.writeInt(10);
            rfile.writeDouble(10.5);
            long pos=rfile.getFilePointer();
            rfile.writeChar('a');
            rfile.seek(0);
            System.out.println(rfile.readInt());
            System.out.println(rfile.readDouble());
            rfile.seek(rfile.length());
            rfile.writeBoolean(true);
            rfile.seek(pos);
            System.out.println(rfile.readChar());
            System.out.println(rfile.read());
            rfile.close();
            
        }
        catch(Exception ex){
            System.out.println(ex);   
        }
    }
}
