public abstract class Libro
{
    protected String titulo, autor;
    protected int anno;
    protected boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anno, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anno = anno;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInformacion() {
        System.out.println("titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anno: " + anno);
    }
}
