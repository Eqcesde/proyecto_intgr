


import java.time.LocalDate;


// Clase Cliente (superclase)
class ClientePedido {
    private int usuarioId;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;

    // Constructor
    public ClientePedido(int usuarioId, String nombre, String apellido, String correo, String telefono, String direccion) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters
    public int getUsuarioId() {
        return usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}

// Clase Pedido (subclase que extiende Usuario)
class Pedido extends ClientePedido {
    private int pedidoId;
    private LocalDate fechaPedido;
    private LocalDate fechaEntrega;
    private String estadoPedido;

    // Constructor
    public Pedido(int pedidoId, LocalDate fechaPedido, LocalDate fechaEntrega, String estadoPedido,
            int usuarioId, String nombre, String apellido, String correo, String telefono, String direccion) {
        // Llamar al constructor de la clase base (Usuario)
        super(usuarioId, nombre, apellido, correo, telefono, direccion);

        // Inicializar los campos específicos de Pedido
        this.pedidoId = pedidoId;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.estadoPedido = estadoPedido;
    }

    // Getters
    public int getPedidoId() {
        return pedidoId;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }
}








