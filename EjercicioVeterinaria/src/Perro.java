public class Perro extends Mascota implements Calculo{
    private int horasEjercicio;

    public Perro() {
    }

    public Perro(String nombre, double peso, int edad, int diasAlojamiento, boolean supervision, int horasEjercicio) {
        super(nombre, peso, edad, diasAlojamiento, supervision);
        this.horasEjercicio = horasEjercicio;
    }

    public int getHorasEjercicio() {
        return horasEjercicio;
    }

    public void setHorasEjercicio(int horasEjercicio) {
        this.horasEjercicio = horasEjercicio;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "horasEjercicio=" + horasEjercicio +
                super.toString()+'}';
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("---MASCOTA---");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Dias Alojamiento: " + this.getDiasAlojamiento());
        if (this.isSupervision()){
            System.out.println("Necesita ser supervisado en la noche");
        }
        else {
            System.out.println("No necesita ser supervisado en la noche");
        }
        System.out.println("---PERRO---");
        System.out.println("Horas ejercicio: " + this.getHorasEjercicio());
    }


    @Override
    public void calculoFinalAlojamiento(int dias, int veces) {

        if (veces >= 3)
        {
            double total = dias * (Calculo.VALOR_DIA_ALOJAMIENTO + Calculo.VALOR_DIA_ALOJAMIENTO * Calculo.INCREMENTO_PERRO);
            System.out.println("El valor final es: " + total);
        }
        else
        {
            double total = dias * Calculo.VALOR_DIA_ALOJAMIENTO;
            System.out.println("El valor final es: " + total);
        }
    }
}

