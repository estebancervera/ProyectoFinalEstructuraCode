import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Burbuja {

    public  static void main(){

        int opcion = 0, elemento;
        ArrayList<Integer> lista = new ArrayList<>();


        do {
            try {
                Object opcionO = (JOptionPane.showInputDialog(null, "1. Agregar Numero\n" +
                        "2. Mostrar\n" +
                        "3. Ordenar\n" +
                        "4. Salir\n" +
                        "Elige una Opcion", "Burbuja", JOptionPane.QUESTION_MESSAGE));

                if (opcionO == null){
                    opcion = 4;
                }else{
                    opcion = Integer.parseInt(opcionO.toString());
                }


                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Agregar Numero", JOptionPane.QUESTION_MESSAGE));
                        lista.add(elemento);
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, lista.toString() );

                        break;

                    case 3:
                        Integer[] ordenado = Burbuja.burbuja(Arrays.copyOf(lista.toArray(),lista.toArray().length, Integer[].class));
                        JOptionPane.showMessageDialog(null, Arrays.toString(ordenado) );
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta ","Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch( NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El Input no es valido");
            }
        }while(opcion != 4);




    }




    public static Integer[] burbuja(Integer[] arreglo){
        int intercambios = 0, comparaciones = 0;

        int aux = 0;
        for(int i = 1; i<arreglo.length; i++){
            for(int j= arreglo.length-1; j>=i; j-- ){
                comparaciones++;
                if (arreglo[j-1]>arreglo[j]){
                    intercambios++;
                    aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        //System.out.println("Numero de intercambios:"+intercambios);
        //System.out.println("Numero de comparaciones:"+comparaciones);
        return arreglo;
    }

}
