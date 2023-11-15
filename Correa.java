import java.util.ArrayList;

public class Correa{
    private String nombre;
    private ArrayList<Object> correaTransportadora;
    public Correa(){
        correaTransportadora = new ArrayList<>();
    }
    public void addTransporte(Object transporte){
        correaTransportadora.add(transporte);
    }
    public void removeTransporte(Object transporte){
        correaTransportadora.remove(transporte);
    }
    public void removeTransporte(int indice){
        correaTransportadora.remove(indice);
    }
    public ArrayList<Object> getCorrea(){
        return this.correaTransportadora;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Modificar la clase Correa para que se genere un atributo para la cantidad de mineral de cada tipo en la correa.
}
