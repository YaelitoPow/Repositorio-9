public abstract class MedioDeTransporteAnimal extends MedioDeTransporte {

    public MedioDeTransporteAnimal(String nombre, String indice, int añoCreacion){
        super(nombre, añoCreacion);
    }

    public abstract void preparar();
    public abstract void parar();
    
}
