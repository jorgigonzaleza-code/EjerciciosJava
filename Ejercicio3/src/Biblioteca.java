import java.util.ArrayList;

public class Biblioteca
{
    private ArrayList<Libro> conjuntoLibros;

    public Biblioteca() {
        conjuntoLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        conjuntoLibros.add(libro);
    }

    public void mostrarDatos(){
        System.out.println("---BIBLIO---");

        for (Libro libro : conjuntoLibros) {
            System.out.println(libro);

        }
    }

}
