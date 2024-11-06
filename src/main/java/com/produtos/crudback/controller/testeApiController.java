package com.produtos.crudback.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class testeApiController {

    @GetMapping
    public String teste(){

        return "GET api.setup ok,! ";

    }
}
