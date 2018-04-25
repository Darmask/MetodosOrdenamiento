package trabajotercercorte;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamayo
 */
public class TrabajoTercerCorte {

    public static void main(String[] args) {
        int opcion;
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1-Ordenamiento Burbuja\n"
                    + "2-Ordenamiento Shell.\n"
                    + "3-Ordenamiento Quicksort\n"
                    + "4-Ordenamiento de arreglos.\n"
                    + "5-Salir\n", "Menu de opciones"));
            
            

        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
        }
    }

}
