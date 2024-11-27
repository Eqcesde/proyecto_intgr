package cesde.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "materiales")
public class Materiales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id")
    private int materialId;

    @Column(name = "nombre_material")
    private String nombreMaterial;

    @Column(name = "tipo_material")
    private String tipoMaterial;

    @Column(name = "proveedor_id")
    private int proveedorId;

    @Column(name = "cantidad_disponible")
    private int cantidadDisponible;

    // Constructor vacío
    public Materiales() {
    }

    // Constructor con parámetros
    public Materiales(int materialId, String nombreMaterial, String tipoMaterial, int proveedorId, int cantidadDisponible) {
        this.materialId = materialId;
        this.nombreMaterial = nombreMaterial;
        this.tipoMaterial = tipoMaterial;
        this.proveedorId = proveedorId;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters
    public int getMaterialId() {
        return materialId;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    // Setters
    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
