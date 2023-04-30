package com.gaz.app.sbrammvcthy01.controller;

import com.gaz.app.sbrammvcthy01.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // handeler method to handle variable-expression request:
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("John", "Doe", "johndoe@email.com", "M");
        model.addAttribute("user", user);
        return "variable-expression";
    }
    /** Model.java
     * Spring Framework proporciona una interfaz llamada Modelo (I) para trabajar con los datos.
     * Define un marcador de posición para los atributos del modelo y está diseñado principalmente
     * para agregar atributos al modelo. También se usa para transferir datos entre la vista y
     * el controlador de la aplicación Spring MVC. La interfaz del modelo está disponible en el paquete
     * org.springframework.ui . Actúa como un contenedor de datos que contiene los datos de la aplicación.
     * Que los datos almacenados pueden ser de cualquier forma, como cadena, objeto, datos de la base de datos, etc
     *
     * Interfaz que define un titular para los atributos del modelo.
     * Diseñado principalmente para agregar atributos al modelo.
     * Permite acceder al model general como java.util.Map
     *
     * En Spring MVC, el modelo funciona como un contenedor que contiene los datos de la aplicación.
     * Aquí, los datos pueden tener cualquier forma, como objetos, cadenas, información de la base de datos, etc.
     *
     * Es necesario colocar la interfaz del Modelo en la parte del controlador de la aplicación.
     * El objeto de HttpServletRequest lee la información proporcionada por el usuario y la pasa
     * a la interfaz del Modelo . Ahora, una página de visualización accede fácilmente a los datos de la pieza del modelo.
     */

}
