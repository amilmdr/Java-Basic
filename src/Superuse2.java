/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amil
 */
class AA{
    int n=10 ,p=100;
}
class CC extends AA{
    int n=50,m=50;
    void sum(){
       int s=n+p+m;
        System.out.println("sum:"+s);
       int s1=super.n+p+m;
        System.out.println("sum:"+s1);
        
    }
}
public class Superuse2 {
    public static void main(String[] args) {
        CC obj=new CC();
        obj.sum();
    }
}
