package com.company;

public class WhileNumberPlayerRunner {
    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(30);//sets the limit for numbers to be squared
        player.printSquaresUptoLimit(1);//i = starting number to be squared

        player.printCubesUptoLimit(1);//i = starting number to be squared
        //limit = 30
    }
}
