package com.company;

import java.util.Scanner;

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
            System.out.println("please enter direction of your move u for up and d for down");
            Scanner scanner=new Scanner(System.in);
            String direction=scanner.next();
            setDirection(direction.charAt(0));
            if (!validMoveRangeBoard()){
                System.out.println("not valid input");
                System.out.println("1");
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
