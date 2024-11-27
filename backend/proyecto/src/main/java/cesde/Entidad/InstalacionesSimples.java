package cesde.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "instalacionesSimples")
public class InstalacionesSimples {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instalacionesId")
    private Integer instalacionesId;

    @Column(name = "servicioId")    
    private int servicioId;

    @Column(name = "detalleInstalacion")
    private String detalleInstalacion;

    // Constructor vacío
    public InstalacionesSimples() {
    }

    // Constructor con parámetros
    public InstalacionesSimples(int instalacionesId, int servicioId, String detalleInstalacion) {
        this.instalacionesId = instalacionesId;
        this.servicioId = servicioId;
        this.detalleInstalacion = detalleInstalacion;
    }

    // Getters
    public int getInstalacionesId() {
        return instalacionesId;
    }

    public int getServicioId() {
        return servicioId;
    }

    public String getDetalleInstalacion() {
        return detalleInstalacion;
    }

    // Setters
    public void setInstalacionesId(int instalacionesId) {
        this.instalacionesId = instalacionesId;
    }

    public void setServicioId(int servicioId) {
        this.servicioId = servicioId;
    }

    public void setDetalleInstalacion(String detalleInstalacion) {
        this.detalleInstalacion = detalleInstalacion;
    }
}