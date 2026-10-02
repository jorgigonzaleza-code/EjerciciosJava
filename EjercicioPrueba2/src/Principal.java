public class Principal {

    public static void main(String[] args){

        try {
            ClasePersonal clasep1 = new ClasePersonal("Yoga",1,60,"Camila Rojas",false);
            ClasePersonal clasep2 = new ClasePersonal("Pilates",1,50,"Diego Soto",true);

            ClaseSemipersonal claseS1 = new ClaseSemipersonal("Yoga",4,60,5);
            ClaseSemipersonal claseS2 = new ClaseSemipersonal("Spinning",3,45,2);

            clasep1.activartCancelacion();

            GestorCentro gestor = new GestorCentro();
            gestor.agregarClase(clasep1);
            gestor.agregarClase(clasep2);
            gestor.agregarClase(claseS1);
            gestor.agregarClase(claseS2);

            System.out.println("=== BUSQUEDA POR NOMBRE ===");
            for (Clase clase : gestor.buscarClase("Yoga")){
                System.out.println(clase);
                System.out.println("Costo: $" + clase.calcularCosto());
            }

            System.out.println("=== LISTADO DE CLASES ===");
            for (Clase clase : gestor.getListaClases()){
                System.out.println(clase);
                System.out.println("Costo: $" + clase.calcularCosto());
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
