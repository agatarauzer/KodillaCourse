package com.kodilla.patterns.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User millenialsUser;
    private User yGenerationUser;
    private User zGenerationUser;

    @Before
    public void create() {
        this.millenialsUser = new Millenials("Steven");
        this.yGenerationUser = new YGeneration("Adam");
        this.zGenerationUser = new ZGeneration("Greg");
    }

    @Test
    public void testDefaultSharingStrategies() {
        //When
        String postMillenials = millenialsUser.sharePost();
        String postYGeneration = yGenerationUser.sharePost();
        String postZGeneration = zGenerationUser.sharePost();

        //Then
        Assert.assertEquals("Facebook post", postMillenials);
        Assert.assertEquals("Twitter post", postYGeneration);
        Assert.assertEquals("Snapchat post", postZGeneration);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //When
        millenialsUser.setSocialPublisher(new SnapchatPublisher());
        String postMillenials = millenialsUser.sharePost();

        //Then
        Assert.assertEquals("Snapchat post", postMillenials);
    }


}
