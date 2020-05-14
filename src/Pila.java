import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public  class Pila {


    public static void main(){



        Stack<String> stack = new Stack<String>();
        int opcion = 0;
        String elemento = "";

        do {

            try {
                Object opcionO = (JOptionPane.showInputDialog(null,
                        "1. Push\n" +
                        "2. Pop\n" +
                        "3. Peek\n" +
                        "4. Buscar\n" +
                        "5. Mostrar\n" +
                        "6. Salir\n" +

                        "Elige una Opcion", "Pila", JOptionPane.QUESTION_MESSAGE));
                if (opcionO == null) {
                    opcion = 6;
                } else {
                    opcion = Integer.parseInt(opcionO.toString());
                }

                switch (opcion) {
                    case 1:
                        elemento = (JOptionPane.showInputDialog(null, "Ingresa una palabra", "Agregar Palabra", JOptionPane.QUESTION_MESSAGE));
                        stack.push(elemento);
                        break;
                    case 2:
                        if(!stack.isEmpty()){
                            JOptionPane.showMessageDialog(null, "La palabra eliminada fue: " + stack.pop() + ".\nYa que esta era la de hasta arriba.");
                        }else
                        JOptionPane.showMessageDialog(null, "La pila esta vacia");

                        break;

                    case 3:
                        if(!stack.isEmpty()){
                            JOptionPane.showMessageDialog(null, "La palabra de hasta arriba es: " + stack.peek() );
                        }else
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        break;
                    case 4:
                        if(!stack.isEmpty()){
                            elemento = (JOptionPane.showInputDialog(null, "Ingresa una palabra", "Agregar Palabra", JOptionPane.QUESTION_MESSAGE));
                            int x = stack.search(elemento);
                            if (x > 0){
                                JOptionPane.showMessageDialog(null, "La palabra : " + elemento + " se enecuntra en la posicion: " + x + " .");
                            }else
                                JOptionPane.showMessageDialog(null, "La palabra : " + elemento + "  no se enecuntra en la pila");

                        }else
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        break;
                    case 5:
                        if(!stack.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Las palabras en la pila son: " + stack.toString() );
                        }else
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");

                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Ejercicio Finalizado" );
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta ", "Error", JOptionPane.INFORMATION_MESSAGE);

                }


            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El input no es valido");
            }

        }while(opcion != 6);







//        do{
//            System.out.println("[1] Push");
//            System.out.println("[2] Pop");
//            System.out.println("[3] Peek");
//            System.out.println("[4] Search");
//            System.out.println("[5] Salir");
//            System.out.println("Selecciona una opcion");
//
//            int selected = scan.nextInt();
//            scan.nextLine();
//
//            switch (selected){
//                case 1:
//                    System.out.println("Ingresa una palabra para agregar");
//                    String word = scan.nextLine();
//
//                    break;
//                case 2:
//                    if(!stack.isEmpty()) {
//                        String wordPopped = stack.pop();
//                        System.out.println("La palabra eliminada fue: " + wordPopped);
//                    }else
//                        System.out.println("El stack esta vacio!");
//                    break;
//                case 3:
//                    if(!stack.isEmpty()) {
//                        String wordPeek = stack.peek();
//                        System.out.println("La palabra de hasta arriba es: " + wordPeek);
//                    }else
//                        System.out.println("El stack esta vacio!");
//                    break;
//                case 4:
//                    if(!stack.isEmpty()) {
//                        System.out.println("Que palabra quieres buscar?");
//                        String wordSearch = scan.nextLine();
//                        int x = stack.search(wordSearch);
//                        System.out.println("La palabra se encuentra en la posicion: " + x);
//                    }else
//                        System.out.println("El stack esta vacio!");
//                    break;
//                case 5:
//                    seguir = false;
//                    System.out.println(stack);
//                    break;
//            }
//
//
//
//        }while(seguir);

    }


}
