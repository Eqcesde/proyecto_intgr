package cesde.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "carpinteria")
public class Carpinteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carpinteriaId")
    private int carpinteriaId;

    @Column(name = "servicioId")
    private int servicioId;

    @Column(name = "materialId")
    private int materialId;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructor vacío
    public Carpinteria() {
    }

    // Constructor con parámetros
    public Carpinteria(int carpinteriaId, int servicioId, int materialId, String descripcion) {
        this.carpinteriaId = carpinteriaId;
        this.servicioId = servicioId;
        this.materialId = materialId;
        this.descripcion = descripcion;
    }

    // Getters
    public int getCarpinteriaId() {
        return carpinteriaId;
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
    public void setCarpinteriaId(int carpinteriaId) {
        this.carpinteriaId = carpinteriaId;
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

