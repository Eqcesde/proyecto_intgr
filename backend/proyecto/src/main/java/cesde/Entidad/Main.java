package cesde.Entidad;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");

    //-----------------------------------------------------------------------------------------------
//PEDIDO
    public static void main(String[] args) {
        crearPedido(01, LocalDate.of(2024, 7, 12), LocalDate.of(2024, 8, 13), 05, "Nuevo pedido: resuelto");
        Pedidos pedido = leerPedido(1L);
        if (pedido != null) {
            System.out.println("PedidoID: " + pedido.getPedidoId() +
                   " Fecha del pedido: " + pedido.getFechaPedido() +
                   " Fecha entrega del pedido: " + pedido.getFechaEntrega() +
                   " ClienteID: " + pedido.getClienteId() +
                   " Estado del pedido: " + pedido.getEstado());
        actualizarPedido(01, LocalDate.of(2021, 10, 12), LocalDate.of(2024, 11, 12), 05, "Resuelto");
        eliminarPedido(01L);
}
    // -----------------------------------------------------------------------------------------------
// PRECIO
    crearPrecio(01, 01, 89000, 0.1, "2 años");
    Precios precio = leerPrecio(1L);
    if (precio != null) {
        System.out.println(
            "ServicioID: " + precio.getServicioId() + 
            " Costo total: " + precio.getCosto() + 
            " Descuento: " + precio.getDescuento() + 
            " Vigencia: " + precio.getVigencia()
        );
    }
    actualizarPrecio(01, 01, 95000, 0.5, "1 año");
    eliminarPrecio(01L);

    emf.close();

    // -----------------------------------------------------------------------------------------------
// PROVEDOR
    crearProveedor(01, "Electric Wise", "5482830",  "calle 78 n56", "elecWisesascolombia@gmail.com");
        Proveedores proveedores = leerProveedor(1L);

        if (proveedores != null){
            System.out.println(
                "ID proveedor: " + proveedores.getProveedorId() + "\n" +
                "Nombre proveedor: " + proveedores.getNombreProveedor() + "\n" +
                "Contacto: " + proveedores.getContacto() + "\n" +
                "Teléfono: " + proveedores.getTelefono() + "\n" +
                "Dirección: " + proveedores.getDireccion() + "\n" +
                "Correo: " + proveedores.getCorreo()
            );
        }
        actualizarProveedor(01,"Elec Wise ", "4828305", "calle 78 n56", "elecWisesas@gmail.com");
        eliminarProveedor(01L);
        emf.close();
    
    //-----------------------------------------------------------------------------------------------
//MATERIALES

        crearMateriales(01, "Listones de madera", "Tabla de madera maciza", 07, 10);
        Materiales materiales = leerMateriales(1L);

        if(materiales != null){
            System.out.println(
                        "MaterialId:" + materiales.getNombreMaterial()+
                        "Tipo de material:" + materiales.getTipoMaterial()+ 
                        "ProveedorID:" + materiales.getProveedorId()+ 
                        "Cantidad disponible en materiales:" + materiales.getCantidadDisponible());
        }

        actualizarMaterial(01, "Listones de madera", "Tabla de madera maciza", 07, 12);
        eliminarMaterial(1L);

        emf.close();
        //--------------------------------------------CLIENTE---------------------------------------------------

        crearCliente(1L, "Santiago", 23, "santi12@gmail.com", "calle 50 n°2", "4444444");
        Clientes cliente = leerCliente(1L);
        if(cliente !=null){
            System.out.println(
                "ClienteId:" + cliente.getClienteId()+
                "Nombre" +  cliente.getNombre()+ 
                "Apellido:" + cliente.getApellido()+ 
                "Correo" + cliente.getCorreo()+
                "Teléfono" + cliente.getTelefono() +
                "Dirección" +  cliente.getDireccion());
        }
        actualizarCliente(1L, "Santiago", 23, "santi12@gmail.com", "calle 50 n°2", "44445555");
        eliminarCliente(1L);

        emf.close();
        
        }
    
    //-----------------------------------------------------------------------------------------------
//COSTOS

        /*crearCostos(1, 101, 250.0, 50.0, 18.0);
        Costo costo = leerCosto(1);
        if (costo != null) {
            System.out.println("Costo leído: " +
                    "Material ID: " + costo.getMaterialId() +
                    ", Mano de Obra: " + costo.getManoDeObra() +
                    ", Transporte: " + costo.getTransporte() +
                    ", Impuestos: " + costo.getImpuestos());
        }

        actualizarCosto(1, 101, 300.0, 60.0, 20.0);
        eliminarCosto(1);
        emf.close();
        
    
}
        */

