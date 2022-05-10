package com.CursoLucas.Moy.ApiRest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//  La anotacion "Entity" la utilizamos para indicar que va ser una Entidad que va ser Referencia a la BD.
@Entity
// Este name va ser referencia a la tabla "usuarios" de nuestra BD asi que debe
// estar escritor igual que en la BD
@Table(name = "usuarios")
public class Usuario {

	// ! Agregando anotacion para que Hibernate sepa que tabla va utilizar ademas
	// ! de las columnas indicandole los nombre segun la BD

	// * Long nos indica que la variable id va ser grande o larga,no especificamos
	// * el
	// * tipo de dato que es
	// * es deicr puede ser un int ,string u otro tipo de dato, solo le
	// * especificamos
	// * que va ser grande.
	// * Agregando la anotacion getter and setter de Lombok que reemplasa los metodo
	// * getters and setters
	// * Tambien agregamos la anotacion Column la cual nos va servir para indicar a
	// * Hibernate el cual es un ORM (como Entity Framework) que columna de la tabla
	// * es esa variable
	@Id
	@Column(name = "id")
	@Getter
	@Setter
	private Long id;

	@Column(name = "nombre")
	@Getter
	@Setter
	private String nombre;

	@Column(name = "apellido")
	@Getter
	@Setter
	private String apellido;

	@Column(name = "email")
	@Getter
	@Setter
	private String email;

	@Column(name = "telefono")
	@Getter
	@Setter
	private String telefono;

	@Column(name = "password")
	@Getter
	@Setter
	private String password;

	// Getters and Setters (para obtener y modicar los valores de la clase Usuario)
	// public String getApellido() {
	// return apellido;
	// }

	// public void setApellido(String apellido) {
	// this.apellido = apellido;
	// }

	// public String getEmail() {
	// return email;
	// }

	// public void setEmail(String email) {
	// this.email = email;
	// }

	// public String getTelefono() {
	// return telefono;
	// }

	// public void setTelefono(String telefono) {
	// this.telefono = telefono;
	// }

	// public void setNombre(String nombre) {
	// this.nombre = nombre;
	// }

	// public String getNombre() {
	// return nombre;

	// }

	// public String getPassword() {
	// return password;
	// }

	// public void setPassword(String password) {
	// this.password = password;
	// }

	// public Long getId() {
	// return id;
	// }

	// public void setId(Long id) {
	// this.id = id;
	// }
}
