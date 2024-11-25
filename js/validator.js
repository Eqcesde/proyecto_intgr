import { registrar} from "../controllers/controllerRegistrate.js";
import { enviar } from "../controllers/controllerContact.js";

let registro = document.getElementById("btnRegistrar");
if (registro) {
  registro.addEventListener("click", registrar);
}


let contacto = document.getElementById("btnEnviar");
if (contacto) {
  contacto.addEventListener("click", enviar);
}



