import java.util.*;
public class ToRead10Numbers {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 10 number ");
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]=obj.nextInt();
            
        }
        System.out.println("the given number are ");
         for(int i=0;i<10;i++){
             System.out.println(a[i]);
            
        }
        // for assending order
        int i,j,temp;
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
            System.out.print(a[i]+ "\t");
        }
    }
  
}
