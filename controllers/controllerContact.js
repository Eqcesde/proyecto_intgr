import { contactos } from "../models/modelContact.js";

export function enviar() {
  let nombre = document.getElementById("nombre").value;
  let email = document.getElementById("email").value;
  let mensaje = document.getElementById("mensaje").value;

  let newContacto = {
    nombre: nombre,
    correoElectronico: email,
    mensaje: mensaje,
  };
  contactos.push(newContacto); //coloca el registro en la ultima pocisión
  console.log(contactos);


}

export function crearRegistroContact(){
 
  for (let index = 0; index < contactos.length; index++) {
   
    let registro = document.createElement("tr");
    let nombre = document.createElement("td");
    let email = document.createElement("td");
    let mensaje = document.createElement("td");
    let acciones = document.createElement("td");
    let editar = document.createElement("button");
    let eliminar = document.createElement("button");

    nombre.textContent = contactos[index].nombre;
    email.textContent = contactos[index].email;
    mensaje.textContent = contactos[index].mensaje;

    acciones.append(editar, eliminar);
    registro.append(nombre, email, mensaje,acciones);

    document.getElementById("contactos").append(registro);
  }
}

// tabla para registrar y almacenar los datos (definir con el profe si se debe hacer)







