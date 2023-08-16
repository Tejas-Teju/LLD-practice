package com.lldpractice.lldpractice.loggingsystem;

public abstract class LoggingSystem {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LoggingSystem nextLogger;

    LoggingSystem(LoggingSystem nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract String log(Integer type, String message);
}