// ---------------------------------------CLIENTES--------------------------------------------------------
public static void crearCliente(Long clienteId, String nombre, int edad, String correo, String direccion, String telefono) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();

    Clientes cliente = new Clientes();
    cliente.setClienteId(clienteId);
    cliente.setNombre(nombre);
    cliente.setEdad(edad);
    cliente.setCorreo(correo);
    cliente.setDireccion(direccion);
    cliente.setTelefono(telefono);

    em.persist(cliente);

    em.getTransaction().commit();
    em.close();
}

public static Clientes leerCliente(Long id) {
    EntityManager em = emf.createEntityManager();
    Clientes cliente = em.find(Clientes.class, id);
    em.close();
    return cliente;
}


public static void actualizarCliente(Long id, String nuevoNombre, int nuevaEdad, String nuevoCorreo, String nuevaDireccion, String nuevoTelefono) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();

    Clientes cliente = em.find(Clientes.class, id);
    if (cliente != null) {
        cliente.setNombre(nuevoNombre);
        cliente.setEdad(nuevaEdad);
        cliente.setCorreo(nuevoCorreo);
        cliente.setDireccion(nuevaDireccion);
        cliente.setTelefono(nuevoTelefono);
        em.merge(cliente); 
    }

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
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Pedidos pedido = new Pedidos();
        pedido.setPedidoId(pedidoId);
        pedido.setClienteId(clienteId);
        pedido.setFechaEntrega(fechaEntrega);
        pedido.setFechaPedido(fechaPedido);
        pedido.setEstado(estado);

        em.persist(pedido);
        em.getTransaction().commit();
        em.close();
    }

    public static Pedidos leerPedido(Long pedidoId) {
        EntityManager em = emf.createEntityManager();
        Pedidos pedido = em.find(Pedidos.class, pedidoId);
        em.close();
        return pedido;
    }

    public static void actualizarPedido(int pedidoId, LocalDate fechaPedido, LocalDate fechaEntrega, int clienteId,
            String estado) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Pedidos pedido = em.find(Pedidos.class, pedidoId);
        if (pedido != null) {
            pedido.setPedidoId(pedidoId);
            pedido.setFechaPedido(fechaPedido);
            pedido.setFechaEntrega(fechaEntrega);
            pedido.setClienteId(clienteId);
            pedido.setEstado(estado);
        }
        em.getTransaction().commit();
        em.close();
    }

    public static void eliminarPedido(Long pedidoId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Pedidos pedido = em.find(Pedidos.class, pedidoId);
        if (pedido != null) {
            em.remove(pedido);
        }
        em.getTransaction().commit();
        em.close();
    }

    // ------------------------------------------PRECIO--------------------------------------------------------


    public static void crearPrecio(int precioId, int servicioId, double costo, double descuento, String vigencia) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Precios precio = new Precios();
        precio.setPrecioId(precioId);
        precio.setServicioId(servicioId);
        precio.setCosto(costo);
        precio.setDescuento(descuento);
        precio.setVigencia(vigencia);

        em.persist(precio);
        em.getTransaction().commit();
        em.close();
    }

    public static Precios leerPrecio(Long precioId) {
        EntityManager em = emf.createEntityManager();
        Precios precio = em.find(Precios.class, precioId);
        em.close();
        return precio;
    }

    public static void actualizarPrecio(int precioId, int servicioId, double costo, double descuento, String vigencia) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Precios precio = em.find(Precios.class, precioId);
        if (precio != null) {
            precio.setPrecioId(precioId);
            precio.setServicioId(servicioId);
            precio.setCosto(costo);
            precio.setDescuento(descuento);
            precio.setVigencia(vigencia);
        }
        em.getTransaction().commit();
        em.close();
    }

    public static void eliminarPrecio(Long precioId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Precios precio = em.find(Precios.class, precioId);
        if (precio != null) {
            em.remove(precio);
        }
        em.getTransaction().commit();
        em.close();
    }

// ------------------------------------------PROVEEDORES--------------------------------------------------------

public static void crearProveedor(int proveedorId, String nombreProveedor, String telefono, String direccion, String correo) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Proveedores proveedor = new Proveedores();
    proveedor.setProveedorId(proveedorId);
    proveedor.setNombreProveedor(nombreProveedor);
    proveedor.setTelefono(telefono);
    proveedor.setDireccion(direccion);
    proveedor.setCorreo(correo);
    em.persist(proveedor);
    em.getTransaction().commit();
    em.close();
}

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

// ------------------------------------------COSTOS---------------------------------------------------------
// ------------------------------------------INSTALACIONES SIMPLES--------------------------------------------
// ------------------------------------------CARPINTERÍA--------------------------------------------------------
// ------------------------------------------PLOMERÍA--------------------------------------------------------
// ------------------------------------------ELECTRICIDAD--------------------------------------------------------
}