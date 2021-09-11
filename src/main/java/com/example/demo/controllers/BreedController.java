package com.example.demo.controllers;

import com.example.demo.dto.Result;
import com.example.demo.services.BreedService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreedController {

    @Autowired
    private BreedService breedService;

//    @GetMapping("/list/all")
    @GetMapping("/")
    public Result list() throws Exception {
        System.out.println("HELLLLO");
        return breedService.list();
    }
}
