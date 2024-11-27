package cesde.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "precios")
public class Precios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "precio_id")
    private int precioId;

    @Column(name = "servicio_id")
    private int servicioId;

    @Column(name = "costo")
    private double costo;

    @Column(name = "descuento")
    private double descuento;

    @Column(name = "vigencia")
    private String vigencia;

    // Constructor vacío
    public Precios() {
    }

    // Constructor con parámetros
    public Precios(int precioId, int servicioId, double costo, double descuento, String vigencia) {
        this.precioId = precioId;
        this.servicioId = servicioId;
        this.costo = costo;
        this.descuento = descuento;
        this.vigencia = vigencia;
    }

    // Getters
    public int getPrecioId() {
        return precioId;
    }

    public int getServicioId() {
        return servicioId;
    }

    public double getCosto() {
        return costo;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getVigencia() {
        return vigencia;
    }

    // Setters
    public void setPrecioId(int precioId) {
        this.precioId = precioId;
    }

    public void setServicioId(int servicioId) {
        this.servicioId = servicioId;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }
}
