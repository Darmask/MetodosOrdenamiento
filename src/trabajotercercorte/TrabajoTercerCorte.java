package trabajotercercorte;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamayo
 */
public class TrabajoTercerCorte {

    public static void main(String[] args) {
        int opcion;
        String elegir;
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1-Ordenamiento Burbuja\n"
                    + "2-Ordenamiento Shell\n"
                    + "3-Ordenamiento Quicksort\n"
                    + "4-Ordenamiento de arreglos\n"
                    + "5-Salir\n", "Menu de opciones"));
            
            switch(opcion){
                case 1 :
                    JOptionPane.showMessageDialog(null,
                            "Metodo de Ordenamiento Burbuja \n"
                            + "A-Insertar Datos\n"
                            + "B-Listar Datos Ingresados \n "
                            + "C-Ordenar Datos");
                    break;
                case 2 :
                    JOptionPane.showMessageDialog(null,
                            "Metodo de Ordenamiento Shell \n"
                            + "A-Insertar Datos\n"
                            + "B-Listar Datos Ingresados \n "
                            + "C-Ordenar Datos");
                    break;
                case 3 :
                    JOptionPane.showMessageDialog(null,
                            "Metodo de Ordenamiento Quicksort \n"
                            + "A-Insertar Datos\n"
                            + "B-Listar Datos Ingresados \n "
                            + "C-Ordenar Datos");
                    break;
                case 4 :
                    JOptionPane.showMessageDialog(null,
                            "Metodo de Ordenamiento de arreglos \n"
                            + "A-Insertar Datos\n"
                            + "B-Listar Datos Ingresados \n "
                            + "C-Ordenar Datos");
                    break;
            }

        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
        }
    }

}
