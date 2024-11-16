import java.util.Date;

public class Materiales {
    private int materialId;
    private int proveedorId;
    private String nombreMaterial;
    private String tipoMaterial;
    private int cantidadStock;
    private double precioUnitario;
    private Date fechaAdquisicion;
    private String estado;

    // Constructor
    public Materiales(int materialId, int proveedorId, String nombreMaterial, String tipoMaterial, int cantidadStock, 
                      double precioUnitario, Date fechaAdquisicion, String estado) {
        this.materialId = materialId;
        this.proveedorId = proveedorId;
        this.nombreMaterial = nombreMaterial;
        this.tipoMaterial = tipoMaterial;
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
        this.fechaAdquisicion = fechaAdquisicion;
        this.estado = estado;
    }

    // Getters
    public int getMaterialId() {
        return materialId;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public String getEstado() {
        return estado;
    }

    public static void main(String[] args) {
        Date fechaAdquisicion = new Date(11111991); 

        Materiales materiales = new Materiales(1, 101, "Cedro", "Madera", 100, 250000, fechaAdquisicion, "Entregado");

        System.out.println("Material:" + " " + materiales.getNombreMaterial());
        System.out.println("Cantidad en stock:" + " " + materiales.getCantidadStock());
        System.out.println("Tipo de material:" + " " + materiales.getTipoMaterial());
        System.out.println("Precio unitario:" + " " + materiales.getPrecioUnitario());
        System.out.println("Fecha de Adquisicion" + " " + materiales.getFechaAdquisicion());
        System.out.println("Estado:" + " " + materiales.getEstado());
    }
}
