/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondmethodpackage;

/**
 *
 * @author HP
 */


public class Rectangle {
    int length,breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int length) {
        this(length,length);
    }
    public Rectangle()
    {
        this(0);
    }

    @Override
    public String toString() {
        if(length==breadth)
        return "sqaure {" + "length=" + length + ", breadth=" + breadth + '}';
        
        return "rectangle {" + "length=" + length + ", breadth=" + breadth + '}';
    }
    

}