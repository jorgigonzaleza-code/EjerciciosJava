public class Digital extends Libro
{
private String formato;
private double tamanoMB;

    public Digital() {
    }

    public Digital(String formato, double tamanoMB) {
        this.formato = formato;
        this.tamanoMB = tamanoMB;
    }

    public Digital(String titulo, String autor, int anno, boolean disponible, String formato, double tamanoMB) {
        super(titulo, autor, anno, disponible);
        this.formato = formato;
        this.tamanoMB = tamanoMB;
    }

    @Override
    public String toString() {
        return "Digital{" +
                "disponible=" + disponible +
                ", anno=" + anno +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", tamanoMB=" + tamanoMB +
                ", formato='" + formato + '\'' +
                '}';
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public void setTamanoMB(double tamanoMB) {
        this.tamanoMB = tamanoMB;
    }


}
