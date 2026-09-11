public class Libro {
    protected String titulo, autor;
    protected int anno;
    protected boolean disponible;

    public Libro(String titulo, String autor, int anno, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anno = anno;
        this.disponible = disponible;
    }
}
