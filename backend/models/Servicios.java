public class Servicios {
    private int servicioId;
    private String nombreServicio;

    public Servicios(int servicioid, String nombreServicio) {
        this.servicioId = servicioid;
        this.nombreServicio = nombreServicio;

    }

    public int getServicioId() {
        return servicioId;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public static void main(String[] args) {
        Servicios servicios = new Servicios(01, "carpintería");

        System.out.println("Identidad Del Servicio" + " " + servicios.getServicioId());
        System.out.println("Nombre del servicio:" + " " + servicios.getNombreServicio());
    }
}