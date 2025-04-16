import programacomposicioncono.Cono;

/**
 * Clase principal que demuestra la creación y uso de objetos Cono.
 *
 */
public class ProgramaComposicionCono {

    /**
     * Método para imprimir un objeto en la consola.
     *
     */
    private static void imprimir(Object datos) {
        System.out.println(datos);
    }

    /**
     * Punto de entrada principal del programa.
     *
     * Crea 5 conos con radios aleatorios entre 1 y 9, altura secuencial (1 a 5)
     * y color "Azul", luego imprime sus detalles.
     */
    public static void main(String[] args) {
        java.util.Random aleatorio = new java.util.Random();

        for (int i = 1; i <= 5; i++) {
            int radio = aleatorio.nextInt(9) + 1;  // Radio aleatorio entre 1 y 9
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }
}