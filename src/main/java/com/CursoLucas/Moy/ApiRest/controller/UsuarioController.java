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

	@GetMapping(value = "usuario")
	public List<Usuario> editar() {
		List<Usuario> usuarios = new ArrayList<>();
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Alex");
		usuario1.setApellido("Gallozo");
		usuario1.setEmail("alexCorreo");
		usuario1.setTelefono("1234");
		usuario1.setPassword(null);

		Usuario usuario2 = new Usuario();
		usuario2.setNombre("Lucas");
		usuario2.setApellido("Marron");
		usuario2.setEmail("correo");
		usuario2.setTelefono("asda");
		usuario2.setPassword("asdasd");

		Usuario usuario3 = new Usuario();
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
