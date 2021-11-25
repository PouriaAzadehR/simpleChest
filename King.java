package com.company;

import java.util.Scanner;

/**
 * this is a class for king element
 * @version 1
 * @author pouri
 * @since today
 */
public class King extends Element implements Actions {

    /**
     * this is a constructor
     * @param color of king
     * @param coordination of king in board
     */
    public King(char color,int coordination){
        super(color,coordination);
    }

    @Override
    public void move() {
        System.out.println("this is your king ");
        System.out.println("please direction of your move");
        Scanner scanner=new Scanner(System.in);
        String direction =scanner.next();
        moveBoard(1,direction.charAt(0));
    }
}
