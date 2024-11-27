package cesde.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "plomeria")
public class Plomeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plomeriaId")
    private int plomeriaId;

    @Column(name = "servicioId")
    private int servicioId;

    @Column(name = "materialId")
    private int materialId;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructor vacío
    public Plomeria() {
    }

    // Constructor con parámetros
    public Plomeria(int plomeriaId, int servicioId, int materialId, String descripcion) {
        this.plomeriaId = plomeriaId;
        this.servicioId = servicioId;
        this.materialId = materialId;
        this.descripcion = descripcion;
    }

    // Getters
    public int getPlomeriaId() {
        return plomeriaId;
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
    public void setPlomeriaId(int plomeriaId) {
        this.plomeriaId = plomeriaId;
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
