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
    public abstract class Figure {

        public abstract double area();
        public abstract double perimeter();

//    public abstract Figure();
    public static String description() {
        return "This is a Figure";
    }

    @Override
    public String toString() {
        return "";
    }

}
