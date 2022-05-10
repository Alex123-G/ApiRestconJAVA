package com.CursoLucas.Moy.ApiRest.dao;

import java.util.List;

import com.CursoLucas.Moy.ApiRest.models.Usuario;

//! DAO Hace referencia al acronimo data acces object (objeto de acceso de informacion) Y SON "INTERFACES" , leer para saber mas sobre las interfaces.
// En este caso las interfaces lo que va hacer es obligar cuando se llame a la interfaz a que la clase en la cual se llame OBLIGATORIAMENTE use esos metodos osea que tiene que estar esas funciones,en otras palabras nos sirve para indicarle que funciones va tener que implementarse y el List es para decirle que nos retorne un list,OJO TIENE MAS FUNCIONAES pero para este caso esta bien

//! AQUI VAN TOAS LAS CLASES QUE VAN HACER REFERENCIA CON UNA CLASE QUE SE VA CONECTAR A UNA BASE DE DATOS ES DECIR QUE CONTENDRA LOS CAMPOS NECESARIOS PARA LAS  TABLAS    
public interface UsuariodDao {

 List<Usuario> getUsuarios();

}
