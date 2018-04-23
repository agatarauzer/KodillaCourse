package com.kodilla.patterns.singleton;

public final class Logger {
    private String lastLog = "";
    private static Logger uniqueInstance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (uniqueInstance == null) {
            synchronized (Logger.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Logger();
                }
            }
        }
        return uniqueInstance;
    }

    public void Log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
