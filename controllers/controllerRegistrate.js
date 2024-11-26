import { registros} from "../models/modelRegistrate.js";

export function registrar() {
  let email = document.getElementById("email").value;
  let password = document.getElementById("password").value;

  let newRegistro = {
    correoElectronico: email,
    contraseña: password,
  };
  registros.push(newRegistro);
  console.log(registros);
}

export function listarRegistros() {
  
  for (let index = 0; index < registros.length; index++) {
    
    let registro = document.createElement("tr");
    let email = document.createElement("td");
    let password = document.createElement("td");
    let acciones = document.createElement("td");
    let editar = document.createElement("button");
    let eliminar = document.createElement("button");
    
    email.textContent = registros[index].email
    password.textContent = registros[index].password
    
    acciones.append(editar, eliminar);
    registro.append(email, password, acciones);
    
    document.getElementById("registros").append(registro);
  }
}
