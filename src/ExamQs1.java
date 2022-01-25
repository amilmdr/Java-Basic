
class Productt{
    private int id;
    private String name;
    private double price;
    
    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
        
    }
    void setPrice(double price){
        this.price=price;
    }
    public int getId(){
        return id;
    }
     public String getName(){
        return name;
    }
      public double getPrice(){
        return price;
    }
    
    
}
public class ExamQs1 {
    public static void main(String[] args) {
        Productt p=new Productt();
        p.setId(450);
        p.setName("RAM");
        p.setPrice(25000);
        System.out.println("id="+p.getId());
        System.out.println("name="+p.getName());
        System.out.println("Price="+p.getPrice());
    }
    
}
