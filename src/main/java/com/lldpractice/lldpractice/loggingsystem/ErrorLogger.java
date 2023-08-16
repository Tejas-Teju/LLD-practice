package com.lldpractice.lldpractice.loggingsystem;

public class ErrorLogger extends LoggingSystem {

    public ErrorLogger(LoggingSystem nextLogger) {
        super(nextLogger);
    }

    @Override
    public String log(Integer type, String message) {
        if (ERROR == type) {
            return "ERROR logger called... with message " + message;
        }

        return nextLogger.log(type, message);
    }
}
