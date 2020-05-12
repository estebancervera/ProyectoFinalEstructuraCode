import java.util.Scanner;
import java.util.Stack;

public  class Pila {


    public static void main(){

        boolean seguir =  true;
        Scanner scan = new Scanner(System.in);

        Stack<String> stack = new Stack<String>();

        do{
            System.out.println("[1] Push");
            System.out.println("[2] Pop");
            System.out.println("[3] Peek");
            System.out.println("[4] Search");
            System.out.println("[5] Salir");
            System.out.println("Selecciona una opcion");

            int selected = scan.nextInt();
            scan.nextLine();

            switch (selected){
                case 1:
                    System.out.println("Ingresa una palabra para agregar");
                    String word = scan.nextLine();
                    stack.push(word);
                    break;
                case 2:
                    if(!stack.isEmpty()) {
                        String wordPopped = stack.pop();
                        System.out.println("La palabra eliminada fue: " + wordPopped);
                    }else
                        System.out.println("El stack esta vacio!");
                    break;
                case 3:
                    if(!stack.isEmpty()) {
                        String wordPeek = stack.peek();
                        System.out.println("La palabra de hasta arriba es: " + wordPeek);
                    }else
                        System.out.println("El stack esta vacio!");
                    break;
                case 4:
                    if(!stack.isEmpty()) {
                        System.out.println("Que palabra quieres buscar?");
                        String wordSearch = scan.nextLine();
                        int x = stack.search(wordSearch);
                        System.out.println("La palabra se encuentra en la posicion: " + x);
                    }else
                        System.out.println("El stack esta vacio!");
                    break;
                case 5:
                    seguir = false;
                    System.out.println(stack);
                    break;
            }



        }while(seguir);

    }


}
