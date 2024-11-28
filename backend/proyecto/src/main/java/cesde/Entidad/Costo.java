package cesde.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "costos")
public class Costo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "costo_id")
    private int costoId;

    @Column(name = "material_id")
    private int materialId;

    @Column(name = "mano_obra")
    private double manoDeObra;

    @Column(name = "transporte")
    private double transporte;

    @Column(name = "impuestos")
    private double impuestos;

    // Constructor vacío
    public Costo() {
    }

    // Constructor con parámetros
    public Costo(int costoId, int materialId, double manoDeObra, double transporte, double impuestos) {
        this.costoId = costoId;
        this.materialId = materialId;
        this.manoDeObra = manoDeObra;
        this.transporte = transporte;
        this.impuestos = impuestos;
    }

    // Getters
    public int getCostoId() {
        return costoId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public double getManoDeObra() {
        return manoDeObra;
    }

    public double getTransporte() {
        return transporte;
    }

    public double getImpuestos() {
        return impuestos;
    }

    // Setters
    public void setCostoId(int costoId) {
        this.costoId = costoId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public void setManoDeObra(double manoDeObra) {
        this.manoDeObra = manoDeObra;
    }

    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
}
