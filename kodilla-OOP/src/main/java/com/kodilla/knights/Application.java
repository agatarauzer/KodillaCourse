package com.kodilla.knights;

public class Application {
    public static void main (String[] args) {
        Knight knight = new Knight(new DeadIslandQuest());
        knight.checkQuest();
    }
}
