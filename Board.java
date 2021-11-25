package com.company;

import java.util.ArrayList;

/**
 * this is a class for board of chest game
 * it contains  board and elements of chest game
 * @author pouri
 * @version 1
 * @since today
 */
public class Board {

    //a 2 dimension array list for board of chest game
    Element[][] board;

    /**
     * this is a constructor
     */
    public Board(){
        board=new Element[5][10];
        makeBoard();
    }

    private void makeBoard(){
        board[0][0]=new Castle('w',0);
        board[1][0]=new Horse('w',10);
        board[2][0]=new King('w',20);
        board[3][0]=new Horse('w',30);
        board[4][0]=new Castle('w',40);
        board[0][1]=new Soldier('w',1);
        board[1][1]=new Soldier('w',11);
        board[2][1]=new Soldier('w',21);
        board[3][1]=new Soldier('w',31);
        board[4][1]=new Soldier('w',41);
        board[0][9]=new Castle('b',9);
        board[1][9]=new Horse('b',19);
        board[2][9]=new King('b',29);
        board[3][9]=new Horse('b',39);
        board[4][9]=new Castle('b',49);
        board[0][8]=new Soldier('b',8);
        board[1][8]=new Soldier('b',18);
        board[2][8]=new Soldier('b',28);
        board[3][8]=new Soldier('b',38);
        board[4][8]=new Soldier('b',48);
    }

    /**
     * this is a method for showing board
     */
    public void showBoard(){
        String tempCoordination;
        for (int i = 9; i >=0; i--) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i]!=null) {
                    if (board[j][i].getCoordination() < 10) {
                        tempCoordination = "0" + board[j][i].getCoordination();
                        System.out.print("(" + tempCoordination + "):" + board[j][i].toString() + "(" + board[j][i].getColor() + ")" + "  ");
                    }
                    else
                        System.out.print("(" + board[j][i].getCoordination() + "):" + board[j][i].toString() + "(" + board[j][i].getColor() + ")" + "  ");
                }
                else
                    System.out.print("empty block  ");
            }
            System.out.println();
        }
    }
}
