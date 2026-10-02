import java.util.ArrayList;

public class GestorCentro {

    public ArrayList<Clase> listaClases;

    public GestorCentro() {listaClases = new ArrayList<>();}

    public void agregarClase(Clase clase){
        listaClases.add(clase);
        System.out.println(clase.getNombre() + "(" + clase.getClass().getName() + ") registrada correctamente");
    }

    public ArrayList<Clase> buscarClase(String nombre){
        ArrayList<Clase> encontradas = new ArrayList<>();
        for (Clase clase : listaClases) {
            if (clase.getNombre().equalsIgnoreCase(nombre)){
                encontradas.add(clase);
            }

        }
        return encontradas;
    }

    public ArrayList<Clase> getListaClases(){
        return listaClases;
    }
}
