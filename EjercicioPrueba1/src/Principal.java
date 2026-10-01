public class Principal {

    public static void main(String[] args) {
        try {


            Excavadora excavadora1 = new Excavadora("MAQ-EX01", 3200, 210, 18.5, false);
            Excavadora excavadora2 = new Excavadora("MAQ-EX02", 800, 180, 14.0, true);

            CargadorFrontal Cargador1 = new CargadorFrontal("MAQ-CG01", 1500, 150, 3.5);
            CargadorFrontal Cargador2 = new CargadorFrontal("MAQ-CG02", 400, 130, 2.0);

            excavadora1.certificar();

            GestorMaquinaria Gestor = new GestorMaquinaria();

            Gestor.registrarMaquinas(excavadora1);
            Gestor.registrarMaquinas(excavadora2);
            Gestor.registrarMaquinas(Cargador1);
            Gestor.registrarMaquinas(Cargador2);

            System.out.println("===BUSQUEDA POR CODIGO===");
            for (Maquina maquina : Gestor.buscarPorCodigo("MAQ-EX01")) {
                System.out.println(maquina);
                System.out.println("Costo: $" + maquina.calcularCosto());
            }

            System.out.println("\n == Listado Maquinas == ");
            for (Maquina maquina : Gestor.getListaMaquinas()) {
                System.out.println(maquina);
                System.out.println("Costo: $" + maquina.calcularCosto());
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
