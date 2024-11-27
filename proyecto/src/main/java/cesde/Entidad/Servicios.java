package cesde.Entidad;

import javax.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicio_Id")
    private int servicioId;

    @Column(name = "nombre_Servicio")
    private String nombreServicio;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructor vacío
    public Servicios() {
    }

    public Servicios(int servicioId, String nombreServicio, String descripcion) {
        this.servicioId = servicioId;
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public int getServicioId() {
        return servicioId;
    }

    public void setServicioId(int servicioId) {
        this.servicioId = servicioId;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
