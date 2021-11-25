package com.company;

public class Main {

    public static void main(String[] args) {
        ChestGame chestGame=new ChestGame();
        chestGame.getGameBoard().showBoard();
        while (true){
            System.out.println("it is white player's turn");
            chestGame.play();
            chestGame.getGameBoard().showBoard();
            System.out.println("it is black player's turn");
            chestGame.play();
            chestGame.getGameBoard().showBoard();
            if (chestGame.isEndB()) {
                System.out.println("player black win the game");
                break;
            }
            else if (chestGame.isEndw()){
                System.out.println("player white win the game");
                break;
            }
        }
        System.out.println("game finished");
    }
}
