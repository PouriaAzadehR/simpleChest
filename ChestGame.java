package com.company;

import java.util.Scanner;

/**
 * this is a class which is for manging whole game
 * it contains a board and two player
 * @author pouri
 * @version 1
 * @since today
 */
public class ChestGame  {

    //game bord of chest
    private Board gameBoard;

    /**
     * this is a constructor
     */
    public ChestGame(){
        gameBoard=new Board();
    }
    /**
     * this is a method which check wether the element of a coordination is enemy or not
     * @param x2 of element
     * @param y2 element
     * @return  true if it is enemy
     */
    private boolean isEnemy(char color,int x2,int y2){
        return (gameBoard.board[x2][y2].getColor())!=color;
    }

    /**
     * this is a method which check a place in board is empty or not
     * @param x of place
     * @param y place
     * @return true if it is not empty
     */
    private boolean isElement(int x , int y){
        return gameBoard.board[x][y]!=null;
    }

    public boolean freeWay(Element element,int x , int y){
        if (element instanceof Horse)
            return isEnemy(element.getColor(),x,y);
        else if (element instanceof Castle){
            if (element.getCoordination()/10==x){
                for (int i = element.getCoordination()%10+1; i <=y ; i++) {
                    if (isElement(x,i)){
                        return false;
                    }
                }
            }
            else {
                for (int i = element.getCoordination()/10+1; i <=x ; i++) {
                    if (isElement(i,y)){
                        return false;
                    }
                }
            }
            return true;
        }
        else {
            return isEnemy(element.getColor(),x,y);
        }
    }

    public void setGameBoard(Element element,int newX,int newY){
        int oldCoordination=element.getCoordination();
        gameBoard.board[oldCoordination/10][oldCoordination%10]=null;
        gameBoard.board[newX][newY]=element;
        element.setCoordination(newX*10+newY);
    }

    public void play(){
        System.out.println("pleas enter coordination of your element");
        Scanner scanner=new Scanner(System.in);
        int coordinationUserElement=scanner.nextInt();
        Element userElement=gameBoard.board[coordinationUserElement/10][coordinationUserElement%10];
        do {
            int tempCoordination=userElement.move();
            if (!freeWay(userElement,tempCoordination/10,tempCoordination%10)) {
                System.out.println("not valid input");
                continue;
            }
            setGameBoard(userElement,tempCoordination/10,tempCoordination%10);
            break;
        }while (true);
    }

    /**
     * this is a getter method
     * @return gameBoard
     */
    public Board getGameBoard() {
        return gameBoard;
    }
}
