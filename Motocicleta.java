public class Motocicleta extends MedioDeTransporte {
    public Motocicleta(String indice, int añoCreacion) {
        super(indice, añoCreacion);
    }

    public void encender() {
        System.out.println("La motocicleta está encendida.");
    }

    public void apagar() {
        System.out.println("La motocicleta está apagada.");
    }

    @Override
    public void avanzar() {
        System.out.println("La motocicleta avanza.");
    }

    @Override
    public void virar() {
        System.out.println("La motocicleta vira.");
    }
}
