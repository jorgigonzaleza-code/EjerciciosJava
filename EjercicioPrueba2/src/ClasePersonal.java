public class ClasePersonal extends Clase implements Cancelable{

    private String nombreInstructor;
    private boolean evaluacionFisica,cancelacionActiva;

    public ClasePersonal() {
    }

    public ClasePersonal(String nombre, int cupoMaximo, int duracion, String nombreInstructor, boolean evaluacionFisica) {
        super(nombre, cupoMaximo, duracion);
        this.setNombreInstructor(nombreInstructor);
        this.setEvaluacionFisica(evaluacionFisica);
        this.setCancelacionActiva(false);
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public boolean isEvaluacionFisica() {
        return evaluacionFisica;
    }

    public void setEvaluacionFisica(boolean evaluacionFisica) {
        this.evaluacionFisica = evaluacionFisica;
    }

    public boolean isCancelacionActiva() {
        return cancelacionActiva;
    }

    public void setCancelacionActiva(boolean cancelacionActiva) {
        this.cancelacionActiva = cancelacionActiva;
    }

    @Override
    public String toString() {
        return "ClasePersonal{" +
                "nombre='" + nombre + '\'' +
                ", cupoMaximo=" + cupoMaximo +
                '}';
    }

    @Override
    public boolean cancelacionActiva() {
        return cancelacionActiva;
    }

    @Override
    public void activartCancelacion() {
        cancelacionActiva = true;
    }

    @Override
    public double calcularCosto() {
        double costo = 35000;
        if (!evaluacionFisica){
            costo = costo * 1.2;
        }
        return costo;
    }
}
