package com.company;

import java.util.Scanner;

public class Castle extends Element implements Actions{

    /**
     * this is a constructor
     * @param color of castle
     * @param coordination of castle
     */
    public Castle(char color, int coordination){
        super(color,coordination);
    }

    @Override
    public int move() {
        do {
            System.out.println("this is your castle");
            System.out.println("which direction do u want to move(r,l,u,d)");
            Scanner scanner = new Scanner(System.in);
            String direction = scanner.next();
            System.out.println("please enter number of your move");
            int numMove = scanner.nextInt();
            setNumMoves(numMove);
            setDirection(direction.charAt(0));
            if (!validMoveRangeBoard()) {
                System.out.println("not valid input");
                continue;
            }
            return moveBoard();
        }while (true);
    }
}
