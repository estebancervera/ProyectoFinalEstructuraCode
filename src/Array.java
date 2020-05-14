import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Array {


    public  static void main(){

        boolean cancel = false;
        int opcion = 0, elemento, size;
        boolean creado = false;
        int[] array = new int[0] ;
        int n = 0;
        int count = 0;
//        do {
//            try {
//                size = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el tamaño del Array", "Crear Array", JOptionPane.QUESTION_MESSAGE));
//                if (size > 0){
//                    array = new int[size];
//                    creado = true;
//                }
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
//            }
//        }while(!creado);
        do {
            try {

                Object obj =  (JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo que necesita?", "Arreglo ", JOptionPane.QUESTION_MESSAGE));

                if (obj == null){
                    cancel = true;

                }else{
                    n = Integer.parseInt(obj.toString());
                    creado = true;
                   // array = new int[n];
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El input que ingreso no es valido.");
            }
        }while(!creado && !cancel);

        if (creado) {

            do {
                try {
                    Object opcionO = (JOptionPane.showInputDialog(null, "1. Agregar Numero\n" +
                            "2. Mostrar\n" +
                            "3. Salir\n" +
                            "Elige una Opcion", "Array", JOptionPane.QUESTION_MESSAGE));

                    if (opcionO == null) {
                        opcion = 3;
                    } else {
                        opcion = Integer.parseInt(opcionO.toString());
                    }

                    switch (opcion) {
                        case 1:
                            if (count < n){
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Agregar Numero", JOptionPane.QUESTION_MESSAGE));
                                array = addX(array.length, array, elemento);
                                count++;
                            }else
                                JOptionPane.showMessageDialog(null, "El arreglo esta lleno!");

                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, Arrays.toString(array));

                            break;

                        case 3:
                            JOptionPane.showMessageDialog(null, "Ejercicio Finalizado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion Incorrecta ", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El Input no es valido");
                }
            } while (opcion != 3);
        }




    }


    public static int[] addX(int n, int arr[], int x)
    {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

}
