package io.github.rycardofarias.msclients.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/clients")
public class ClientController {

    @GetMapping
    public String status(){
        return "ok";
    }
}
