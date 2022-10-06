package com.proyecto.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarwashController {
    @RequestMapping("/")
    public String principal() {
        return "menu";
    }
    @RequestMapping("/reserva")
    public String reserva() {
        return "reserva";
    }
    @RequestMapping("/retorno")
    public String retorno() {
        return "retorno";
    }

}
