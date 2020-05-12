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


    public void mostrar() {
        Nodo current = head;
        if (head == null) {
            System.out.println("La lista circular esta vacia");
        } else {
            System.out.println("Elementos en la lista: ");
            do {
                System.out.print(" " + current.dato);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }
        public static void main(){
            ListaCircular lista = new ListaCircular();
            Scanner scan = new Scanner(System.in);

            System.out.println("Cuantos elementos quieres en la lista?");
            int numero = safetyInt( scan.nextLine());

            lista.mostrar();
            for (int i = 0; i < numero; i++) {
                lista.add(i);
            }
            lista.mostrar();


        }

    private static int safetyInt(String str) {
        int num = 0;

        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException var4) {
        }

        return num;
    }




}
