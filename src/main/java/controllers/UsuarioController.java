package controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import models.Usuario;

//EN SPRING SE UTILIZAN MUCHO LAS ANOTACION(ESTA SE UTILIZAN COLOCANDO UN ARROBA @) Y EN ESTE CASO
// LA UTILIZAMOS PARA ESPECIFICAR QUE SE VA UTILIZAR COMO UN CONTROLLADOR PARA UNA API REST
@RestController
public class UsuarioController {

	@RequestMapping(value= "usuario/{id}")
	  public Usuario getUsuario(@PathVariable Long id) {
	        Usuario usuario=new Usuario();
	        usuario.setNombre("Alex");
	        usuario.setNombre("Alex");
	        usuario.setId(id);
	        usuario.setApellido("Gallozo");
	        usuario.setEmail("alexCorreo");
	        usuario.setTelefono("1234");
	        usuario.setPassword(null);
	        return usuario;
	    }
	
	@RequestMapping(value= "usuario")
	  public Usuario editar() {
	        Usuario usuario=new Usuario();
	        usuario.setNombre("Alex");
	        usuario.setApellido("Gallozo");
	        usuario.setEmail("alexCorreo");
	        usuario.setTelefono("1234");
	        usuario.setPassword(null);
	        return usuario;
	    }

}
