class A{
    private int m=50;
    int n=30;
    public int p=90;
    void abc(){
        System.out.println(m+" "+n+" "+p);
        //System.out.println(x+" "+y+ " " +z); is not allowed
        //outer class cannot access inner class member
    }
    class B{
        private int x=10;
        int y=20;
        int z=30;
        void bcd(){
        System.out.println(m+" "+n+" "+p);
        System.out.println(x+" "+y+ " " +z);
         //innner class can access any outer  class member.
    }
}
}

public class ExamQs {
public static void main(String[] args){
  A ob=new A();
  ob.abc();
  A.B ob1=ob.new B();
  ob1.bcd();
}
    
}
