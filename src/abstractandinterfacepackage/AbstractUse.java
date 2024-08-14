/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractandinterfacepackage;

/**
 *
 * @author HP
 */
public class AbstractUse {

    public static void main(String[] args) {
//        Figure f=new Figure();
        Rectangle r = new Rectangle(5, 4);
        
        System.out.println(r.area());
        ISides is=new Rectangle(6,0);
        Figure f = new Circle(10);
        System.out.println(f.area());
//        System.out.println();
        RightAngleTringle p= new RightAngleTringle(3,4);
        System.out.println(p.area());
        Object obj= new AbstractUse(); // tring to get from object class        
        
        System.out.println();// this is for rightangle tringle 
        
        
    }
//        f.
}
