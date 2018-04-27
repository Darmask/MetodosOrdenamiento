package trabajotercercorte;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author Tamayo
 */
public class Arreglo {

    public static void Ingresar(int[] vector) {
        String dato;
        int numero;
        for (int i = 0; i < vector.length; i++) {
            dato = JOptionPane.showInputDialog(null, "Ingrese valor para la posicion " + i);
            numero = Integer.parseInt(dato);
            vector[i] = numero;
        }
    }
    
    public static void Mostrar(int[] vector) {
        JTextArea jama_Muestre = new JTextArea();
        jama_Muestre.setText("VECTOR\n");
        for (int j = 0; j < vector.length; j++) {
            jama_Muestre.append(" " + vector[j]);
          }
        JOptionPane.showMessageDialog(null, jama_Muestre);
        
    }

    public void ordenarBurbuja(int[] vector) {
        int aux;
        boolean cambios = false;
        while (true) {
            cambios = false;
            for (int i = 1; i < vector.length; i++) {
                if (vector[i] < vector[i - 1]) {
                    aux = vector[i];
                    vector[i] = vector[i - 1];
                    vector[i - 1] = aux;
                    cambios = true;

                }
            }
            if (cambios == false) {
                break;
            }
        }
    }

    public static void shell(int[] vector) {
        int salto, aux, i;
        boolean cambios;
        for (salto = vector.length / 2; salto != 0; salto /= 2) {
            cambios = true;

            while (cambios) {
                cambios = false;
                for (i = salto; i < vector.length; i++) {

                    if (vector[i - salto] > vector[i]) {
                        aux = vector[i];

                        vector[i] = vector[i - salto];

                        vector[i - salto] = aux;

                        cambios = true;

                    }
                }
            }
        }
    }
    
}
