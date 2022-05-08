package com.CursoLucas.Moy.ApiRest.models;

public class Usuario {
	// Long nos indica que la variable id va ser grande o larga,no especificamos el
	// tipo de dato que es
	// es deicr puede ser un int ,string u otro tipo de dato, solo le especificamos
	// que va ser grande
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String password;

	// Getters and Setters
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
