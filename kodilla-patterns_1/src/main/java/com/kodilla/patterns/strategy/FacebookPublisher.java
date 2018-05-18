package com.kodilla.patterns.strategy;

public class FacebookPublisher implements SocialPublisher {
    public String share() {
        return "Facebook post";
    }
}
