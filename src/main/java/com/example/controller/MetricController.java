package com.example.controller;

import com.example.annotation.Logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Logging
    @GetMapping("/endPoint1")
    public String endPoint1() {
        //log.info("endPoint 1 : "+Thread.currentThread().getName());
        return "Metrics for endPoint1";
    }

    @GetMapping("/endPoint2")
    public String endPoint2() {
        //log.info("endPoint 2 : "+Thread.currentThread().getName());
        return "Metrics for endPoint2";
    }
}
