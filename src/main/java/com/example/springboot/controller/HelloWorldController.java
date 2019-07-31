/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vijayabhaskar.n
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    @RequestMapping("/")
    @ResponseBody
    String hello(){
        return "Hello World! Spring boot is so simple.";
    }
}
