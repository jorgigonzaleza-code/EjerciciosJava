public class Excavadora extends Maquina {
    private double peso;
    private boolean mantencionAlDia,certificacionSeguridad;

    public Excavadora() {
    }

    public Excavadora(String codigoMaquina, int horasUso, int potencia, double peso, boolean mantencionAlDia, boolean certificacionSeguridad) {
        super(codigoMaquina, horasUso, potencia);
        this.peso = peso;
        this.mantencionAlDia = mantencionAlDia;
        this.certificacionSeguridad = certificacionSeguridad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMantencionAlDia() {
        return mantencionAlDia;
    }

    public void setMantencionAlDia(boolean mantencionAlDia) {
        this.mantencionAlDia = mantencionAlDia;
    }

    public boolean isCertificacionSeguridad() {
        return certificacionSeguridad;
    }

    public void setCertificacionSeguridad(boolean certificacionSeguridad) {
        this.certificacionSeguridad = certificacionSeguridad;
    }
}
