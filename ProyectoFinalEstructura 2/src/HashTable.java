import javax.swing.*;
import java.util.*;

public class HashTable {



    static void main(){

        int opcion = 0, elemento, size, target = 0;
        boolean creado = false;
        int[] array = new int[0];;

        do {
            try {
                JOptionPane.showMessageDialog(null, "Ingrese un Array y un Target, y el codigo regresara los indeces de 2 valores que suman ese Target" );
                target = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Target", "Crear Target", JOptionPane.QUESTION_MESSAGE));

                creado = true;


            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(!creado);



        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Numero\n" +
                        "2. Mostrar\n" +
                        "3. Realizar \n" +
                        "4. Salir\n" +
                        "Elige una Opcion", "Hash Table", JOptionPane.QUESTION_MESSAGE));


                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Agregar Numero", JOptionPane.QUESTION_MESSAGE));
                        array = addX( array,elemento);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, Arrays.toString(array) );

                        break;
                    case 3:
                        try {
                           int[] res =  twoSum(array, target);
                            JOptionPane.showMessageDialog(null,
                                    "Los valores estan en las posiciones: " + res[0] + ", " + res[1] +
                                    "\n y los valores son: " + array[res[0]] + ", " + array[res[1]] );
                        }catch(IllegalArgumentException e){
                            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                        }


                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, "Ejercicio Finalizado" );
                        break;
                }
            }catch( NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion != 4);





    }

    public static int[] addX( int arr[], int x)
    {
        int i;

        int n = arr.length;

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

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);

        }
        throw new IllegalArgumentException("No tiene solucion");
    }



}
