import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Cola {


    public static void main() {

        int opcion = 0, elemento;

        Scanner scan = new Scanner(System.in);

        Queue<Integer> cola = new LinkedList<>();

        do{

            try{
                Object opcionO = (JOptionPane.showInputDialog(null, "1. Agregar Numero\n" +
                        "2. Eliminar la cabeza de la cola\n" +
                        "3. Mostrar la cabeza de la cola\n" +
                        "4. Iterar los elementos de la cola\n" +
                        "5. Tamaño de la cola\n" +
                        "6. Eliminar todos los elementos de la cola\n" +
                        "7. Salir\n" +

                        "Elige una Opcion", "Cola", JOptionPane.QUESTION_MESSAGE));
                if (opcionO == null){
                    opcion = 7;
                }else{
                   opcion = Integer.parseInt(opcionO.toString());
                }

                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Agregar Numero", JOptionPane.QUESTION_MESSAGE));
                        cola.add(elemento);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El numero que se elimino fue: " + cola.poll() );
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "El numero a la cabeza de la cola es: " + cola.peek() );
                        break;
                    case 4:
                        String todos = "";
                        for(int element : cola) {
                            todos += element + ", ";
                        }
                        JOptionPane.showMessageDialog(null, todos );
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño a la cabeza de la cola es: " + cola.size() );
                        break;
                    case 6:
                        cola.clear();
                        JOptionPane.showMessageDialog(null, "Los elementos han sido eliminados!" );
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Ejercicio Finalizado" );
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta ","Error", JOptionPane.INFORMATION_MESSAGE);

                }



            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El Input no es valido");
            }
//            System.out.println("[1] Add");
//            System.out.println("[2] Remove");
//            System.out.println("[3] Peek");
//            System.out.println("[4] Salir");
//            System.out.println("Selecciona una opcion");
//
//            int selected = scan.nextInt();
//            scan.nextLine();
//
//            switch (selected){
//                case 1:
//                    System.out.println("Ingresa una palabra para agregar");
//                    String word = scan.nextLine();
//                    cola.add(word);
//                    break;
//                case 2:
//                    if(!cola.isEmpty()) {
//                        String wordPopped = cola.poll();
//                        System.out.println("La palabra eliminada fue: " + wordPopped);
//                    }else
//                        System.out.println("La cola esta vacia!");
//                    break;
//                case 3:
//                    if(!cola.isEmpty()) {
//                        String wordPeek = cola.peek();
//                        System.out.println("La palabra de hasta arriba es: " + wordPeek);
//                    }else
//                        System.out.println("La cola esta vacia!");
//                    break;
//                case 4:
//                    seguir = false;
//                    System.out.println(cola);
//                    break;
//            }



        }while(opcion != 7);

    }





}
