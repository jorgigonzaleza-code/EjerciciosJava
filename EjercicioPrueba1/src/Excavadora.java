public class Excavadora extends Maquina implements Certificable {
    private double peso;
    private boolean mantencionAlDia,certificacionSeguridad;

    public Excavadora() {
    }



    public Excavadora(String codigoMaquina, int horasUso, int potencia, double peso, boolean mantencionAlDia) {
        super(codigoMaquina, horasUso, potencia);
        this.setPeso(peso);
        this.setMantencionAlDia(mantencionAlDia);
        this.setCertificacionSeguridad(false);
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

    @Override
    public double calcularCosto() {
        double costo = 150000;
        if (!mantencionAlDia){
             costo = costo * 1.25;
        }
        return costo;

    }

    @Override
    public boolean estaCertificada() {
        return certificacionSeguridad;
    }

    @Override
    public void certificar() {
        certificacionSeguridad = true;
    }
}
