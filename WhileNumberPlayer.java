package com.company;

public class WhileNumberPlayer {

    private int limit;
    public WhileNumberPlayer(int limit) {

        this.limit = limit;
    }

    public WhileNumberPlayer() {
    }

    public void printSquaresUptoLimit(int i) {
        while(i*i <= limit){
            System.out.print(i*i + " ");
            i++;
        }
        System.out.println();
    }

    public void printCubesUptoLimit(int i) {
        while(i*i*i <=limit){
            System.out.print(i*i*i + " ");
            i++;
        }
    }
}
