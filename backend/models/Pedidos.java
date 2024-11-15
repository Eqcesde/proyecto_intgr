import java.util.ArrayList;
import java.util.Date;

public class Pedidos{
    private int pedido_id;
    private int cliente_id;
    private localDate fechaPedido;
    private localDate fechaEntrega;
    private String estado;

    public Pedidos (int pedido_id, int cliente_id, localDate fechaPedido, localDate fechaEntrega, String estado){
        this.pedido_id = pedido_id;
        this.cliente_id = cliente_id;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    public int getPedido_id(){
        return pedidoId;
    }
    public int getClienteId(){
        return cliente_id;
    }
    public localDate getFechaPedido(){
        return fechaPedido;
    }
    public localDate getFechaEntrega(){
        return fechaEntrega;
    }
    public static void main (String[]args){
        Pedidos pedidos = new pedidos("dskjfhdksj");
        System.out.println("Los pedidos son:" get.pedidos());
    }


}