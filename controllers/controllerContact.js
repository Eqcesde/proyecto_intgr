import { contactos } from "../models/modelContact.js"

export function enviar(){

    let nombre = document.getElementById('nombre').value
    let email = document.getElementById('email').value
    let mensaje = document.getElementById('mensaje').value
    
    let newContacto = {
        nombre: nombre,
        correoElectronico: email,
        mensaje: mensaje
    }
    contactos.push(newContacto)
    console.log(contactos);
    


}
