import { listarRegistros } from "../controllers/controllerRegistrate.js";

document.getElementById("btnRegistro").addEventListener("click", listarRegistros);

import { crearRegistroContact } from "../controllers/controllerContact.js";

document.getElementById("btnEnviar").addEventListener("click", crearRegistroContact);