public interface Calculo {
    //public final int VALOR_DIA_ALOJAMIENTO = 25000
    int VALOR_DIA_ALOJAMIENTO = 25000;
    double INCREMENTO_PERRO = 0.07; //si solo sale 3 veces al dia
    double INCREMENTO_GATO = 0.05;
    double DESCUENTO_CONEJO = 0.07;

    //public abstract  void calculoFinalAlojamiento(int dias);
    void calculoFinalAlojamiento(int dias, int veces);
}
