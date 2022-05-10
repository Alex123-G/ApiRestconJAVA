package com.CursoLucas.Moy.ApiRest.controller;

import java.util.ArrayList;
import java.util.List;

import com.CursoLucas.Moy.ApiRest.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//* EN SPRING SE UTILIZAN MUCHO LAS ANOTACION(ESTA SE UTILIZAN COLOCANDO UN ARROBA @) Y EN ESTE CASO
//* LA UTILIZAMOS PARA ESPECIFICAR QUE SE VA UTILIZAR COMO UN CONTROLLADOR PARA UNA API REST
@RestController
public class UsuarioController {

	@RequestMapping(value = "usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Alex");
		usuario.setApellido("Gallozo");
		usuario.setEmail("alexCorreo");
		usuario.setTelefono("1234");
		usuario.setPassword(null);
		return usuario;
	}

	// * @RequestMapping es para indicarle que va ser una ruta para la API,por
	// * defecto es get y se el puede pasar propiedades como el tipo del
	// * metodo(get,post,delete); pero tambien existe GetMapping y este ya indica
	// * que metodo va ser nuestra ruta, en este caso es get osea GetMapping
	@GetMapping(value = "usuario")
	public List<Usuario> editar() {
		List<Usuario> usuarios = new ArrayList<>();
		Usuario usuario1 = new Usuario();
		// ? para el "id" es un tipo int PERO nos sale un error si solo colocamos el
		// ? numero,esto es porque es un "LONG int" y es para numero grandes hay
		// ? diferentes forma de solucionar esto PERO PARA ESTE CASO LE VAMOS AGREGAR
		// ? LA LETRA "L" para que se entienda que el numero es Long
		usuario1.setId(345l);
		usuario1.setNombre("Alex");
		usuario1.setApellido("Gallozo");
		usuario1.setEmail("alexCorreo");
		usuario1.setTelefono("1234");
		usuario1.setPassword(null);

		Usuario usuario2 = new Usuario();
		usuario1.setId(145l);
		usuario2.setNombre("Lucas");
		usuario2.setApellido("Marron");
		usuario2.setEmail("correo");
		usuario2.setTelefono("asda");
		usuario2.setPassword("asdasd");

		Usuario usuario3 = new Usuario();
		usuario1.setId(45l);
		usuario3.setNombre("Dilan");
		usuario3.setApellido("Roco");
		usuario3.setEmail("afe");
		usuario3.setTelefono("684asd");
		usuario3.setPassword("asdads");

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		return usuarios;
	}

}
