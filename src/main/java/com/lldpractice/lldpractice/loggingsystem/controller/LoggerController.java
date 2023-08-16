package com.lldpractice.lldpractice.loggingsystem.controller;

import com.lldpractice.lldpractice.loggingsystem.service.LoggerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/logging-system/")
public class LoggerController {

    LoggerService loggerService;

    LoggerController(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity test(@RequestParam Integer type, @RequestParam String message) {
        return loggerService.log(type, message);
    }
}
