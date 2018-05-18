package com.kodilla.patterns.strategy;

public class TwitterPublisher implements SocialPublisher {

    public String share() {
        return "Twitter post";
    }
}
