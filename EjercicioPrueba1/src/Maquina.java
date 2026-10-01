public abstract class Maquina {
    protected String codigoMaquina;
    protected int horasUso,potencia;

    public Maquina() {
    }

    public Maquina(String codigoMaquina, int horasUso, int potencia) {
        this.setCodigoMaquina(codigoMaquina);
        this.setHorasUso(horasUso);
        this.setPotencia(potencia);
    }

    public String getCodigoMaquina() {
        return codigoMaquina;
    }

    public void setCodigoMaquina(String codigoMaquina) {
        if (codigoMaquina == null || codigoMaquina.trim().isEmpty()){
            throw new IllegalArgumentException("El codigo no puede ser nulo ni vacio");
        }
        this.codigoMaquina = codigoMaquina;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        if (horasUso < 0 || horasUso > 20000) {
            throw new IllegalArgumentException("Las horas deben encontrarse en el rango entre 0 y 20000");
        }
        this.horasUso = horasUso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        if (potencia <= 0) {
            throw new IllegalArgumentException("La potencia debe ser mayor que cero");
        }
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "horasUso=" + horasUso +
                ", codigoMaquina='" + codigoMaquina + '\'' +
                '}';
    }

    public abstract double calcularCosto();

}
