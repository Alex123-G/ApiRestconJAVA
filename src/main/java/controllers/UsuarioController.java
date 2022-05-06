package controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//EN SPRING SE UTILIZAN MUCHO LAS ANOTACION(ESTA SE UTILIZAN COLOCANDO UN ARROBA @) Y EN ESTE CASO
// LA UTILIZAMOS PARA ESPECIFICAR QUE SE VA UTILIZAR COMO UN CONTROLLADOR PARA UNA API REST
@RestController
@EnableAutoConfiguration

public class UsuarioController {

	//Añadiendo cambios
	  @RequestMapping("/home")
	    String home() {
	        return "Hello World!";
	    }
}
