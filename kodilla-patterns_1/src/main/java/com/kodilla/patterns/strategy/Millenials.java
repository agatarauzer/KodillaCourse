package com.kodilla.patterns.strategy;

public class Millenials extends User {

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
