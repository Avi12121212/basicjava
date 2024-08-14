/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractandinterfacepackage;

import static java.lang.Math.PI;

/**
 *
 * @author HP
 */
public class Circle extends Figure {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {

        return PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * PI * r;
    }

}
