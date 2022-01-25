import java.util.*;
public class Reverse {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
        int r,s=0;
        while(n!=0)
        {
            r=n%10;
            System.out.println("the r is "+r);
            s=s*10+r;
            n=n/10;
        }
        System.out.println("the some of the given number is "+s);
    }
    
}
