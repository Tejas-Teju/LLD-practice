package com.lldpractice.lldpractice.loggingsystem;

public class InfoLogger extends LoggingSystem {

    public InfoLogger(LoggingSystem nextLogger) {
        super(nextLogger);
    }

    @Override
    public String log(Integer type, String message) {
        if (INFO == type) {
            return "INFO logger called... with message " + message;
        }

        return nextLogger.log(type, message);
    }
}
