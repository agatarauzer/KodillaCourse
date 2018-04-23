package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTest {

    @BeforeClass
    public static void createLogger() {
        Logger.getInstance().Log("log number 1");
        Logger.getInstance().Log("log number 2");
    }

    @Test
    public void testGetLastLog() {
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log number 2", lastLog);
    }
}
