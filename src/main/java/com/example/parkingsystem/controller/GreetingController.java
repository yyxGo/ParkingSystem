package com.example.parkingsystem.controller;

import com.example.parkingsystem.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService greetingService;
    @GetMapping("/hello")
    public String hello(){
        return  greetingService.hello();
    }
}
