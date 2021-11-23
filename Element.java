package com.company;

/**
 * this is a class for elements of game like king soldier horse and castle
 * it contains color and coordination of every element
 * @author pouri
 * @version 1
 * @since today
 */
public class Element {
    
    //it could be w for white and b for black
    private char color;

    //it is 2 digit number which represent coordination of element
    private int coordination;

    /**
     * this is a constructor
     * @param color of element
     * @param coordination of element
     */
    public Element(char color,int coordination){
        this.color=color;
        this.coordination=coordination;
    }

    /**
     * this is getter method
     * @return color of element
     */
    public char getColor() {
        return color;
    }

    /**
     * this is a getter method
     * @return coordination of element
     */
    public int getCoordination() {
        return coordination;
    }
}
