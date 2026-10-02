public abstract class Clase {

    protected String nombre;
    protected int cupoMaximo,duracion;

    public Clase() {
    }

    public Clase(String nombre, int cupoMaximo, int duracion) {
        this.setNombre(nombre);
        this.setCupoMaximo(cupoMaximo);
        this.setDuracion(duracion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Nombre no puede ser nulo ni vacio");
        }
        this.nombre = nombre;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo < 1 || cupoMaximo > 30){
            throw new IllegalArgumentException("Cupo maximo debe estar en el rango entre 1 y 30");
        }
        this.cupoMaximo = cupoMaximo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0){
            throw new IllegalArgumentException("Duracion debe ser un valor mayor a 0");
        }
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "nombre='" + nombre + '\'' +
                ", cupoMaximo=" + cupoMaximo +
                '}';
    }

    public abstract double calcularCosto();
}
