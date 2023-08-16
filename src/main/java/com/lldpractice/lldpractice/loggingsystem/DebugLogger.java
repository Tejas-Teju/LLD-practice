package com.lldpractice.lldpractice.loggingsystem;

public class DebugLogger extends LoggingSystem {

    public DebugLogger(LoggingSystem nextLogger) {
        super(nextLogger);
    }

    @Override
    public String log(Integer type, String message) {
        if (DEBUG == type) {
            return "DEBUG logger called... with message " + message;
        }

        return nextLogger.log(type, message);
    }
}
