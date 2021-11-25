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
    public void move(Board gameBoard) {
        System.out.println("this is your soldier");
        moveBoard(gameBoard,1,'u');
    }
}
