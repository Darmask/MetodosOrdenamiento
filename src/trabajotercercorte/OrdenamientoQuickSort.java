
package trabajotercercorte;

/**
 *
 * @author Tamayo
 */
public class OrdenamientoQuickSort {
    public void ordenarquicksort(int[] vector2) {
        vector2 = quicksort1(vector2);
    }

    public int[] quicksort1(int numeros[]) {
        return quicksort2(numeros, 0, numeros.length - 1);
    }

    public int[] quicksort2(int numeros[], int izq, int der) {
        if (izq >= der) {
            return numeros;
        }
        int i = izq, d = der;
        if (izq != der) {
            int pivote;
            int aux;
            pivote = izq;
            while (izq != der) {
                while (numeros[der] >= numeros[pivote] && izq < der) {
                    der--;
                }
                while (numeros[izq] < numeros[pivote] && izq < der) {
                    izq++;
                }
                if (der != izq) {
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }

                if (izq == der) {
                    quicksort2(numeros, 1, izq - 1);
                    quicksort2(numeros, izq + 1, d);
                }
            }
        } else {
            return numeros;
        }
        return numeros;
    }
}
