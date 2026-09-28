public class CargadorFrontal extends Maquina{
    private double capacidadBalde;

    public CargadorFrontal() {
    }

    public CargadorFrontal(String codigoMaquina, int horasUso, int potencia, double capacidadBalde) {
        super(codigoMaquina, horasUso, potencia);
        this.capacidadBalde = capacidadBalde;
    }

    public double getCapacidadBalde() {
        return capacidadBalde;
    }

    public void setCapacidadBalde(double capacidadBalde) {
        this.capacidadBalde = capacidadBalde;
    }
}
