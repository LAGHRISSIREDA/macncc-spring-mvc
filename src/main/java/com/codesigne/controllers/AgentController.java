package com.codesigne.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("admin")
@SessionAttributes("authPerson")
public class AgentController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
