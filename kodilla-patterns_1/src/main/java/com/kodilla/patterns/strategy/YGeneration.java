package com.kodilla.patterns.strategy;

public class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
