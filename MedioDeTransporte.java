
import java.util.ArrayList;
import java.util.List;

public abstract class MedioDeTransporte {
    private String indice;
    private int añoCreacion;
    private List<Mantenimiento> mantenimientos;

    public MedioDeTransporte(String indice, int añoCreacion) {
        this.indice = indice;
        this.añoCreacion = añoCreacion;
        this.mantenimientos = new ArrayList<>();
    }

    public String getIndice() {
        return indice;
    }

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        mantenimientos.add(mantenimiento);
    }

    public void agregarMantenimientos(List<Mantenimiento> mantenimientos){
        this.mantenimientos.addAll(mantenimientos);
    }

    public List<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }

    public abstract void avanzar();
    public abstract void virar();
}

