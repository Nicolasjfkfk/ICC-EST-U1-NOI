import java.util.Arrays;

public class MetodoOrdenamientoInsercion {
    public int[] sortInsercion(int[] arreglo, Boolean logs) {
        int tamanio = arreglo.length;
        
        for (int i = 1; i < tamanio; i++) {
            if (logs) {
                System.out.println("pasada: " + i);
            }
            
            int aux = arreglo[i];
            int j = i - 1;
            
            if (logs) {
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
            }
            
            while (j >= 0 && arreglo[j] > aux) {
                if (logs) {
                    System.out.println("\t\tComparamos " + aux + " con " + arreglo[j]);
                }
                
                arreglo[j + 1] = arreglo[j];
                j--;
                
                if (logs) {
                    System.out.println("\t\t--------" + Arrays.toString(arreglo));
                }
            }
            
            arreglo[j + 1] = aux;
            
            if (logs) {
                System.out.println("\t--------" + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }

    public void inprimirArray(int[] arreglo) {
        for (Object elem : arreglo) {
            System.out.print(elem + " ");
        }
    }
}