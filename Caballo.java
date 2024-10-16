public class Caballo extends MedioDeTransporte {
    public Caballo(String indice, int añoCreacion) {
        super(indice, añoCreacion);
    }

    public void preparar() {
        System.out.println("El caballo está preparado.");
    }

    public void descansar() {
        System.out.println("El caballo está descansando.");
    }

    @Override
    public void avanzar() {
        System.out.println("El caballo avanza.");
    }

    @Override
    public void virar() {
        System.out.println("El caballo vira.");
    }
}

