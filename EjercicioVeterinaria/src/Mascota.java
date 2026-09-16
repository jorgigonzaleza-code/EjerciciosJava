public abstract class Mascota {
    protected String nombre, IdMascota;
    protected double peso;
    protected int edad,diasAlojamiento;
    protected boolean supervision;

    public Mascota() {
    }

    public Mascota(String nombre, double peso, int edad, int diasAlojamiento, boolean supervision) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.diasAlojamiento = diasAlojamiento;
        this.supervision = supervision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasAlojamiento() {
        return diasAlojamiento;
    }

    public void setDiasAlojamiento(int diasAlojamiento) {
        this.diasAlojamiento = diasAlojamiento;
    }

    public boolean isSupervision() {
        return supervision;
    }

    public void setSupervision(boolean supervision) {
        this.supervision = supervision;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                ", diasAlojamiento=" + diasAlojamiento +
                ", supervision=" + supervision +
                '}';
    }

    public abstract void mostrarInformacion();
}
