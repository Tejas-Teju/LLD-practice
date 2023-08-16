package com.lldpractice.lldpractice.loggingsystem.service;

import com.lldpractice.lldpractice.loggingsystem.DebugLogger;
import com.lldpractice.lldpractice.loggingsystem.ErrorLogger;
import com.lldpractice.lldpractice.loggingsystem.InfoLogger;
import com.lldpractice.lldpractice.loggingsystem.LoggingSystem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoggerService {

    public ResponseEntity log(Integer type, String message) {
        LoggingSystem loggingSystem = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        return new ResponseEntity(loggingSystem.log(type, message), HttpStatus.OK);
    }
}
