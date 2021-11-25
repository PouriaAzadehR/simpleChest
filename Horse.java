package com.company;

import java.util.Scanner;

public class Horse extends Element implements Actions{

    /**
     * this is a constructor
     * @param color of element
     * @param coordination of element
     */
    public Horse(char color, int coordination) {
        super(color, coordination);
    }

    @Override
    public int move() {
        int oldCoordination;
        do {
            System.out.println("this is your horse");
            System.out.println("enter direction of your horizontal move");
            Scanner scanner = new Scanner(System.in);
            String horizontal = scanner.next();
            String vertical = scanner.next();
            int verticalMove = 0;
            System.out.println("please num of horizontal move 1 or 2");
            int numHorizontal = scanner.nextInt();
            if (numHorizontal == 1) {
                System.out.println("please enter direction of your vertical move");
                vertical = scanner.next();
                verticalMove = 2;
            } else if (numHorizontal == 2) {
                System.out.println("please enter direction of your vertical move");
                vertical = scanner.next();
                verticalMove = 1;
            }
            oldCoordination = getCoordination();
            if (horizontal.charAt(0) == 'l')
                setCoordination(getCoordination() - numHorizontal * 10);
            else if (horizontal.charAt(0) == 'r')
                setCoordination(getCoordination() + numHorizontal * 10);
            if (vertical.charAt(0) == 'u')
                setCoordination(getCoordination() + verticalMove);
            else if (vertical.charAt(0) == 'd')
                setCoordination(getCoordination() + verticalMove);

            if (getCoordination() / 10 > oldCoordination / 10 || (getCoordination()>99)){
                System.out.println("not valid input");
                setCoordination(oldCoordination);
                continue;
            }
            break;
        }while (true);
        int newCoordianion=getCoordination();
        setCoordination(oldCoordination);
        return newCoordianion;
    }
}
