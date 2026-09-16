public class Conejo extends Mascota {
    private String dieta;

    public Conejo() {
    }

    public Conejo(String nombre, double peso, int edad, int diasAlojamiento, boolean supervision, String dieta) {
        super(nombre, peso, edad, diasAlojamiento, supervision);
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "Conejo{" +
                "dieta='" + dieta + '\'' +
                super.toString() + '}';
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
        System.out.println("---CONEJO---");
        System.out.println("Dieta: " + this.getDieta());
    }
}
