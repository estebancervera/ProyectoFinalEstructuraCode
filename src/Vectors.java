import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Vectors {

    public static void main() {

        Vector<String> vector = new Vector<String>();
        int opcion = 0;
        String elemento;
        int posicion;
        do{
            try {
                Object opcionO = (JOptionPane.showInputDialog(null,
                        "1. Agregar una Palabra\n" +
                                "2. Accesar una Palabra\n" +
                                "3. Eliminar una Palabra\n" +
                                "4. Busqueda de una palabra\n" +
                                "5. Mostrar el vector\n" +
                                "6. Salir\n" +
                                "Elige una Opcion", "Vectores", JOptionPane.QUESTION_MESSAGE));

                if (opcionO == null) {
                    opcion = 6;
                } else {
                    opcion = Integer.parseInt(opcionO.toString());
                }

                switch (opcion) {
                    case 1:
                        elemento = (JOptionPane.showInputDialog(null, "Ingresa una palabra", "Agregar Palabra", JOptionPane.QUESTION_MESSAGE));
                        vector.add(elemento);
                        break;
                    case 2:
                        if (!vector.isEmpty()) {
                            posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la posicion de la palabra que desea accesar.", "Accesar Palabra", JOptionPane.QUESTION_MESSAGE));
                            if (posicion <= vector.size() - 1 && posicion >= 0) {
                                JOptionPane.showMessageDialog(null, "La palabra: " + vector.get(posicion) + " esta en la posicion: " + posicion);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que escribio es mayor o menor al vector");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El vector esta vacio.");
                        }


                        break;
                    case 3:
                        if (!vector.isEmpty()) {
                            posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la posicion de la palabra que desea eliminar.", "Eliminar Palabra", JOptionPane.QUESTION_MESSAGE));


                            if (posicion <= vector.size() - 1 && posicion >= 0) {
                                JOptionPane.showMessageDialog(null, "La palabra: " + vector.get(posicion) + " fue eliminada correctamente!");
                                vector.removeElementAt(posicion);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que escribio es mayor o menor al vector");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El vector esta vacio.");
                        }

                        break;
                    case 4:
                        if (!vector.isEmpty()) {
                            elemento = (JOptionPane.showInputDialog(null, "Ingresa la palabra que desea buscar.", "Buscar Palabra", JOptionPane.QUESTION_MESSAGE));
                            if (vector.contains(elemento)) {
                                JOptionPane.showMessageDialog(null, "La palabra: " + elemento + " esta en la posicion: " + vector.indexOf(elemento));
                            } else {
                                JOptionPane.showMessageDialog(null, "La palabra: " + elemento + "  no esta en el vector");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El vector esta vacio.");
                        }
                        break;
                    case 5:
                        if (!vector.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Vector: \n" + vector.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "El vector esta vacio.");
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Ejercicio Finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta ","Error", JOptionPane.INFORMATION_MESSAGE);

                }

            }catch( NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El Input no es valido");
            }
        }while(opcion != 6);


    }
}

