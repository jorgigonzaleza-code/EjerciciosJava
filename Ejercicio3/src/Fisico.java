public class Fisico extends Libro
{

    private int numeroPaginas;
    private String estado;

    public Fisico(){
        // super();
    }

    public Fisico(String titulo, String autor, int anno, boolean disponible, int numeroPaginas, String estado) {
        super(titulo, autor, anno, disponible);
        this.numeroPaginas = numeroPaginas;
        this.estado = estado;

    }

    public void mostrarInformacionFisico() {
        System.out.println("titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anno: " + anno);
        System.out.println("N Pag: " + numeroPaginas);
        System.out.println("Estado: " + estado);
    }
}
