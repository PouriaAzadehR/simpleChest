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
     * this is a method for changing place of each element in board
     * @param gameBoard of chest
     * @param numMoves of which element should go
     * @param direction of moves which element should go
     */
    public void moveBoard(Board gameBoard,int numMoves,char direction){
        switch (direction){
            //u for up
            case 'u'-> coordination++;
            //d for down
            case 'd'-> coordination--;
            //r for right
            case 'r'-> coordination+=10;
            //l for left
            case 'l'-> coordination-=10;
        }
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
