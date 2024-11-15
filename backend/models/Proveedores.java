public class Proveedores {
    private String proveedor_id;
    private String nombre_proveedor;
    private int  telefono;
    private String  direccion;
    private String  correo;

    public Proveedores (String proveedor_id, String nombre_proveedor,  int telefono, String direccion, String correo){
        this.proveedor_id = proveedor_id;
        this.nombre_proveedor = nombre_proveedor;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;

    }
    public String getProveedor_id(){
        return proveedor_id;
    }
    public String getNombre_proveedor(){
        return nombre_proveedor;
    }
    public int getTelefono(){
        return telefono;

    }
    public String getDireccion(){
        return direccion;
    }
    public String getCorreo(){
        return correo;
    }

    public void setNombre_proveedor(String nombre_proveedor){
        this.nombre_proveedor = nombre_proveedor;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

        public static void Main(String[] args){
            Proveedores proveedor = new Proveedores("001", "Proveedor 1", 1234567890, "Calle Falsa 123", "proveedor1@correo.com");

            System.out.println("Identidad del Proveedor: " + proveedor.getProveedor_id());
            System.out.println("Nombre del proveedor: " + proveedor.getNombre_proveedor());
            System.out.println("Telefono Proveedor: " + proveedor.getTelefono());
            System.out.println("Direccion del Proveedor: " + proveedor.getDireccion());
            System.out.println("Correo del Proveedor: " + proveedor.getCorreo());
        }
    }
