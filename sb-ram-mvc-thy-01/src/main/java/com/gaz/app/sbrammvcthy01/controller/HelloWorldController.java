package com.gaz.app.sbrammvcthy01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    /** Creacion de Metodo controlador, para controlar las solicitudes HTPP
     *  http://localhost:8080/hello-world    */

    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("mensaje", "Hola Thymeleaf !!!");
        return "hello-world";
    }

}

/** EXPRESION DE VARIABLE: th:text="${mensaje}"
 * el nombre del atributo: para acceder al valor del atributo mediante la expresión de variable en el la plantilla html
 */