public class App {
    public static void main(String[] args) throws Exception {
        // Instanciamos la clase
        MetodoOrdenamientoInsercion ordenar = new MetodoOrdenamientoInsercion();
        boolean imprimir = true;
        int[] arreglo = {5, 9, 2, 7, 4, 10};
        ordenar.sortInsercion(arreglo, imprimir);
        ordenar.inprimirArray(arreglo);
    }
}