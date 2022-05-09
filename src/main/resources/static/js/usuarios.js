// Call the dataTable ususario jQuery plugin
$(document).ready(function () {
	consultarUsuarios();
	$("#usuarios").DataTable();
});

async function consultarUsuarios() {
	try {
		const request = await fetch("http://localhost:8080/usuario");
		const usuarios = await request.json();
		console.log(usuarios);
	} catch (error) {
		console.log(error);
	}
}
