package com.gaz.app.sbrammvcthy01.controller;

import com.gaz.app.sbrammvcthy01.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    /**
     * handeler method to handle variable-expression request:
     */
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("John Thome", "johndoe@email.com", "Consultor", "M");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    /**
     * handeler method to handle selection-expression
     * http://localhost:8080/selection-expression
     */
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("John Grazy", "JohnDoe@correo.com", "Admin", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    /**
     * handeler method to handle message expresions request:
     * http://localhost:8080/message-expresions
     */
    @GetMapping("message-expresions")
    public String messageExpresions() {
        return "message-expresions";
    }

    /**
     * handeler method to handle link expresions request:
     * http://localhost:8080/link-expression
     */
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    /**
     * handeler method to handle fragmnent expresion request:
     * http://localhost:8080/fragment-expression
     */
    @GetMapping("fragment-expression")
    public String fragmentExpressions() {
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model) {
        User admin1 = new User("Admin 1", "admin1@gmail.com", "Admin", "Male");
        User admin2 = new User("Admin 2", "admin2@gmail.com", "Admin", "Male");
        User admin3 = new User("Admin 3", "admin3@gmail.com", "Admin", "Male");
        User admin4 = new User("Admin 4", "admin4@gmail.com", "Admin", "Male");
        User admin5 = new User("Admin 5", "admin5@gmail.com", "Admin", "Male");
        List<User> users = new ArrayList<>();
        users.add(admin1);
        users.add(admin2);
        users.add(admin3);
        users.add(admin4);
        users.add(admin5);
        model.addAttribute("users", users);
        return "users";
    }
}


/**
 * Model.java
 * Spring Framework proporciona una interfaz llamada Modelo (I) para trabajar con los datos.
 * Define un marcador de posición para los atributos del modelo y está diseñado principalmente
 * para agregar atributos al modelo. También se usa para transferir datos entre la vista y
 * el controlador de la aplicación Spring MVC. La interfaz del modelo está disponible en el paquete
 * org.springframework.ui . Actúa como un contenedor de datos que contiene los datos de la aplicación.
 * Que los datos almacenados pueden ser de cualquier forma, como cadena, objeto, datos de la base de datos, etc
 * <p>
 * Interfaz que define un titular para los atributos del modelo.
 * Diseñado principalmente para agregar atributos al modelo.
 * Permite acceder al model general como java.util.Map
 * <p>
 * En Spring MVC, el modelo funciona como un contenedor que contiene los datos de la aplicación.
 * Aquí, los datos pueden tener cualquier forma, como objetos, cadenas, información de la base de datos, etc.
 * <p>
 * Es necesario colocar la interfaz del Modelo en la parte del controlador de la aplicación.
 * El objeto de HttpServletRequest lee la información proporcionada por el usuario y la pasa
 * a la interfaz del Modelo . Ahora, una página de visualización accede fácilmente a los datos de la pieza del modelo.
 */
