package com.guanbo.cxfwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

    @GetMapping("/hello")
    public String HelloWord(){
        return "Hello Word！";
    }
}
