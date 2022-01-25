
interface Calcutation{
    void add(int a,int b);
    int multiply(int a,int b);
}
class CalculationDemo implements Calcutation{
     public void add(int a,int b){
        System.out.println("sum "+(a+b));    
    }
    public int multiply(int a,int b){
        int c;
        c=a*b;
        return c;
    }   
}
public class ExamTestclass {
    public static void main(String[] args) {
        CalculationDemo oj=new CalculationDemo();
        oj.add(4, 5);
        System.out.println("Multiply value is:"+oj.multiply(1, 5));
    }
    
}
