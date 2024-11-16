public class Clientes{
    private String clienteId;
    private String nombreCliente;
    private int edad;
    private String correo;
    private String direccion;
    private int telefono;

    public Clientes(String clienteId, String nombreCliente, int edad, String correo, String direccion, int telefono){
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
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
    public int getTelefono(){
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public static void main(String [] args){
        Clientes clientes = new Clientes ("01" , "pepito perez", 25, "pepitop@gmail.com", "Calle Cuerna Vaca 53", 4444444);
       
        System.out.println("Id del cliente:" + " " + clientes.getClienteId());
        System.out.println("Nombre del cliente:" + " " + clientes.getNombreCliente());
        System.out.println("Edad del cliente:" + " " + clientes.getEdad());
        System.out.println("Correo del Cliente:" + " " + clientes.getCorreo());
        System.out.println("Direccion del Cliente:" + " " + clientes.getDireccion());
        System.out.println("Telefono del Cliente:"+ " " + clientes.getTelefono());


    }
}