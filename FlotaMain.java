import java.util.Arrays;

public class FlotaMain {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa cool");

        //Crear medios de transporte
        Motocicleta motocicleta = new Motocicleta("M123", 2018);
        Caballo caballo = new Caballo("C456", 2010);

        //Agregar mantenimientos
        Mantenimiento m1 = new Mantenimiento("Cambio de aceite", "2024-10-15", 150.0);
        Mantenimiento m2 = new Mantenimiento("Revisión general", "2024-09-10", 300.0);

        motocicleta.agregarMantenimiento(m1);
        caballo.agregarMantenimientos(Arrays.asList(m1, m2));

        //Agregar medios a la flota
        empresa.getFlota().agregarMedio(motocicleta);
        empresa.getFlota().agregarMedio(caballo);

        System.out.println("Medios en la flota:");
        for (MedioDeTransporte medio : empresa.getFlota().getListaMedios()) {
            System.out.println(medio.getIndice());
        }
        motocicleta.encender();
        motocicleta.avanzar();
        motocicleta.virar();
        motocicleta.apagar();

        caballo.preparar();
        caballo.avanzar();
        caballo.descansar();
    }
}
