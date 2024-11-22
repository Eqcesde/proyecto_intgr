package cesde.Entidad;
import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int edad;
    private String correo;
    private String direccion;
    private int telefono;

        public Clientes() {
    }

    public Clientes(String clienteId, String nombreCliente, int edad, String correo, String direccion, int telefono){
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name ="correo")
    private String correo;

    @Column(name="dirección")
    private String direccion;

    @Column(name="teléfono")
    private int telefono;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';
}
}
