package com.schneider.ifw.emh.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @GetMapping(path="/add")
    public double add(@RequestParam double num1, @RequestParam double num2){
        return num1+num2;
    }
    @GetMapping(path="/subtract")
    public double subtract(@RequestParam double num1, @RequestParam double num2){
        return num1-num2;
    }
    @GetMapping(path="/multiply")
    public double multiply(@RequestParam double num1, @RequestParam double num2){
        return num1*num2;
    }
    @GetMapping(path="/divide")
    public double divide(@RequestParam double num1, @RequestParam double num2){
        try {
            if (num2 == 0) {
                throw new IllegalArgumentException("cannot divide by 0");
            }
            return num1 / num2;
        } catch (IllegalArgumentException e) {
            System.out.println("Error:"  + e.getMessage());

                return 0;
        }
    }
    }

