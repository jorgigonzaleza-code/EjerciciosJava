public class Main
{
    public static void main(String[] args) {

        Fisico libro1 = new Fisico("El principico", "Antoine", 1943, true, 50, "Disponible");
        Digital libro2 = new Digital("Harry potter", "Anne", 1950, true, "Digital", 500);
        Digital libro3 = new Digital("pdf", 21.4);

        libro1.mostrarInformacion();
        System.out.println("------");
        libro1.mostrarInformacionFisico();
        System.out.println(libro1);
        System.out.println("---");
        System.out.println(libro2);
        System.out.println(libro3);

    }
}
