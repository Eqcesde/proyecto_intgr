public class Clientes{
    private String clienteId;
    private String nombreCliente;
    private Int edad;
    private String correo;
    private String direccion;
    private String telefono;

    public Cliente(String clienteId, String nombreCliente, int edad, String correo, String direccion, String telefono){
        this.clienteId = clienteId;
        this.nombreCompledo = nombreCliente;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getClienteId(){
        return clienteId;
    }
    public String  getNombreCliente(){
        return nombreCliente;
    }
    public int getEdad (){
        return edad;
    }
    public String getCorreo(){
        return correo;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono
    }
    public static void (String [] args){
        Cliente cliente = new Cliente ("01" , "pepito perez",25, "pepitop@gmail.com","Calle Cuerna Vaca 53", 4444444);
        System.out.println("Nombre del cliente: " + cliente.getNombreCliente());

    }
}