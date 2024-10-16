public class Empresa 
{
    protected String nombre;
    protected Flota flota;

    public Empresa (String nombre){

        this.nombre = nombre;
        this.flota = new Flota();

    }

    public String getNombre(){
        return nombre;
    }

    public Flota getFlota(){
        return flota;
    }

    @Override
    public String toString(){
        return "Empresa: " +nombre;
    }
    
}