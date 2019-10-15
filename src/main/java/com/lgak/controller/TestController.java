package com.lgak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import service.TestService;


@RestController
public class TestController {


    @Autowired
    private RestTemplate restTemplate;

    private TestService testService;

    @PostMapping("/test2")
    public String test1() {
        String body = restTemplate.getForEntity("http://user-center/test1", String.class).getBody();
        return body;
    }
}