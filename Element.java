package com.company;

/**
 * this is a class for elements of game like king soldier horse and castle
 * it contains color and coordination of every element
 * @author pouri
 * @version 1
 * @since today
 */
public abstract class Element implements Actions {

    //it could be w for white and b for black
    private char color;

    //it is 2 digit number which represent coordination of element
    private int coordination;

    //direction of move
    private char direction;

    //number of moves
    private int numMoves;

    /**
     * this is a constructor
     * @param color of element
     * @param coordination of element
     */
    public Element(char color,int coordination){
        this.color=color;
        this.coordination=coordination;
    }



    public boolean validMoveRangeBoard(){
        int tempCoordination=coordination;
        switch (direction){
            //u for up
            case 'u' :{
                tempCoordination+=numMoves;
                if (tempCoordination/10>coordination/10)
                    return false;
                break;
            }
            //d for down
            case 'd': {
                tempCoordination-=numMoves;
                if (tempCoordination/10<coordination/10)
                    return false;
                break;
            }
            //r for right
            case 'r':{
                tempCoordination+=numMoves*10;
                if (tempCoordination>99 || getCoordination()<0)
                    return false;
                break;
            }
            //l for left
            case 'l' :{
                tempCoordination-=numMoves*10;
                if (tempCoordination<0 || tempCoordination>99)
                    return false;
                break;
            }
        }
        return true;
    }

    /**
     * this is a method for changing place of each element in board
     */
    public int moveBoard(){
        int tempcoordination=coordination;
        switch (direction){
            //u for up
            case 'u':{
                if (validMoveRangeBoard())
                    tempcoordination+=numMoves;
                break;
            }
            //d for down
            case 'd':{
                if (validMoveRangeBoard())
                    tempcoordination-=numMoves;
                break;
            }
            //r for right
            case 'r':{
                if (validMoveRangeBoard())
                    tempcoordination+=numMoves*10;
                break;
            }
            //l for left
            case 'l':{
                if (validMoveRangeBoard())
                    tempcoordination-=numMoves*10;
                break;
            }
        }
        return tempcoordination;
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

    /**
     * this is a setter method
     * @param coordination new one
     */
    public void setCoordination(int coordination) {
        this.coordination = coordination;
    }

    /**
     * this is a getter method
     * @return direction of move
     */
    public char getDirection() {
        return direction;
    }

    /**
     * this is a getter method
     * @return num moves
     */
    public int getNumMoves() {
        return numMoves;
    }

    /**
     * this is setter method
     * @param direction of move
     */
    public void setDirection(char direction) {
        this.direction = direction;
    }

    /**
     * this is a setter method
     * @param numMoves of moves
     */
    public void setNumMoves(int numMoves) {
        this.numMoves = numMoves;
    }
}
