import java.util.Scanner;
import java.util.Vector;

public class Vectors {

    public static void main() {
        int selection;
        Scanner scan = new Scanner(System.in);
        Boolean keepAsking = true;

        Vector vector = new Vector();


        while (keepAsking) {

            System.out.println("Que desea hacer?:");
            System.out.println("Insertar una palabra --------- 1");
            System.out.println("Accesar una palabra ---------- 2");
            System.out.println("Eliminar una palabra --------- 3");
            System.out.println("Busqueda de una palabra ------ 4");
            System.out.println("Salir ------------------------ 5");

            selection = scan.nextInt();

            scan.nextLine();


            switch (selection) {
                case 1:
                    System.out.println("Escribe la palabra");
                    String palabra = scan.nextLine();
                    vector.add(palabra);


                    break;

                case 2:
                    System.out.println("Escribe la posicion de la palabra");
                    int posicion = scan.nextInt();
                    System.out.println("La palabra: " + vector.get(posicion) + " esta en la posicion: " + posicion);
                    scan.nextLine();


                    break;


                case 3:

                    System.out.println("Escribe la posicion de la palabra");
                    int posicionE = scan.nextInt();
                    vector.removeElementAt(posicionE);

                    break;


                case 4:
                    System.out.println("Escribe la palabra");
                    String palabra2 = scan.nextLine();
                    System.out.println("La palabra: " + palabra2 + " esta en la posicion: " + vector.indexOf(palabra2));

                    break;

                case 5:
                    keepAsking = false;
                    break;


                default:


            }
        }
    }
}

