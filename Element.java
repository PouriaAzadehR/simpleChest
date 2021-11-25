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
     * this is a method which check wether the element of a coordination is enemy or not
     * @param gameBoard of chest
     * @param x of element
     * @param y element
     * @return a true if it is enemy
     */
    private boolean isEnemy(Board gameBoard ,int x , int y){
        return gameBoard.board[x][y].color!=this.color;
    }

    private boolean validMoveRangeBoard(int numMoves,char direction){
        int tempCoordination=coordination;
        switch (direction){
            //u for up
            case 'u' :{
                tempCoordination+=numMoves;
                if (tempCoordination/10>coordination/10)
                    return false;
            }
            //d for down
            case 'd': {
                tempCoordination-=numMoves;
                if (tempCoordination/10<coordination/10)
                    return false;
            }
            //r for right
            case 'r':{
                tempCoordination+=numMoves*10;
                if (tempCoordination>99)
                    return false;
            }
            //l for left
            case 'l' :{
                tempCoordination-=numMoves*10;
                if (tempCoordination<0)
                    return false;
            }
        }
        return true;
    }

    /**
     * this is a method for changing place of each element in board
     * @param numMoves of which element should go
     * @param direction of moves which element should go
     */
    public int moveBoard(int numMoves,char direction){
        int tempcoordination=coordination;
        switch (direction){
            //u for up
            case 'u':{
                if (validMoveRangeBoard(numMoves,direction))
                    tempcoordination+=numMoves;
            }
            //d for down
            case 'd':{
                if (validMoveRangeBoard(numMoves,direction))
                    tempcoordination-=numMoves;
            }
            //r for right
            case 'r':{
                if (validMoveRangeBoard(numMoves,direction))
                    tempcoordination+=numMoves*10;
            }
            //l for left
            case 'l':{
                if (validMoveRangeBoard(numMoves,direction))
                    tempcoordination-=numMoves*10;
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
}
