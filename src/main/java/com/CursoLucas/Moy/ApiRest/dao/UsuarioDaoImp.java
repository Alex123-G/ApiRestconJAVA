package com.CursoLucas.Moy.ApiRest.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.CursoLucas.Moy.ApiRest.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//! ESTA CLASE VA IMPLEMENTAR LA INTERFAZ Y VA TENER QUE TENER OBLIGADAMENTE LOS METODOS DE LA INTERFAZ 

//* "@Repository" Hace referencia a que va tener la funcionalidad de poder acceder al repositorio de la BD 
@Repository
// * "Transactional" hace referencia a como va ejecutar las sentencias sql que
// * seran en forma de transaccion (leer para mas)
@Transactional
public class UsuarioDaoImp implements UsuariodDao {

 // todo "@PersistenceContext" esta anotacion va ser el contexto a la base de
 // datos y la variable "entityManager" nos va servir para poder hacer la
 // conexion a la BD.

 @PersistenceContext
 private EntityManager entityManager;

 // * Se crea la anotacino "override" para indicar que se va SOBREESCRBIR LA
 // * FUNCION es decir que ca cambiar de contenido la funcion, osea que en la
 // * interfaz se declara la funcion y donde se llame la interfaz se crear el
 // * codigo de la funcion, ESTO SE TIENE QUE SER DEBIDO A UN PATRO DE DISEÑO
 // * (colocar patro de diseño)
 @Override
 public List<Usuario> getUsuarios() {
  // TODO Auto-generated method stub
  return null;
 }

}
