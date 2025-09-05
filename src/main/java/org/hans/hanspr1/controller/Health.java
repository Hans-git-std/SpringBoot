package org.hans.hanspr1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Health {
    @GetMapping("/health")
    public String api_health(){
        return "API call is working well :) ";
    }
}
