package com.practice.myappvs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController{

    @GetMapping("/test")
    public String handle(){
        return "This is from vscode";
    }
}