package cesde.Entidad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");

    public static void main(String[] args) {
        Long C1 = 1L; // ID de cliente
        
        
        //CREAR CLIENTE
        Clientes cliente = crearCliente(C1, "Juan José Loaiza", 28, "juanjloa@gmail.com", "calle junin 50", 4444444);
        if (cliente != null) {
            System.out.println("Cliente creado: " + cliente.getNombre());
        }

        // ACTUALIZAR DATOS
        actualizarCliente(C1, "Juan José Loaiza", 28, "juanjloaiza97@gmail.com", "calle junin 50", 4444444);

        // ELIMINAR CLIENTE
        eliminarCliente(C1);

        emf.close(); 
    }

    // CREAR CLIENTE
    public static Clientes crearCliente(Long clienteId, String nombre, int edad, String correo, String direccion, int telefono) {
        EntityManager em = emf.createEntityManager();
      
        //BLOQUE try-catch-finally
        try {
            em.getTransaction().begin();
            Clientes cliente = new Clientes(); 
            cliente.setClienteId(clienteId); 
            cliente.setNombre(nombre);
            cliente.setEdad(edad);
            cliente.setCorreo(correo);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            em.persist(cliente); // GUARDA Y ALMACENA EL OBJETO Cliente en BD
            em.getTransaction().commit(); 

        } catch (Exception e) { //CATCH E, contiene los detalles del errr
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Rollback en caso de error (revierte cambios antes de que se haga la transacción)
            }
            e.printStackTrace(); //muestra en consola el eerror que ocurrió y dónde fue.
            return null;
        } finally {
            em.close(); 
        }
    }

<<<<<<< Updated upstream
    // ACTUALIZAR DATOS CLIENTE
    public static void actualizarCliente(Long clienteId, String nombre, int edad, String correo, String direccion, int telefono) {
=======
    em.getTransaction().commit();
    em.close();
}


public static void eliminarCliente(Long id) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();

    Clientes cliente = em.find(Clientes.class, id);
    if (cliente != null) {
        em.remove(cliente); 
    }

    em.getTransaction().commit();
    em.close();
}
    // ---------------------------------------PEDIDOS--------------------------------------------------------

    public static void crearPedido(int pedidoId, LocalDate fechaPedido, LocalDate fechaEntrega, int clienteId,
            String estado) {
>>>>>>> Stashed changes
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Clientes cliente = em.find(Clientes.class, clienteId); //Busca el cliente por ID
            if (cliente != null) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setCorreo(correo);
                cliente.setDireccion(direccion);
                cliente.setTelefono(telefono);
                em.merge(cliente);
                em.getTransaction().commit(); 
                System.out.println("Cliente actualizado: " + cliente.getNombre());
            } else {
                System.out.println("Cliente no encontrado.");
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close(); 
        }
    }

    // ELIMINAR CLIENTE
    public static void eliminarCliente(Long clienteId) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Clientes cliente = em.find(Clientes.class, clienteId);
            if (cliente != null) {
                em.remove(cliente); /
                em.getTransaction().commit(); 
                System.out.println("Cliente eliminado.");
            } else {
                System.out.println("Cliente no encontrado.");
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); 
            }
            e.printStackTrace(); 
        } finally {
            em.close(); 
        }
    }
}
<<<<<<< Updated upstream
=======

public static Proveedores leerProveedor(Long proveedorId) {
    EntityManager em = emf.createEntityManager();
    Proveedores proveedor = em.find(Proveedores.class, proveedorId);
    em.close();
    return proveedor;
}

public static void actualizarProveedor(int proveedorId, String nombreProveedor, String telefono, String direccion, String correo) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Proveedores proveedor = em.find(Proveedores.class, proveedorId);
    if (proveedor != null) {
        proveedor.setNombreProveedor(nombreProveedor);
        proveedor.setTelefono(telefono);
        proveedor.setDireccion(direccion);
        proveedor.setCorreo(correo);
    }
    em.getTransaction().commit();
    em.close();
}

public static void eliminarProveedor(Long proveedorId) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Proveedores proveedor = em.find(Proveedores.class, proveedorId);
    if (proveedor != null) {
        em.remove(proveedor);
    }
    em.getTransaction().commit();
    em.close();
}


// ------------------------------------------MATERIALES--------------------------------------------------------
public static void crearMateriales(int materialId, String nombreMaterial, String tipoMaterial, int proveedorId, int cantidadDisponible) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Materiales material = new Materiales();
    material.setMaterialId(materialId);
    material.setNombreMaterial(nombreMaterial);
    material.setTipoMaterial(tipoMaterial);
    material.setProveedorId(proveedorId);
    material.setCantidadDisponible(cantidadDisponible);

    em.persist(material);
    em.getTransaction().commit();
    em.close();
}

public static Materiales leerMateriales(Long materialId) {
    EntityManager em = emf.createEntityManager();
    Materiales material = em.find(Materiales.class, materialId);
    em.close();
    return material;
}

public static void actualizarMaterial(int materialId, String nombreMaterial, String tipoMaterial, int proveedorId, int cantidadDisponible) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Materiales material = em.find(Materiales.class, materialId);
    if (material != null) {
        material.setMaterialId(materialId);
        material.setNombreMaterial(nombreMaterial);
        material.setTipoMaterial(tipoMaterial);
        material.setProveedorId(proveedorId);
        material.setCantidadDisponible(cantidadDisponible);
    }
    em.getTransaction().commit();
    em.close();
}

public static void eliminarMaterial(Long materialId) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Materiales material = em.find(Materiales.class, materialId);
    if (material != null) {
        em.remove(material);
    }
    em.getTransaction().commit();
    em.close();
}

// ------------------------------------------COSTOS--------------------------------------------------------
// ------------------------------------------INSTALACIONES SIMPLES--------------------------------------------
// ------------------------------------------CARPINTERÍA--------------------------------------------------------
// ------------------------------------------PLOMERÍA--------------------------------------------------------
// ------------------------------------------ELECTRICIDAD--------------------------------------------------------
}
>>>>>>> Stashed changes
