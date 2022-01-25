package StringHandling;
import java.util.*;
public class UseofCharAt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the word");
        String s=input.nextLine();
        int count=0;
        int cout=0;
        int sp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i' ||ch=='o'||ch=='u'||ch=='A'||
                    ch=='E'||ch=='I' ||ch=='O'||ch=='U'){
                count++;
            }
            else if(ch==' '){
                sp++;
            }
        else{
                cout++;
                }
        }
        System.out.println("the no vowels are:"+count);
        System.out.println("the no of consonet:"+cout);
        System.out.println("the words are:"+(sp+1));

    }
}