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
public class Rectangle extends Figure implements ISides {

    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {

        return length * breadth;
    }

    @Override
    public double perimeter() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 2 * (length + breadth);
    }

    public double diagonal() {
        return Math.sqrt(length * length + breadth * breadth);
    }

    @Override
    public int sides() {
        return 4;
    }

}
