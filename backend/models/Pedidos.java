
// Muchachos creo que aca hay que cambiar pedidos por cotizaciones 

import java.util.Date;

public class Pedidos {
    private int pedido_id;
    private int cliente_id;
    private Date fechaPedido;
    private Date fechaEntrega;
    private String estado;

    public Pedidos(int pedido_id, int cliente_id, Date fechaPedido, Date fechaEntrega, String estado) {
        this.pedido_id = pedido_id;
        this.cliente_id = cliente_id;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public int getClienteId() {
        return cliente_id;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public Date getFechaEntrega(){
        return fechaEntrega;
    }

    public String getEstado(){
         return estado;
        }
    

    public static void main(String[] args) {
        Date fechaPedidios = new Date(11111991);
        Date fechaEntrega = new Date();

        Pedidos pedidos = new Pedidos(1, 01, fechaPedidios, fechaEntrega, "Entregado");

        System.out.println("El ID del Pedido Es: " + " " + pedidos.getPedido_id());
        System.out.println("El Id del Cliente Es: " + " " + pedidos.getPedido_id());
        System.out.println("La Fecha del Pedido Es: " + " " + pedidos.getFechaPedido());
        System.out.println("La Fecha de Entrega Es: " + " " + pedidos.getFechaEntrega());
        System.out.println("El Estado Del Pedido Es; " + " " + pedidos.getEstado());
    }

}