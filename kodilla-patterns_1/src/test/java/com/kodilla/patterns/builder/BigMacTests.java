package com.kodilla.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTests {

    @Test
    public void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .ingredient("chili")
                .ingredient("onion")
                .ingredient("cucamber")
                .sauce("barbecue")
                .bun("standard")
                .burgers(2)
                .build();

        //When
        int howManyIngredients = bigMac.getIngredients().size();
        int howManyBurgers = bigMac.getBurgers();

        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }

}
