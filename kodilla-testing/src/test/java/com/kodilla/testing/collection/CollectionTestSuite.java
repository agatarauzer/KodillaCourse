package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<>();

        exterminator.exterminate(testList);

        Assert.assertTrue(testList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            testList.add(i);
        }

        exterminator.exterminate(testList);

        Assert.assertTrue(testList.contains(2));
        Assert.assertTrue(testList.contains(4));

        Assert.assertFalse(testList.contains(1));
        Assert.assertFalse(testList.contains(3));
    }
}
