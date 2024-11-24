import { enviar } from "../controllers/controllerContact.js";
import { registrar } from "../controllers/controllerRegistrate.js";

let contacto = document.getElementById("btnEnviar");
if (contacto) {
  contacto.addEventListener("click", enviar);
}

let registro = document.getElementById("btnRegistrar");
if (registro) {
  registro.addEventListener("click", registrar);
}

