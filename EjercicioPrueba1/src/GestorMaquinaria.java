import java.util.ArrayList;

public class GestorMaquinaria {

    private ArrayList<Maquina> listaMaquinas;

    public GestorMaquinaria() { listaMaquinas = new ArrayList<>();}

    public void registrarMaquinas(Maquina maquina) {

        listaMaquinas.add(maquina);
        System.out.println(maquina.getCodigoMaquina() + "("+maquina.getClass().getName()+") registrada correctamente" );
    }

    public ArrayList<Maquina> buscarPorCodigo(String codigo) {

        ArrayList<Maquina> encontradas = new ArrayList<>();
        for (Maquina maquina : listaMaquinas) {
            if (maquina.getCodigoMaquina().equalsIgnoreCase(codigo)){
                encontradas.add(maquina);
            }
        }
        return encontradas;
    }

    public ArrayList<Maquina> getListaMaquinas() {
        return listaMaquinas;
    }
}
