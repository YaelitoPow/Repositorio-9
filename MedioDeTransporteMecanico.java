public abstract class MedioDeTransporteMecanico extends MedioDeTransporte {
    private boolean encendido;

    public MedioDeTransporteMecanico(String nombre, String identificador, int añoCreacion) {
        super(nombre, añoCreacion);
        this.encendido = false;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El vehículo está encendido.");
        } else {
            System.out.println("El vehículo ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El vehículo se ha apagado.");
        } else {
            System.out.println("El vehículo ya está apagado.");
        }
    }

    public boolean isEncendido() {
        return encendido;
    }
}
