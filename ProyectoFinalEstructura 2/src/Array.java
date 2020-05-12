import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public  static void main(){

        int opcion = 0, elemento, size;
        boolean creado = false;
        int[] array = new int[0];

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
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Numero\n" +
                        "2. Mostrar\n" +
                        "3. Salir\n" +
                        "Elige una Opcion", "Array", JOptionPane.QUESTION_MESSAGE));


                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Agregar Numero", JOptionPane.QUESTION_MESSAGE));
                        array = addX(array.length, array,elemento);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, Arrays.toString(array) );

                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Ejercicio Finalizado" );
                        break;
                }
            }catch( NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion != 3);




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
