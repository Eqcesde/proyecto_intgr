package cesde.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "electricidad")
public class Electricidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "electricidadId")
    private int electricidadId;

    @Column(name = "servicioId")
    private int servicioId;

    @Column(name = "materialId")
    private int materialId;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructor vacío
    public Electricidad() {
    }

    // Constructor con parámetros
    public Electricidad(int electricidadId, int servicioId, int materialId, String descripcion) {
        this.electricidadId = electricidadId;
        this.servicioId = servicioId;
        this.materialId = materialId;
        this.descripcion = descripcion;
    }

    // Getters
    public int getElectricidadId() {
        return electricidadId;
    }

    public int getServicioId() {
        return servicioId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters
    public void setElectricidadId(int electricidadId) {
        this.electricidadId = electricidadId;
    }

    public void setServicioId(int servicioId) {
        this.servicioId = servicioId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
