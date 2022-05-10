// Para obtener la tabla por el id "usuarios" con jquery para puder rellenarla con los datos que se enviaran de la API
$(document).ready(function () {
	cargarUsuario();
	$("#usuarios").DataTable();
});

async function cargarUsuario() {
	const request = await fetch("http://localhost:8080/usuario");
	const usuarios = await request.json();
	let listadoHtml = "";

	for (let usuario of usuarios) {
		const usuarioHtml =
			` <tr>
			<td>` +
			usuario.nombre +
			`` +
			usuario.apellido +
			`</td>
				<td>` +
			usuario.email +
			`</td>
				<td>` +
			usuario.telefono +
			`</td>
				<td>
				<a href="#" class="btn btn-danger btn-circle">
				<i class="fas fa-trash"></i>
				</a>
				<a href="#" class="btn btn-info btn-circle">
				<i class="fas fa-info-circle"></i>
				</a>
				</td>
				</tr> `;

		listadoHtml += usuarioHtml;
	}
	document.querySelector("#usuarios tbody").outerHTML = listadoHtml;
}
