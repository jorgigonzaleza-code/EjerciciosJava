public abstract class Maquina {
    protected String codigoMaquina;
    protected int horasUso,potencia;

    public Maquina() {
    }

    public Maquina(String codigoMaquina, int horasUso, int potencia) {
        this.codigoMaquina = codigoMaquina;
        this.horasUso = horasUso;
        this.potencia = potencia;
    }

    public String getCodigoMaquina() {
        return codigoMaquina;
    }

    public void setCodigoMaquina(String codigoMaquina) {
        this.codigoMaquina = codigoMaquina;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "horasUso=" + horasUso +
                ", codigoMaquina='" + codigoMaquina + '\'' +
                '}';
    }

}
