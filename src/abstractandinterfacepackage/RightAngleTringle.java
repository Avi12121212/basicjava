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
public class RightAngleTringle extends Figure implements ISides {
    int height ,base ;

    public RightAngleTringle(int height, int base) {
        this.height = height;
        this.base = base;
    }
    

    @Override
    public double area() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return .5* height*base;    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int sides() {
        return 3;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
