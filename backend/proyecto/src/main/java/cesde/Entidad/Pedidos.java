package cesde.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_id") 
    private int pedidoId;

    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido; 

    @Column(name = "fecha_entrega")
    private LocalDate fechaEntrega; 

    @Column(name = "cliente_Id")
    private int clienteId;

    @Column(name = "estado")
    private String estado;


    // Constructor vacío
    public Pedidos() {
    }

    // Constructor con parámetros
    public Pedidos(int pedidoId, int clienteId, LocalDate fechaPedido, LocalDate fechaEntrega, String estado, String telefono) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    // Getters
    public int getPedidoId() {
        return pedidoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }


    // Setters
    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
