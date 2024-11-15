public class Materiales {
    private int material_Id;
    private int proveedor_id;
    private String nombreMaterial;
    private String tipoMaterial;
    private int cantidadStock;
    private double precioUnitario;
    private localDate fechaAdquisicion;
    private String estado;

    public Materiales (int material_Id, int proveedor_id, String nombreMaterial, String tipoMaterial, String cantidadStock, double precioUnitario, String tipoMaterial, int fechaAdquisicion, String estado){
        this.material_Id = material_Id;
        this.proveedor_id = proveedor_id;
        this.nombreMaterial = nombreMaterial;
        this.tipoMaterial = tipoMaterial;
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
        this.fechaAdquisicion = fechaAdquisicion;
        this.estado = estado;
    }

    public String getMaterial_Id(){
        return material_Id;
    }
    public String getProveedor_id(){
        return proveedor_id;
    }
    public String getNombreMaterial(){
        return nombreMaterial;
    }
    public String getTipoMaterial(){
        return tipoMaterial;
    }
    public int getCantidadStock(){
        return cantidadStock;
    }
    public int getPrecioUnitario(){
        return precioUnitario;
    }
    public int getFechaAdquisición(){
        return fechaAdquisicion;
    }
    public String getEstado(){
        return estado;
    }

    public static void (String[] args){
        Materiales materiales = new materiales ("gfdgf");
        System.out.println("Materiales:" get.nombreMaterial());
        System.out.println("cantidad en Stock= " get.cantidadStock()); //y así sucesivamente

    }
}