package com.veronica.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.veronica.demo.model.Client;

@Controller
public class ClientController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index (Model model) {
        model.addAttribute("text", "Hello  World");
        return "index";
    }


    @RequestMapping(value = "/username", method = RequestMethod.POST)
    public String username(Model model, Client client){
        model.addAttribute("username", client.getUsername());
        return "cadastrook";
    }

}
