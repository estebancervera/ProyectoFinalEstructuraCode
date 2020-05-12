import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Cola {


    public static void main() {

        boolean seguir =  true;
        Scanner scan = new Scanner(System.in);

        Queue<String> cola = new LinkedList<>();

        do{
            System.out.println("[1] Add");
            System.out.println("[2] Remove");
            System.out.println("[3] Peek");
            System.out.println("[4] Salir");
            System.out.println("Selecciona una opcion");

            int selected = scan.nextInt();
            scan.nextLine();

            switch (selected){
                case 1:
                    System.out.println("Ingresa una palabra para agregar");
                    String word = scan.nextLine();
                    cola.add(word);
                    break;
                case 2:
                    if(!cola.isEmpty()) {
                        String wordPopped = cola.poll();
                        System.out.println("La palabra eliminada fue: " + wordPopped);
                    }else
                        System.out.println("La cola esta vacia!");
                    break;
                case 3:
                    if(!cola.isEmpty()) {
                        String wordPeek = cola.peek();
                        System.out.println("La palabra de hasta arriba es: " + wordPeek);
                    }else
                        System.out.println("La cola esta vacia!");
                    break;
                case 4:
                    seguir = false;
                    System.out.println(cola);
                    break;
            }



        }while(seguir);

    }





}
