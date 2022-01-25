package StringHandling;
public class PattornNEPAL {
    public static void main(String[] args) {
        String s="Nepal";
        for(int i=0;i<s.length();i+=2){
             for(int j=0;j<=i;j++){
                   char ch=s.charAt(j);
                   System.out.print(ch);
             }
             System.out.println("");
        }
        System.out.println("");      
        String s1="Nepal";
        for(int i=0;i<s1.length();i++){
             for(int j=0;j<=i;j++){
                   char ch=s1.charAt(j);
                   System.out.print(ch);
             }
             System.out.println("");
        }
         System.out.println("");      
        String s3="Nepal";
        int sp=3;
        for(int i=0;i<s3.length();i+=2){
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
             for(int j=0;j<=i;j++){
                   char ch1=s1.charAt(j);
                   System.out.print(ch1);
             }
             System.out.println("");
             sp--;
        }
        
        
        
    
}
}
