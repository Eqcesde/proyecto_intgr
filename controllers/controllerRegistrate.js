import { registros } from "../frontend/models/modelRegistrate";

export function registrar(){

    let email = document.getElementById('email').value
    let contrasena = document.getElementById('contrasena').value

    let newRegistro = {
        email: email,
        contrasena: contrasena
    }
    registros.push(newRegistro)
    console.log(registros);
    
}