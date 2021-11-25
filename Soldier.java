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
    public void move() {
        System.out.println("this is your soldier");
        moveBoard(1,'u');
    }
}
