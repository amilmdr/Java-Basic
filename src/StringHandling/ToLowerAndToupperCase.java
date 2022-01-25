package StringHandling;
import java.util.*;
public class ToLowerAndToupperCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string");
        String n=input.next();
        System.out.println("to lower:"+n.toLowerCase());
        System.out.println("to upper:"+n.toUpperCase());
        
    }
}
