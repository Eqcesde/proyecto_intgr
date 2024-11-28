import { registros} from "../models/modelRegistrate.js";

export function registrar() {
  let nombre = document.getElementById("nombre").value;
  let telefono = document.getElementById("telefono").value;
  let direccion = document.getElementById("direccion").value;
  let email = document.getElementById("email").value;

  let newRegistro = {
    nombre: nombre,
    telefono: telefono,
    direccion: direccion,
    correoElectronico: email,

    
  };
  registros.push(newRegistro);
  console.log(registros);
}

export function listarRegistros() {

  for (let index = 0; index < registros.length; index++) {
    
    let registro = document.createElement("tr");
    let nombre = document.createElement("td");
    let telefono = document.createElement("td");
    let direccion = document.createElement("td");
    let email = document.createElement("td");
    let acciones = document.createElement("td");
    let editar = document.createElement("button");
    let eliminar = document.createElement("button");

    nombre.textContent = registros[index].nombre
    telefono.textContent = registros[index].telefono
    direccion.textContent = registros[index].direccion
    email.textContent = registros[index].email

    acciones.append(editar, eliminar);
    registro.append(nombre, telefono, direccion, email, acciones);

    document.getElementById("registros").append(registro);
  }
}
