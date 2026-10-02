public class ClaseSemipersonal extends Clase{

    private int cantidadParticipantes;

    public ClaseSemipersonal() {
    }

    public ClaseSemipersonal(String nombre, int cupoMaximo, int duracion, int cantidadParticipantes) {
        super(nombre, cupoMaximo, duracion);
        this.setCantidadParticipantes(cantidadParticipantes);
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

    @Override
    public String toString() {
        return "ClaseSemipersonal{" +
                "nombre='" + nombre + '\'' +
                ", cupoMaximo=" + cupoMaximo +
                '}';
    }

    @Override
    public double calcularCosto() {
        double costo = 18000;
        if (cantidadParticipantes > 3){
            costo = costo * 1.1;
        }
        return costo;
    }
}
