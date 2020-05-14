import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListaCircular {

    public class Nodo{
        int dato;
        Nodo next;
        public Nodo(int dato){
            this.dato = dato;
        }
    }

    public Nodo head = null;
    public Nodo tail = null;

    public void add(int dato){
        Nodo nuevoNodo = new Nodo(dato);

        if (head == null){
            head = nuevoNodo;
            tail = nuevoNodo;
            nuevoNodo.next = head;
        }
        else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
            tail.next = head;
        }
    }

    public boolean estaVacia(){
        return head == null;
    }

    public String mostrar() {
        Nodo current = head;
        String result = "";
        if (estaVacia()) {
           return "La lista esta vacia";
        } else {
           result += "Elementos en la lista: ";
            do {
                result += ("\n--" + current.dato + "--");
                current = current.next;
            } while (current != head);
            return result;
        }
    }
        public static void main(){
            ListaCircular lista = new ListaCircular();

            int opcion = 0, elemento;

            do {
                try {
                    Object opcionO = (JOptionPane.showInputDialog(null,
                            "1. Agregar Dato\n" +
                            "2. Mostrar Lista\n" +
                            "3. Salir\n" +
                            "Elige una Opcion", "Lista", JOptionPane.QUESTION_MESSAGE));

                    if (opcionO == null){
                        opcion =3;
                    }else{
                        opcion = Integer.parseInt(opcionO.toString());
                    }

                    switch (opcion) {
                        case 1:
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Agregar Numero", JOptionPane.QUESTION_MESSAGE));
                            lista.add(elemento);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, lista.mostrar() );

                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Ejercicio Finalizado" );
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opcion Incorrecta ","Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch( NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "El input no es valido");
                }
            }while(opcion != 3);

        }


}
