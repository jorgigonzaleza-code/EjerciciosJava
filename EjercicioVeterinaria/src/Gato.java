public class Gato extends Mascota {
    private String pedigri;

    public Gato() {
    }

    public Gato(String nombre, double peso, int edad, int diasAlojamiento, boolean supervision, String pedigri) {
        super(nombre, peso, edad, diasAlojamiento, supervision);
        this.pedigri = pedigri;
    }

    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "pedigri='" + pedigri + '\'' +
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
        System.out.println("---GATO---");
        System.out.println("Pedigri: " + this.getPedigri());
    }
}
