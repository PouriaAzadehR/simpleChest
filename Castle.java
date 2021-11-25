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
    public void move() {
        System.out.println("this is your castle");
        System.out.println("which direction do u want to move(r,l,u,d)");
        Scanner scanner=new Scanner(System.in);
        String direction = scanner.next();
        System.out.println("please enter number of your move");
        int numMove=scanner.nextInt();
        moveBoard(numMove,direction.charAt(0));
    }
}
