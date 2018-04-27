package trabajotercercorte;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author Tamayo
 */
public class TrabajoTercerCorte {

    public static void main(String[] args) {
        int vector[] = new int[5];
        int opcion;
        int elegir;
        int aux;
        int salir = 0;
        boolean cambios = false;

        try {
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1-Ordenamiento Burbuja\n"
                        + "2-Ordenamiento Shell\n"
                        + "3-Ordenamiento Quicksort\n"
                        + "4-Ordenamiento de arreglos\n"
                        + "5-Salir\n", "Menu de opciones"));

                switch (opcion) {
                    case 1:
                        elegir = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Metodo de Ordenamiento Burbuja \n"
                                + "1-Insertar Datos\n"
                                + "2-Listar Datos Ingresados \n "
                                + "3-Ordenar Datos \n"
                                + "4-Salir\n", "Menu de opciones"));

                        switch (elegir) {
                            case 1:
                                Arreglo.Ingresar(vector);
                                break;
                            case 2:
                                Arreglo.Mostrar(vector);
                                break;
                            case 3:
                                JTextArea jama_Muestre = new JTextArea();
                                jama_Muestre.setText("Vector Organizado\n");
                                Arreglo obj = new Arreglo();
                                obj.ordenarBurbuja(vector);
                                for (int i = 0; i < vector.length; i++) {
                                    jama_Muestre.append(" " + vector[i]);
                                }
                                JOptionPane.showMessageDialog(null, jama_Muestre);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Su opcion no existe");
                        }

                        break;
                    case 2:
                        elegir = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Metodo de Ordenamiento Shell \n"
                                + "1-Insertar Datos\n"
                                + "2-Listar Datos Ingresados \n "
                                + "3-Ordenar Datos \n"
                                + "4-Salir\n", "Menu de opciones"));

                        switch (elegir) {
                            case 1:
                                Arreglo.Ingresar(vector);
                                break;
                            case 2:
                                Arreglo.Mostrar(vector);
                                break;
                            case 3:
                                JTextArea jama_Muestre = new JTextArea();
                                jama_Muestre.setText("Vector Organizado\n");
                                Arreglo.shell(vector);
                                for (int i = 1; i < vector.length; i++) {
                                    jama_Muestre.append(" " + vector[i]);
                                }
                                JOptionPane.showMessageDialog(null, jama_Muestre);
                            default:
                                JOptionPane.showMessageDialog(null, "Su opcion no existe");
                        }

                        break;
                    case 3:
                        elegir = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Metodo de Ordenamiento Quicksort \n"
                                + "1-Insertar Datos\n"
                                + "2-Listar Datos Ingresados \n "
                                + "3-Ordenar Datos \n"
                                + "4-Salir\n", "Menu de opciones"));
                        switch (elegir) {
                            case 1:
                                Arreglo.Ingresar(vector);
                                break;
                            case 2:
                                Arreglo.Mostrar(vector);
                                break;
                            case 3:
                                JTextArea jama_Muestre = new JTextArea();
                                jama_Muestre.setText("Vector Organizado\n");
                                OrdenamientoQuickSort o = new OrdenamientoQuickSort();
                                o.ordenarquicksort(vector);
                                for (int i = 0; i < vector.length; i++) {
                                    jama_Muestre.append(" " + vector[i]);
                                }
                                JOptionPane.showMessageDialog(null, jama_Muestre);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Su opcion no existe");
                        }

                        break;
                    case 4:
                        elegir = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Metodo de Ordenamiento de arreglos \n"
                                + "1-Insertar Datos\n"
                                + "2-Listar Datos Ingresados \n "
                                + "3-Ordenar Datos \n"
                                + "4-Salir\n", "Menu de opciones"));
                        switch (elegir) {
                            case 1:
                                Arreglo.Ingresar(vector);
                                break;
                            case 2:
                                Arreglo.Mostrar(vector);
                                break;
                            case 3:
                                JTextArea jama_Muestre = new JTextArea();
                                jama_Muestre.setText("Vector Organizado\n");
                                for (int i = 1; i < vector.length; i++) {
                                    if (vector[i] < vector[i - 1]) {
                                        aux = vector[i];
                                        vector[i] = vector[i - 1];
                                        vector[i - 1] = aux;
                                        cambios = true;

                                    }
                                }
                                for (int i = 0; i < vector.length; i++) {
                                    jama_Muestre.append(" " + vector[i]);
                                }
                                JOptionPane.showMessageDialog(null, jama_Muestre);
                                break;

                        }
                    case 5:
                        JOptionPane.showMessageDialog(null, "Usted selecciono salir");
                        salir = 1;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Su opcion no existe");

                }
            } while (salir == 0);

        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
        }
    }

}
