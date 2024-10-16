public class Mantenimiento {
    
    protected String tipo;
    protected String fecha;
    protected double costo;

    public Mantenimiento(String tipo, String fecha, double costo){

        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;

    }

    @Override
    public String toString(){
        return "Mantenimiento[" + "tipo= '" + tipo + "\'" + ", fecha = '" + fecha + "\'" + ", costo= " + costo + "]";
    }

}
