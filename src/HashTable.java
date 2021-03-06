import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.util.*;

public class HashTable {



    static void main(){

        int opcion = 0, elemento, size;
        boolean creado = false;
        int[] array = new int[0];;
        int target = 0;
        int count = 0;
        boolean cancelar = false;

        do {
            try {
                JOptionPane.showMessageDialog(null, "" +
                        "PASO 1: Ingresar un numero deseado\n" +
                        "PASO 2: Agregar muchos numeros pero que por lo menos 2, al ser sumados den el numero deseado.\n" +
                        "PASO 3: Realizar la busqueda,y el sistema regresara esos dos numeros que sumen \n el numero deseado y sus posiciones dentro del arreglo" );
                Object targetO = (JOptionPane.showInputDialog(null, "Ingresa el numero deseado", "Agregar numero deseado", JOptionPane.QUESTION_MESSAGE));


                if (targetO == null){
                    cancelar = true;
                    creado = false;
                }else{
                    target = Integer.parseInt(targetO.toString());
                    creado = true;
                }



            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El input es invalido");
            }
        }while(!creado && !cancelar);

        if (creado) {

            do {
                try {
                    Object opcionO = (JOptionPane.showInputDialog(null, "1. Agregar Numero\n" +
                            "2. Mostrar\n" +
                            "3. Realizar Busqueda \n" +
                            "4. Salir\n" +
                            "Elige una Opcion", "Hash Table", JOptionPane.QUESTION_MESSAGE));

                    if (opcionO == null) {
                        opcion = 4;
                    } else {
                        opcion = Integer.parseInt(opcionO.toString());
                    }

                    switch (opcion) {
                        case 1:
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Agregar Numero", JOptionPane.QUESTION_MESSAGE));
                            array = addX(array, elemento);
                            count++;
                            break;
                        case 2:
                            if(count == 0){
                                JOptionPane.showMessageDialog(null, Arrays.toString(array));
                            }else{
                                JOptionPane.showMessageDialog(null, "El array esta vacio.");
                            }


                            break;
                        case 3:
                            try {
                                int[] res = twoSum(array, target);
                                JOptionPane.showMessageDialog(null,
                                        "Los valores estan en las posiciones: " + res[0] + ", " + res[1] +
                                                "\n y los valores son: " + array[res[0]] + ", " + array[res[1]]);
                            } catch (IllegalArgumentException e) {
                                JOptionPane.showMessageDialog(null, "No tiene resultado. \n No hay dos numeros que sumen el numero deseado");
                            }


                            break;

                        case 4:
                            JOptionPane.showMessageDialog(null, "Ejercicio Finalizado");
                            break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El input no es valido");
                }
            } while (opcion != 4);
        }





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
