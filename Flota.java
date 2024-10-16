import java.util.ArrayList;
import java.util.List;

public class Flota {
    
    protected List<MedioDeTransporte> medios;

    public Flota (){

        this.medios = new ArrayList<>();

    }

    public void agregarMedio(MedioDeTransporte medio){
        medios.add(medio);
    }

    public void agregarMedios(List <MedioDeTransporte> listaMedios){
        medios.addAll(listaMedios);
    }

    public void eliminarMedio(String indice){
        //lambda
        medios.removeIf(m -> m.getIndice().equals(indice));
    }

    public List<MedioDeTransporte> getListaMedios(){
        return medios;
    }

    public int getCantidadMedios(){
        return medios.size();
    }

}
