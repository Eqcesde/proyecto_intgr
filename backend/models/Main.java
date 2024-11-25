
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

// Clase Cliente (superclase)


public class Main {
    public static void main(String[] args) {
        // Crear algunos usuarios simulados
        ClientePedido usuario1 = new ClientePedido(1, "Juan", "Pérez", "juan@example.com", "123456789", "Calle Falsa 123");
        ClientePedido usuario2 = new ClientePedido(2, "Ana", "Gómez", "ana@example.com", "987654321", "Avenida Siempre Viva 456");

        // Crear algunos pedidos simulados (heredan la información de los usuarios)
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(101,  LocalDate.of(2024, 8, 1),LocalDate.of(2024, 8, 1).plusDays(10), "Pendiente", 
                               usuario1.getUsuarioId(), usuario1.getNombre(), usuario1.getApellido(), 
                               usuario1.getCorreo(), usuario1.getTelefono(), usuario1.getDireccion()));  // Un día después
        pedidos.add(new Pedido(102,LocalDate.of(2024, 8, 1),LocalDate.of(2024, 8, 1).plusDays(10), "Enviado", 
                               usuario1.getUsuarioId(), usuario1.getNombre(), usuario1.getApellido(), 
                               usuario1.getCorreo(), usuario1.getTelefono(), usuario1.getDireccion()));  // Dos días después
        pedidos.add(new Pedido(103, LocalDate.of(2024, 8, 2),LocalDate.of(2024, 8, 1).plusDays(10), "Entregado", 
                               usuario2.getUsuarioId(), usuario2.getNombre(), usuario2.getApellido(), 
                               usuario2.getCorreo(), usuario2.getTelefono(), usuario2.getDireccion()));  // Tres días después

        // Mostrar los pedidos con la información del usuario (heredada)
        System.out.println("Pedidos de usuario:");
        for (Pedido pedido : pedidos) {
            System.out.println("\nPedido ID: " + pedido.getPedidoId());
            System.out.println("Fecha de Pedido: " + pedido.getFechaPedido());
            System.out.println("Fecha de Entrega: " + pedido.getFechaEntrega());
            System.out.println("Estado del Pedido: " + pedido.getEstadoPedido());
            System.out.println("Usuario ID: " + pedido.getUsuarioId());
            System.out.println("Nombre del Usuario: " + pedido.getNombre());
            System.out.println("Apellido del Usuario: " + pedido.getApellido());
            System.out.println("Correo del Usuario: " + pedido.getCorreo());
            System.out.println("Teléfono del Usuario: " + pedido.getTelefono());
            System.out.println("Dirección del Usuario: " + pedido.getDireccion());
            System.out.println("--------------------------------------------------");
        }
    }
}






