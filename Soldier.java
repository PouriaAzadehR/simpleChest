package com.company;

/**
 * this is a class for soldier element
 * @author pouri
 * @version 1
 * @since today
 */
public class Soldier extends Element implements Actions{

    public Soldier(char color, int coordination){
        super(color,coordination);
    }

    @Override
    public int move() {
        do {
            System.out.println("this is your soldier");
            setNumMoves(1);
            setDirection('u');
            if (!validMoveRangeBoard()){
                System.out.println("not valid input");
                continue;
            }
            return moveBoard();
        }while (true);
    }

    @Override
    public String toString() {
        return "Soldier";
    }
}
