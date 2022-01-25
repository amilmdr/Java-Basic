package StringHandling;
public class PattornKATHMANDU {
    public static void main(String[] args) {
        String s="kathmandu";
        int sp1=1;
        for(int i=8;i>=0;i-=2){
            for(int k=1;k<=sp1;k++){
                System.out.print(" ");
            }
             for(int j=0;j<=i;j++){
                   char ch2=s.charAt(j);
                   System.out.print(ch2);
             }
             System.out.println("");
             sp1++;
    }
    }
}
